package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MemberDTO;
import com.itbank.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired private MemberService service;
	
	@GetMapping("/join")
	public void join() {}
	
	@PostMapping("/join")
	public ModelAndView join(MemberDTO dto) {
		ModelAndView mav = new ModelAndView("alert");
		int row = service.join(dto);
		String msg = row != 0 ? "회원가입이 완료되었습니다 ~ " : "회원가입 실패 ~ ";
		String url = row != 0 ? "/member/login" : "/member/join";
		
		System.out.println(row + "행이 추가되었습니다 ~ ");
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public ModelAndView login(MemberDTO dto, HttpSession session) {
		ModelAndView mav = new ModelAndView("alert");
		MemberDTO login = service.login(dto);
		String msg = login != null ? login.getUserNick() + "님 환영합니다 ~ " : "로그인 실패했습니다 ~ ";
		String url = "";
		if(login != null) {
			url = dto.getUrl() != null ? dto.getUrl() : "/";
		}
		else {
			url = "/member/login";
		}
		
		session.setAttribute("login", login);
		session.setMaxInactiveInterval(300);
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView("alert");
		String msg = "로그아웃되었습니다 ~ ";
		String url = "/";
		
		session.invalidate();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
				
		return mav;
	}
	
	@GetMapping("/modify/{idx}")
	public String modify() {
		return "/member/modify";
	}
	
	@PostMapping("/modify/{idx}")
	public ModelAndView modify(MemberDTO dto, HttpSession session) {
		ModelAndView mav = new ModelAndView("alert");
		int row = service.update(dto);
		String msg = row != 0 ? "회원님의 정보가 수정되었습니다 ~ " : "회원님의 정보 수정이 실패했습니다 ~ ";
		String url = row != 0 ? "/" : "/member/modify";
		
		if(row != 0) {
			MemberDTO login = service.login(dto);
			
			session.setAttribute("login", login);
			session.setMaxInactiveInterval(300);
		}
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable("idx") int idx, HttpSession session) {
		ModelAndView mav = new ModelAndView("alert");
		int row = service.delete(idx);
		String msg = row != 0 ? "탈퇴가 완료되었습니다 ~ " : "탈퇴 실패하였습니다 ~ ";
		String url = "/";
		
		if(row != 0) {
			session.invalidate();
		}
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
}
