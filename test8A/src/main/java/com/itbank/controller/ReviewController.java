package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ReviewDTO;
import com.itbank.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
	@Autowired private ReviewService service;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<ReviewDTO> list = service.selectAll();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public ModelAndView add(ReviewDTO dto) {
		ModelAndView mav = new ModelAndView("alert");
		int row = service.insert(dto);
		String msg = row != 0 ? "리뷰 작성이 완료되었습니다 ~ " : "리뷰 작성에 실패하였습니다 ~ ";
		String url = row != 0 ? "/review/list" : "/review/add";
		
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("review/view");
		ReviewDTO review = service.selectOne(idx);
		
		mav.addObject("review", review);
		
		return mav;
	}
}
