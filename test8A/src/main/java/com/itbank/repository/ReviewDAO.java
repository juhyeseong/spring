package com.itbank.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.ReviewDTO;

@Repository
public interface ReviewDAO {

	List<ReviewDTO> selectAll();
	
	int insertReview(ReviewDTO dto);

	int selectMaxIdx();

	int uploadFile(HashMap<String, Object> param);

	ReviewDTO selectOneReview(int idx);

	List<String> selectFile(int idx);
}
