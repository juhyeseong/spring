<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>회원가입</legend>
			
			<form method="POST">
				<p><input type="text" name="userId" placeholder="아이디" required></p>
				<p><input type="password" name="userPw" placeholder="패스워드" required></p>
				<p><input type="text" name="userNick" placeholder="닉네임" required></p>
				<p><input type="submit" value="회원가입">
			</form>
		</fieldset>
	</div>
</body>
</html>