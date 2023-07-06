package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.itbank.model.Ex06DTO;

@Controller
public class Ex06Controller {
	@GetMapping("/ex06")
	public void ex06() {}
	
	@PostMapping("/ex06")
	public String ex06(@ModelAttribute("login") Ex06DTO login) {
		// @ModelAttribute("login") : 파라미터로 전달받은 객체를 model.addAttribute로 처리한다
		return "ex06";
	}
}
