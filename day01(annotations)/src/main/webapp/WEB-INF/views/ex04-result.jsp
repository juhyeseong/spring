<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04-result.jsp</title>
</head>
<body>
	<h1>ex04-result.jsp</h1>
	<hr>
	
	<h3>${dto.n1 } + ${dto.n2 } = ${dto.answer }</h3>
	<a href="${cpath }"><button>홈으로</button></a>
	<a href="${cpath }/ex04"><button>한번 더</button></a>
</body>
</html>