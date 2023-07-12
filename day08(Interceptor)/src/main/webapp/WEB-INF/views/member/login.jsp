<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>로그인</legend>
			
			<form method="POST">
				<p><input type="text" name="userId" placeholder="아이디"></p>
				<p><input type="password" name="userPw" placeholder="패스워드"></p>
				<p><input type="submit"></p>
			</form>
		</fieldset>
	</div>
</body>
</html>