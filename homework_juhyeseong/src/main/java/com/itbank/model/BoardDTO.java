package com.itbank.model;

import java.sql.Date;

/*
이름        널?       유형             
--------- -------- -------------- 
IDX       NOT NULL NUMBER         
TITLE     NOT NULL VARCHAR2(200)  
CONTENT   NOT NULL VARCHAR2(3000) 
WRITEDATE NOT NULL DATE           
PASSWORD  NOT NULL VARCHAR2(100)   
*/

public class BoardDTO {
	private int idx;
	private String title, content, password;
	private Date writeDate;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
}
