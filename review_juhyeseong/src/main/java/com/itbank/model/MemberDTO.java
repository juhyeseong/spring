package com.itbank.model;

/*
이름       널?       유형            
-------- -------- ------------- 
IDX      NOT NULL NUMBER        
USERID   NOT NULL VARCHAR2(200) 
USERPW   NOT NULL VARCHAR2(300) 
USERNICK NOT NULL VARCHAR2(500) 
*/

public class MemberDTO {
	private int idx;
	private String userId, userPw, userNick, url;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNick() {
		return userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}

