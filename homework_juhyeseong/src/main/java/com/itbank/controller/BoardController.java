package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.BoardService;

@Controller
public class BoardController {
	@Autowired BoardService boardService;
	
	@RequestMapping("/")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("list");
		List<BoardDTO> list = boardService.getList();
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("/searchList")
	public ModelAndView searchList(String search) {
		ModelAndView mav = new ModelAndView("list");
		List<BoardDTO> list = boardService.searchList(search);
		
		mav.addObject("list", list);
		
		return mav;
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		BoardDTO board = boardService.getBoard(idx);
		
		mav.addObject("board", board);
		
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(BoardDTO dto) {
		int row = boardService.insert(dto);
		
		return "redirect:" + (row != 0 ? "/" : "/add");
	}
	
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("modify");
		BoardDTO board = boardService.getBoard(idx);
		
		mav.addObject("board", board);
		
		return mav;
	}
	
	@PostMapping("/modify/{idx}")
	public String modify(BoardDTO dto) {
		int row = boardService.update(dto);
		
		return "redirect:" + (row != 0 ? "/view/" + dto.getIdx() : "/modify/" + dto.getIdx());
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx") int idx) {
		int row = boardService.delete(idx);
		
		return "redirect:" + (row != 0 ? "/" : "/view/" + idx);
	}
}
