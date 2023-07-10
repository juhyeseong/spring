package com.itbank.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.UploadDTO;
import com.itbank.service.TestService;
import com.itbank.service.UploadService;

@Controller
public class HomeController {
	@Autowired private TestService testService;
	@Autowired private UploadService uploadService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		String version = testService.getVersion();
		List<UploadDTO> list = uploadService.selectAll();
		
//		list.forEach(dto -> {
//			System.out.println(dto.getTitle());
//			String[] arr = dto.getFilePath().split(",");
//			for(String s : arr) {
//				System.out.println(s);
//			}
//			System.out.println();
//		});
		mav.addObject("version", version);
		mav.addObject("list", list);
		
		return mav;
	}
}
