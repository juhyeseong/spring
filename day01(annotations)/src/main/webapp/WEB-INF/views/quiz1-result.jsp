<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1-result.jsp</title>
</head>
<body>
	<h1>quiz1-result.jsp</h1>
	<hr>
	
	<h3>${param.name }님은 ${param.age }세이고 ${adult }입니다</h3>
	<a href="${cpath }"><button>홈으로</button></a>
</body>
</html>