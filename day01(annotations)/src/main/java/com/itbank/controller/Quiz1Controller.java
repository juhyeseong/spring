package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quiz1")
public class Quiz1Controller {
	@GetMapping
	public void quiz1() {}
	
	@PostMapping
	public ModelAndView quiz1(@RequestParam("name") String name, int age) {
		// @RequestParam("name") == request.getParameter("name")
		// primitive, String 및 Date 에 대해서는 생략이 가능하다
		// HashMap<String, String> 으로 파라미터를 몰아서 받는 것도 가능한데
		// 이때는 반드시 @RequestParam 어노테이션을 명시해야 한다
		ModelAndView mav = new ModelAndView("quiz1-result");
		String adult = age >= 20 ? "성인" : "미성년자";
		
		mav.addObject("adult", adult);
		
		return mav;
	}
}
