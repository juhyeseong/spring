<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>homework_board(juhyeseong)</title>
<link type="text/css" rel="stylesheet" href="${cpath }/resources/css/style.css">
<style>

</style>
</head>
<body>
	<header>
		<div class="headerTop"><span>HomeworkBoard</span></div>
		<div class="headerBottom">
			<a href="${cpath }">리스트</a>
			<a href="${cpath }/add">글 작성</a>
		</div>
	</header>