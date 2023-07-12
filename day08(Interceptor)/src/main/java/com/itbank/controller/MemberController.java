package com.itbank.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.exception.TooShortPasswordException;

@Controller
@RequestMapping("/member")
public class MemberController {
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(@RequestParam HashMap<String, String> param,
					    HttpSession session) throws IOException, TooShortPasswordException {
		// 비밀번호의 길이를 체크하여 비밀번호가 4자 미만이면 예외를 발생시킨다
		String url = param.get("url");
		String userPw = param.get("userPw");
		
		if(userPw == null || userPw.length() < 4) {
			throw new TooShortPasswordException(userPw.length());
		}
		
		session.setAttribute("login", param);
		session.setMaxInactiveInterval(300);
		if(url == null) {
			return "redirect:/";
		}
		else {
			url = URLDecoder.decode(url, "UTF-8");
			param.remove("url");
			
			return "redirect:" + url;
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
}
