package com.itbank.model;

import java.sql.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/*
review
이름        널?       유형             
--------- -------- -------------- 
IDX       NOT NULL NUMBER         
TITLE     NOT NULL VARCHAR2(500)  
WRITER    NOT NULL NUMBER         
CONTENT            VARCHAR2(4000) 
WRITEDATE NOT NULL DATE  

review_Img
이름       널?       유형            
-------- -------- ------------- 
IDX      NOT NULL NUMBER        
FILEPATH NOT NULL VARCHAR2(255) 
REVIEW   NOT NULL NUMBER
*/

public class ReviewDTO {
	private int idx;
	private String title, writer, content;
	private Date writeDate;
	
	private List<MultipartFile> upload;
	private List<String> filePath;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public List<MultipartFile> getUpload() {
		return upload;
	}

	public void setUpload(List<MultipartFile> upload) {
		this.upload = upload;
	}

	public List<String> getFilePath() {
		return filePath;
	}

	public void setFilePath(List<String> filePath) {
		this.filePath = filePath;
	}
}
