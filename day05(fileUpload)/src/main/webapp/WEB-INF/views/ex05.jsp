<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<h3>ex05</h3>
	
	<form method="POST" enctype="multipart/form-data">
		<p><input type="text" name="title" placeholder="제목">
		<p><input type="file" name="upload[0]"></p>
		<p><input type="file" name="upload[1]"></p>
		<p><input type="file" name="upload[2]"></p>
		<p><input type="submit"></p>
	</form>
</body>
</html>