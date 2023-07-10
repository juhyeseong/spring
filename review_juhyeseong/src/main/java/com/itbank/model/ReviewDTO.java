package com.itbank.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.multipart.MultipartFile;

/*
review
이름        널?       유형             
--------- -------- -------------- 
IDX       NOT NULL NUMBER         
NAME      NOT NULL VARCHAR2(500)  
WRITER    NOT NULL NUMBER         
CONTENT            VARCHAR2(4000) 
WRITEDATE NOT NULL DATE           
GRADE     NOT NULL NUMBER

review_uplaod
이름       널?       유형            
-------- -------- -------------     
FILEPATH NOT NULL VARCHAR2(500) 
REVIEW   NOT NULL NUMBER  
*/

public class ReviewDTO {
	private int idx, writer, grade;
	private String name, content;
	private List<String> filePath = new ArrayList<String>();
	private Date writeDate;
	private List<MultipartFile> upload;
	
	private String writerNick;
	private String deleteFile;
	private List<String> delete;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getWriter() {
		return writer;
	}
	public void setWriter(int writer) {
		this.writer = writer;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getFilePath() {
		return filePath;
	}
	public void setFilePath(List<String> filePath) {
		this.filePath = filePath;
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
	public String getWriterNick() {
		return writerNick;
	}
	public void setWriterNick(String writerNick) {
		this.writerNick = writerNick;
	}
	public String getDeleteFile() {
		return deleteFile;
	}
	public void setDeleteFile(String deleteFile) {
		this.deleteFile = deleteFile;
	}
	public List<String> getDelete() {
		return delete;
	}
	public void setDelete(List<String> delete) {
		this.delete = delete;
	}
}
