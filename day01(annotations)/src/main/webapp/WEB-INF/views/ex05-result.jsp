<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05-result.jsp</title>
</head>
<body>
	<h1>ex05-result.jsp</h1>
	<hr>
	
	<h3>${content }</h3>
	<a href="${cpath }"><button>홈으로</button></a>
	<a href="${cpath }/ex05"><button>이전으로</button></a>
</body>
</html>