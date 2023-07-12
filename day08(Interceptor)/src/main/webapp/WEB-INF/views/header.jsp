<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day08</title>
<style>
body {
	margin: 0px;
}
/* header style */
header {
	background-color: gray;
	
	color: #eee;
}
header h1 {
	width: 300px;
	margin: auto;
	
	text-align: center;
}
header ul {
	list-style: none;
	
	display: flex;
	justify-content: center;
	
	font-size: 17px;
	font-weight: bold;
}
header li {
	margin: 0px 20px 0px 20px;
}
header a {
	all: unset;
	cursor: pointer;
}
header a:hover {
	border-bottom: 1px solid #eee;
}
header p {
	margin-right: 20px;
}

/* main style */
.main {
	width: 900px;
	margin: 30px auto;
}

/* form style */
fieldset {
	margin: auto;
	
	display: flex;
	justify-content: center;
	align-items: center;
}
fieldset legend {
	font-size: 20px;
	font-weight: bold;
}
fieldset input {
	width: 600px;
	height: 50px;
}
fieldset input[type="submit"] {
	border: 0px;

	width: 610px;
	height: 50px;
	
	background-color: gray;
	color: #eee;
	font-size: 18px;
	font-weight: bold;
}
</style>
</head>
<body>
	<header>
		<h1><a href="${cpath }">Day08</a></h1>
		
		<p align="right">
			<c:if test="${empty login }">현재 사용자 : 없음</c:if>
			<c:if test="${not empty login }">현재 사용자 : ${login.userId }</c:if>
		</p>
		<nav>
			<ul>
				<c:if test="${empty login }">
					<li><a href="${cpath }/member/login">로그인</a></li>
				</c:if>
				<c:if test="${not empty login }">
					<li><a href="${cpath }/member/logout">로그아웃</a>
				</c:if>
				<li><a href="${cpath }/board">게시판(회원전용)</a></li>
				<li><a href="${cpath }/youtube_list">유튜브 영상 클립(회원전용)</a></li>
				<li><a href="${cpath }/upload2">그림 파일 갤러리</a></li>
			</ul>
		</nav>
		<hr>
	</header>
	
	
	
