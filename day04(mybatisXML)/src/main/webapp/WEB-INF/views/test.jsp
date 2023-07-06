<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test.jsp</h1>
	<hr>
	
	<h3>버전 : ${version }</h3>
	<h3 id="clock">today : <fmt:formatDate value="${today }" pattern="yyyy-MM-dd a hh:mm:ss"/></h3>
	<a><button onclick="history.go(-1)">뒤로가기</button></a>
</body>
</html>