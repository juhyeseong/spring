package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.YoutubeDTO;
import com.itbank.repository.YoutubeDAO;

@Service
public class YoutubeService {
	@Autowired private YoutubeDAO dao;

	public List<YoutubeDTO> selectList() {
		List<YoutubeDTO> list = dao.selectAll();
		
		list.forEach(dto -> {
			String title = dto.getTitle();
			
			if(title.length() > 25) {
				dto.setTitle(title.substring(0, 25) + "...");
			}
		});
		
		return list;
	}

	public YoutubeDTO selectOne(int idx) {
		YoutubeDTO dto = dao.selectOne(idx);
		
		dto.setTitle(dto.getTitle().replace("\"", "&#34;"));
		
		return dto;
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	public int add(YoutubeDTO dto) {
		return dao.add(dto);
	}

	public int update(YoutubeDTO dto) {
		return dao.update(dto);
	}

	public List<YoutubeDTO> searchList(String search) {
		List<YoutubeDTO> list = dao.searchList(search);
		
		list.forEach(dto -> {
			String title = dto.getTitle();
			
			if(title.length() > 25) {
				dto.setTitle(title.substring(0, 25) + "...");
			}
		});
		
		return list;
	}
}
