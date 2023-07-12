package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/youtube_list")
public class YoutubeController {
	@GetMapping({"/", ""})
	public String list() {
		return "youtube_list/list";
	}
}