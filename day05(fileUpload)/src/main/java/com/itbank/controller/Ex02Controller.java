package com.itbank.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Ex02Controller {
	File dir = new File("D:\\test0704");
	
	public Ex02Controller() {
		if(dir.exists() == false) {
			dir.mkdir();
		}
	}
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
//					  (MultipartRequest request)
	public String ex02(MultipartFile file) throws IllegalStateException, IOException {
		File dest = new File(dir, file.getOriginalFilename());
	
		file.transferTo(dest);
		
//		MultipartFile file = request.getFile("file");			// input의 name으로 지정한다
//		File dir = new File("D:\\test0704");					// 파일 업로드 위치를 먼저 지정한다
//		
//		if(dir.exists() == false) {
//			dir.mkdir();
//		}
//		
//		File dest = new File(dir, file.getOriginalFilename());	// 원본 파일 이름 그대로 사용
//		
//		file.transferTo(dest);
	
		return "redirect:/ex02";
	}
}
