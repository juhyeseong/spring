package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	// 요청을 받아서 처리하고, 응답을 만들어서 돌려준다
	@RequestMapping("/")		// http://localhost:8080/day01/
	public String home() {
		return "home";
	}
}
