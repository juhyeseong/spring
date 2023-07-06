package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.YoutubeDTO;
import com.itbank.service.YoutubeService;

@Controller
@RequestMapping("/youtube")
public class YoutubeController {
	@Autowired private YoutubeService youtubeService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<YoutubeDTO> list = youtubeService.selectList();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(YoutubeDTO dto) {
		int row = youtubeService.insert(dto);
		
		System.out.println(row + "행이 추가되었습니다 ~ ");
		
		return "redirect:" + (row != 0 ? "/youtube/list" : "/youtu/add");
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("youtube/view");
		YoutubeDTO dto = youtubeService.selectOne(idx);
		
		mav.addObject("dto", dto);
		
		return mav;
	}
	
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("youtube/modify");
		YoutubeDTO dto = youtubeService.selectOne(idx);
		
		mav.addObject("dto", dto);
	
		return mav;
	}
	
	@PostMapping("/modify/{idx}")
	public String modify(YoutubeDTO dto) {
		int row =  youtubeService.update(dto);
		
		System.out.println(row + "행이 수정되었습니다 ~ ");
		
		return "redirect:" + (row != 0 ? "/youtube/view/" + dto.getIdx() : "/youtube/modify/" + dto.getIdx());
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx") int idx) {
		int row = youtubeService.delete(idx);

		System.out.println(row + "행이 삭제되었습니다 ~ ");
		
		return "redirect:" + (row != 0 ? "/youtube/list" : "/youtube/view/" + idx);
	}
}
