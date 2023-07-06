<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
</head>
<body>
	<h1>ex05.jsp</h1>
	<hr>
	
	<c:forEach var="element" items="${arr }" varStatus="st">
		<p>${st.count } : <a href="${cpath }/ex05/${st.index }">${element }</a>
	</c:forEach>
</body>
</html>