<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>회원정보수정</legend>
			
			<form method="POST">
				<p><input type="text" name="userId" value="${login.userId }" readonly></p>
				<p><input type="password" name="userPw" value="${login.userPw }" placeholder="패스워드" required></p>
				<p><input type="text" name="userNick" value="${login.userNick }" placeholder="닉네임" required></p>
				<p><input type="submit" value="정보수정">
			</form>
		</fieldset>
	</div>
</body>
</html>