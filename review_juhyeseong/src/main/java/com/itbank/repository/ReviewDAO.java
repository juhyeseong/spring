package com.itbank.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.ReviewDTO;

@Repository
public interface ReviewDAO {
	public int insert(ReviewDTO dto);

	public int uploadFile(HashMap<String, Object> param);

	public int selectMaxIdx();

	public List<ReviewDTO> selectAll();

	public ReviewDTO selectOne(int idx);

	public List<String> selectFiles(int idx);

	public int update(ReviewDTO dto);

	public int deleteFile(int idx);

	public int delete(int idx);

	public List<ReviewDTO> select(String search);
}
