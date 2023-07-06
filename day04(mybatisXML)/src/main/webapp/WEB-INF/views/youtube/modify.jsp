<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>modify.jsp</h1>
	<hr>
	
	<form method="POST">
		<p><input type="text" name="title" value="${dto.title }" placeholder="제목"></p>
		<p><input type="text" name="channel" value="${dto.channel }" placeholder="채널이름"></p>
		<p><input type="text" name="thumbnail" value="${dto.thumbnail }" placeholder="썸네일"></p>
		<p><textarea name="iframe" placeholder="영상태그">${dto.iframe }</textarea></p>
		<p><input type="submit"></p>
	</form>
</body>
</html>