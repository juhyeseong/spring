package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 	컨트롤러 메서드의 반환형
 	
 	String		: forward할 jsp의 이름을 반환한다.
 			  	  prefix + viewName + suffix 형태로 구성되어 포워드한다
	
	void		: 별도의  viewName을 반환하지 않는다.
				    요청 주소의 문자열을 그대로 viewName으로 활용한다
				  (주소와 jsp이름은 같고, attribute를 넘길 필요가 없을 때 사용한다)
	
	ModelAndView: String으로 반환하는 viewName과
				  JSP에게 넘겨주는 attribute를 담는 Model을 한번에 묶어서 반환한다
				  viewName은 생성자 매개변수로 전달하거나, setViewName(String viewName)을 활용한다
*/

@Controller								// 이 클래스는 컨트롤러 입니다
@RequestMapping("/ex03")		// "/ex03"주소로 요청되는 모든 내용을 처리합니다
public class Ex03Controller {	
	@GetMapping						// 만약 메서드가 GET 이면 아래 함수를 실행합니다
	public void ex03() {}				// 반환형이 vodi인 경우, 요청 주소를 viewName으로 사용하여 forwoard합니다
	
	@PostMapping
	public ModelAndView ex03(int n1, int n2) {
		// 반환형이 ModelAndView이면
		// viewName과 attribute를 함께 보냅니다
		ModelAndView mav = new ModelAndView("ex03-result");
		
		mav.setViewName("ex03-result");
		mav.addObject("answer", n1 + n2);
		
		return mav;
	}
}
