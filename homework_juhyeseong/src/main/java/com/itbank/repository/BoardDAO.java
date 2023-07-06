package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itbank.model.BoardDTO;

@Repository
public interface BoardDAO {

	@Select("select * from homework_board order by idx desc")
	List<BoardDTO> selectAll();

	@Select("select * from homework_board " +
				"where title like '%${search}%' " +
				"order by idx desc")
	List<BoardDTO> searchList(String search);

	@Select("select * from homework_board where idx=#{idx}")
	BoardDTO selectOne(int idx);

	@Insert("insert into " + 
				"homework_board(title, content, password) " + 
				"values(#{title}, #{content}, #{password})")
	int insert(BoardDTO dto);

	@Update("update homework_board set " +
				"title=#{title}, " +
				"content=#{content}, " +
				"password=#{password} " +
				"where idx=#{idx}")
	int update(BoardDTO dto);

	@Delete("delete homework_board where idx=#{idx}")
	int delete(int idx);
}
