package com.itbank.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ProjectExceptionAdvice {
	@ExceptionHandler(Exception.class)						// 예외 처리를 수행하는 메서드
	public ModelAndView ex(Exception e) {					// 예외 객체를 매개변수로 받는다
		ModelAndView mav = new ModelAndView("alert");		// 클라이언트에게 알려주는건 보안상 좋지 않다
		String msg = "처리 도중 문제가 발생했습니다\\n";
		msg += "지속적으로 문제가 발생하면 관리자에게 알려주시기 바랍니다 ~ ";
		
		mav.addObject("msg", msg);
		mav.addObject("url", "/");
		
		return mav;
	}
}
