package com.itbank.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itbank.model.Ex03DTO;

@Controller
public class Ex03Controller {
	File dir = new File("D:\\test0704");
	
	public Ex03Controller() {
		if(dir.exists() == false) {
			dir.mkdir();
		}
	}
	
	@GetMapping("/ex03")
	public void ex03() {}
	
	@PostMapping("/ex03")
	public String ex03(Ex03DTO dto) throws IllegalStateException, IOException {
		System.out.println(dto);
		File dest = new File(dir, dto.getUpload().getOriginalFilename());
		
		dto.getUpload().transferTo(dest);
		
		return "redirect:/ex03";
	}
}
