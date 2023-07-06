package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDTO;
import com.itbank.repository.BoardDAO;

@Service
public class BoardService {
	@Autowired private BoardDAO dao;

	public List<BoardDTO> getList() {
		List<BoardDTO> list = dao.selectAll();
		
		list.forEach(board -> {
			String title = board.getTitle();
			
			if(title.length() > 25) {
				board.setTitle(title.substring(0, 25) + "...");
			}
		});
		
		return list;
	}
	public List<BoardDTO> searchList(String search) {
		List<BoardDTO> list = dao.searchList(search);
		
		list.forEach(board -> {
			String title = board.getTitle();
			
			if(title.length() > 25) {
				board.setTitle(title.substring(0, 25) + "...");
			}
		});
		
		return list;
	}
	
	public BoardDTO getBoard(int idx) {
		return dao.selectOne(idx);
	}

	public int insert(BoardDTO dto) {
		return dao.insert(dto);
	}

	public int update(BoardDTO dto) {
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

}
