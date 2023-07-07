package com.itbank.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.YoutubeDTO;

@Repository
public interface TestDAO {

	@Select("select banner from v$version")
	String getVersion();

	@Insert("insert into " +
				"youtube_list(title, channel, thumbnail, iframe) " +
				"values(#{title}, #{channel}, #{thumbnail}, #{iframe})")
	int insert(YoutubeDTO dto);
	
	
}
