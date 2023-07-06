<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>글 작성</legend>
		
			<form method="POST">
				<input type="text" name="title" placeholder="제목">
				<textarea name="content" placeholder="내용"></textarea>
				<input type="password" name="password" placeholder="패스워드">
				<input type="submit" value="작성완료">
			</form>
		</fieldset>
	</div>
</body>
</html>