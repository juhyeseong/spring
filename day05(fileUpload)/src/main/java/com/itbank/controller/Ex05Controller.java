package com.itbank.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itbank.model.Ex05DTO;

@Controller
public class Ex05Controller {
	@GetMapping("/ex05")
	public void ex05() {}
	
	@PostMapping("/ex05")
	public String ex05(Ex05DTO dto) {
		System.out.println(dto.getTitle());
		dto.getUpload().forEach(f -> System.out.println(f.getOriginalFilename()));
		
		dto.getUpload().forEach(f -> {
			File dest = new File("D:\\test0704", f.getOriginalFilename());
			try {
				f.transferTo(dest);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		});
		
		return "redirect:/ex05";
	}
}
