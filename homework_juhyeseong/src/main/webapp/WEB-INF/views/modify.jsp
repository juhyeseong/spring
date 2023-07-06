<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>글 수정</legend>
		
			<form method="POST">
				<input type="text" name="title" value="${board.title }" placeholder="제목">
				<textarea name="content" placeholder="내용">${board.content }</textarea>
				<input type="password" name="password" value="${board.password }" placeholder="패스워드">
				<input type="submit" value="작성완료">
			</form>
		</fieldset>
	</div>
</body>
</html>