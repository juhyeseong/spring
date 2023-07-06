<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<h3>추가</h3>
	<hr>
	
	<form method="POST">
		<p><input type="text" name="title" placeholder="제목"></p>
		<p><input type="text" name="channel" placeholder="채널 이름"></p>
		<p><input type="text" name="thumbnail" placeholder="썸네일 경로"></p>
		<p><input type="text" name="iframe" placeholder="영상 소스코드 복사"></p>
		<p><input type="submit"></p>
	</form>
</body>
</html>