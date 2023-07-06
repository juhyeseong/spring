<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06.jsp</title>
</head>
<body>
	<h1>ex06.jsp</h1>
	<hr>
	<c:if test="${empty login }">
		<h3>현재 로그인 :  없음</h3>
	</c:if>
	<c:if test="${not empty login }">
		<h3>현재 로그인 :  ${login.userId }</h3>
		<a href="${cpath }/logout"><button>로그아웃</button></a>
	</c:if>
	
	<form method="POST">
			<p><input type="text" name="userId" placeholder="ID" autofocus></p>
			<p><input type="password" name="userPw" placeholder="Password"></p>
			<p><input type="submit"></p>
		</form>
</body>
</html>