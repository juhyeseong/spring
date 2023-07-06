package com.itbank.repository;

import java.util.List;

import com.itbank.model.Ex08DTO;

public interface Ex08DAO {

	public List<Ex08DTO> selectList();

	public int insert(Ex08DTO dto);
}
