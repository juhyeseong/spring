<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주혜성8A</title>
<link type="text/css" rel="stylesheet" href="${cpath }/resources/css/style.css">
</head>
<body>
	<header>
		<div class="project"><a href="#">주혜성8A</a></div>
		<div class="headerList">
			<ul>
				<li><a href="${cpath }/review/list">리뷰 목록</a></li>
				<li><a href="${cpath }/review/add">리뷰 작성</a></li>
			</ul>
		</div>
	</header>