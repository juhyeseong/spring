package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex05Controller {
	@GetMapping("/ex05")
	public ModelAndView ex05() {
		// ModelAndView를 반환할 때 viewName을 지정하지 않으면 void와 동일하게 작동한다
		ModelAndView mav = new ModelAndView();
		String[] arr = {
			"java", "C#", "Python", "js", "php"	
		};
		
		mav.addObject("arr", arr);
		
		return mav;
	}
								// pathVariable
	@GetMapping("/ex05/{idx}")	// 주소에서 {} 로 묶인 구간을 idx 라고 할 때
								// 경로 구간 idx의 값을 int idx에 넣어서 매개변수로 활용한다
	public ModelAndView ex05(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("ex05-result");
		String[] arr = {
				"java Spring", "C# .NET", "Python DJANGO", "Node.js", "php"	
		};
		
		mav.addObject("content", arr[idx]);
		
		return mav;
	}
}
