<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>글 작성</legend>
			
			<form method="POST" enctype="multipart/form-data">
				<p><input type="text" name="title" placeholder="제목" required></p>
				<p><input type="text" name="writer" placeholder="작성자" required></p>
				<p><input type="file" name="upload" multiple></p>
				<p><textarea name="content" placeholder="내용" required></textarea></p>
				<p><input type="submit" value="글 작성"></p>
			</form>
		</fieldset>
	</div>
</body>
</html>