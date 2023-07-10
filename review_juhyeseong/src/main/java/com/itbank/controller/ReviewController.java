package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MemberDTO;
import com.itbank.model.ReviewDTO;
import com.itbank.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
	@Autowired private ReviewService service;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<ReviewDTO> list = service.selectAll();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("/searchList")
	public ModelAndView searchList(String search) {
		ModelAndView mav = new ModelAndView("/review/list");
		List<ReviewDTO> list = service.searchList(search);
		Double avg = 0.0;
		
		if(list != null) {
			for(ReviewDTO dto : list) {
				avg += dto.getGrade();
			}
			avg /= list.size();
		}
		mav.addObject("list", list);
		mav.addObject("avg", avg);
		
		return mav;
	}
	
	@GetMapping("/add")
	public String add() {
		return "/review/add";
	}
	
	@PostMapping("/add")
	public ModelAndView add(ReviewDTO dto) {
		ModelAndView mav = new ModelAndView("alert");
		int row = service.insert(dto);
		String msg = row != 0 ? "추가 성공 ~ " : "추가 실패 ~ ";
		String url = row != 0 ? "/review/list" : "/review/add";
		
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("review/view");
		ReviewDTO dto = service.selectOne(idx);
		dto.setFilePath(service.selectFiles(idx));
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		MemberDTO login = ((MemberDTO)session.getAttribute("login"));
		ReviewDTO dto = service.selectOne(idx);
		dto.setFilePath(service.selectFiles(idx));
		
		if(login.getUserNick().equals(dto.getWriterNick())) {
			mav.setViewName("review/modify");
			mav.addObject("dto", dto);
		}
		else {
			mav.setViewName("/alert");
			mav.addObject("msg", "본인계정의 게시물만 수정할 수 있습니다 ~ ");
			mav.addObject("url", "/review/view/" + idx);
		}
		
		return mav;
	}
	
	@PostMapping("modify/{idx}")
	public ModelAndView modify(ReviewDTO dto) {
		ModelAndView mav = new ModelAndView("alert");
		int row = service.update(dto);
		String msg = row != 0 ? "수정 성공 ~ " : "수정 실패 ~ ";
		String url = row != 0 ? "/review/view/" + dto.getIdx() : "/review/modify/" + dto.getIdx();
		
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	@GetMapping("delete/{idx}")
	public ModelAndView delete(@PathVariable("idx") int idx, HttpSession session) {
		ModelAndView mav = new ModelAndView("/alert");
		MemberDTO login = ((MemberDTO)session.getAttribute("login"));
		ReviewDTO dto = service.selectOne(idx);
		
		if(login.getUserNick().equals(dto.getWriterNick())) {
			int row = service.delete(idx);
			
			String msg = row != 0 ? "삭제 성공 ~ " : "삭제 실패 ~ ";
			String url = row != 0 ? "/review/list/" : "/review/modify/" + idx;
			
			mav.addObject("msg", msg);
			mav.addObject("url", url);
		}
		else {
			mav.addObject("msg", "본인계정의 게시물만 삭제할 수 있습니다 ~ ");
			mav.addObject("url", "/review/view/" + idx);
		}
		
		return mav;
	}
}
