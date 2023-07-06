package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex02Controller {
	// spring 4.1.0부터 지원되는 단축 어노테이션
	@GetMapping("/ex02")	// @RequestMapping(value="/ex02", method=RequestMethod.GET)
	public String ex02() {
		return "ex02";
	}
	
	@PostMapping("/ex02")	// <input>태그의 name과 파라미터 변수의 이름을 일치시키면 된다
	public String ex02(int n1, int n2, Model model) {	// parameter
		int answer = n1 + n2;
		
		// request.setAttribute("answer", answer);		
		model.addAttribute("answer", answer);			// attribute
		
		return "ex02-result";
	}
}
