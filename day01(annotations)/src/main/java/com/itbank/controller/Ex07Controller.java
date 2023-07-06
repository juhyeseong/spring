package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itbank.model.Ex06DTO;

@Controller
public class Ex07Controller {
	@GetMapping("/ex07")
	public String ex07() {
		return "ex06";
	}
	
	@PostMapping("/ex07")
	public String ex07(Ex06DTO dto, HttpSession session) {
		session.setAttribute("login", dto);
		// 새로운 요청이 만들어져도 session에 저장한 값은 사라지지 않는다
		// 일반적인 반환 문자열은 viewName이므로, forward할 jsp를 찾지만
		// 리다이렉트는 jsp의 이름이 아니라, 주소창에 입력되는 요청주소를 의미한다
		return "redirect:/ex07";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
}
