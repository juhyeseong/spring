package com.itbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 클래스를 갓 만들었다면 서버를 재실행하자
@Controller
public class Ex01Controller {
	@RequestMapping(value="/ex01", method=RequestMethod.GET)
	public String ex01() {
		return "ex01";
	}
	
	@RequestMapping(value="/ex01", method=RequestMethod.POST)
	public String ex01(HttpServletRequest request) {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int answer = n1 + n2;
		
		request.setAttribute("answer", answer);
		
		return "ex01-result";
	}
}
