package com.itbank.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.itbank.model.YoutubeDTO;

// 데이터 베이스에서 데이터를 받음
@Repository		// 스프링 빈으로 등록함과 동시에, 내부에서 발생하는 예외를 DataAccessException 으로 치환하여 throw한다
public class TestDAO {
	@Autowired private JdbcTemplate jt;
	// 단일 조회, 검색, 전체 목록 등에서 테이블의 객체를 자바 객체로 맴핑하는 규칙은 모두 동일하다
	RowMapper<YoutubeDTO> rowMapper = (ResultSet rs, int rowNum) -> {
		YoutubeDTO dto =  new YoutubeDTO();
			
		dto.setChannel(rs.getString("channel"));
		dto.setIdx(rs.getInt("idx"));
		dto.setIframe(rs.getString("iframe"));
		dto.setThumbnail(rs.getString("thumbnail"));
		dto.setTitle(rs.getString("title"));
		
		return dto;
	};
	
	public String selectVersion() {
		// 1) 실행할 쿼리문을 작성한다
		String sql = "select banner from v$version";
		// 2) 쿼리문을 실행하며, 결과는 단독항목(queryForObject)이다. 그 타입은 String이다
		String version = jt.queryForObject(sql, String.class);
		// 3) 받아온 결과물을 반환한다
		return version;
	}

	public List<YoutubeDTO> selectYoutubeList() {
		// 1) 실행할 SQL을 준비
		String sql = "select * from youtube_list order by idx";
		// 2) rs에서 결과를 어떤 형식의 자바 객체로 어떻게 맵핑할지 결정
		// 3) 쿼리문과 맵핑 방법을 전달하여 리스트를 받기
		List<YoutubeDTO> list = jt.query(sql, rowMapper);
		// 4) 반환
		return list;
	}
	

	public YoutubeDTO selectOne(int idx) {
		String sql = "select * from youtube_list " +
						"where idx=? " +
						"order by idx";
		// ?에 해당하는 값을 자료형에 상관없이 순서대로 배치할 수 있는 배열을 준비한다
		Object[] args = { idx };
		YoutubeDTO dto = jt.queryForObject(sql, args, rowMapper);
		
		return dto;
	}

	public int insert(YoutubeDTO dto) {
		String sql = "insert into " +
						"youtube_list(title, channel, thumbnail, iframe) " +
						"values(?, ?, ?, ?)";
		Object[] args = {
			dto.getTitle(), dto.getChannel(), dto.getThumbnail(), dto.getIframe()
		};
		int row = jt.update(sql, args);
		
		return row;
	}

	public int delete(int idx) {
		String sql = "delete youtube_list where idx=?";
		Object[] args = { idx };
		int row = jt.update(sql, args);
		
		return row;
	}
}
