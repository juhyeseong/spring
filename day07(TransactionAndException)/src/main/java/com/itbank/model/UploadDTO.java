package com.itbank.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

/*
upload2
이름    널?       유형            
----- -------- ------------- 
IDX   NOT NULL NUMBER(38)    
TITLE NOT NULL VARCHAR2(100) 

upload2_file
이름       널?       유형            
-------- -------- ------------- 
IDX      NOT NULL NUMBER(38)    
UPLOAD2  NOT NULL NUMBER(38)    
FILEPATH NOT NULL VARCHAR2(255)  
*/

public class UploadDTO {
	private int idx;
	private String title;
	private List<MultipartFile> upload;
//	private List<String> filePath;
	private String filePath;
	
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
	public List<MultipartFile> getUpload() {
		return upload;
	}
	public void setUpload(List<MultipartFile> upload) {
		this.upload = upload;
	}
//	public List<String> getFilePath() {
//		return filePath;
//	}
//	public void setFilePath(List<String> filePath) {
//		this.filePath = filePath;
//	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
