<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>
	<h1>home.jsp</h1>
	<hr>
	
	<ul>
		<li><a href="${cpath }/ex01">ex01 - HttpServletRequest</a></li>
		<li><a href="${cpath }/ex02">ex02 - Model</a></li>
		<li><a href="${cpath }/ex03">ex03 - ModelAndView</a></li>
		<li><a href="${cpath }/ex04">ex04 - 커맨드 객체(파라미터를 준비한 클래스로 받기)</a></li>
		<li><a href="${cpath }/quiz1">quiz1 - 이름과 나이를 입력받고, 성인/미성년자 여부 같이 출력하기</a></li>
		<li><a href="${cpath }/ex05">ex05 - pathVariable</a></li>
		<li><a href="${cpath }/ex06">ex06 - ModelAttribute</a></li>
		<li><a href="${cpath }/ex07">ex07 - HttpSession</a></li>
	</ul>
</body>
</html>