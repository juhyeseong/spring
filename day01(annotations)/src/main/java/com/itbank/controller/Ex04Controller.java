package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.Ex04DTO;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	@GetMapping
	public void ex04() {}
	
	@PostMapping							// <jsp:useBean> + <jsp:setProperty>
	public ModelAndView ex04(Ex04DTO dto) {	// <input>의 name과 클래스의 필드 이름이 같아야 한다
		ModelAndView mav = new ModelAndView("ex04-result");
		int n1 = dto.getN1();
		int n2 = dto.getN2();
		
		dto.setAnswer(n1 + n2);
		if(dto.getAnswer() == 0) {
			mav.setViewName("redirect:/");	// contextPath는 제외한다
		}
		mav.addObject("dto", dto);
		
		return mav;
	}
}
