package com.itbank.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//select sysdate from dual

import com.itbank.service.TestService;

@Controller
public class HomeController {
	@Autowired private TestService testService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		Date today = testService.getSysdate();
		
		mav.addObject("today", today);
		
		return mav;
	}
}
