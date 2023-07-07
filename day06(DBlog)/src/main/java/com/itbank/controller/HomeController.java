package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.YoutubeDTO;
import com.itbank.service.TestService;


@Controller
public class HomeController {
	
	@Autowired private TestService testService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		String version = testService.getVersion();
		
		mav.addObject("version", version);
		
		return mav;
	}
	
	@PostMapping("/")
	public String home(YoutubeDTO dto) {
		int row = testService.insert(dto);
		
		System.out.println(row + "행을 추가했습니다 ~ ");
		
		return "home";
	}
}
