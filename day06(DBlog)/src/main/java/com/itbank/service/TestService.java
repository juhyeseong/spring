package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.YoutubeDTO;
import com.itbank.repository.TestDAO;

@Service
public class TestService {
	
	@Autowired private TestDAO dao;

	public String getVersion() {
		
		return dao.getVersion();
	}

	public int insert(YoutubeDTO dto) {
		return dao.insert(dto);
	}
}
