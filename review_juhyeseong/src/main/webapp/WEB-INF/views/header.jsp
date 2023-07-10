<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맛집리뷰</title>
<style>
body {
	margin: 0px;
}

a {
	all: unset;
	cursor: pointer;
}
a:hover {
	border-bottom: 1px solid #eee;
}
button {
	all: unset;
}

/* header style */
header {
	background-color: gray;
	color: #eee;
}
.project {
	width: 300px;
	margin: auto;
	
	text-align: center;
	font-size: 30px;
	font-weight: bold;
}
.login {
	display: flex;
	justify-content: flex-end;
	
	font-size: 18px;
}
.login a {
	margin: 0px 20px;
	
}
.loginLeft {
	flex: 1;
	
	padding-left: 10px;
}
.loginRight {
	flex: 1;
	
	display: flex;
	justify-content: flex-end;
}
header ul {
	list-style: none;
	padding: 0px;

	display: flex;
	justify-content: center;
	align-items: center;
	
	font-size: 20px;
	font-weight: bold;
}
header li {
	margin: 0px 70px;
}

/* main style */
.main {
	width: 900px;
	margin: 30px auto;
}

/* form style */
fieldset {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}
legend {
	font-size: 18px;
}
fieldset input {
	width: 500px;
	height: 50px;
}
fieldset input[type="submit"] {
	border: 0px;
	
	width: 510px;
	height: 50px;
	
	background-color: gray;
	color: #eee;
	font-size: 18px;
	font-weight: bold;
}
fieldset textarea {
	width: 500px;
	height: 300px;
}
fieldset select {
	width: 510px;
	height: 50px;
	
	font-size: 20px;
}
fieldset option {
	text-align: center;
}
fieldset input[type="file"] {
	width: 500px;
	height: 25px;
}
fieldset input[type="checkbox"] {
	width: 18px;
	height: 18px;
	margin: 0px 4px;
}

/* table style */
table {
	border: 2px solid black;
	border-collapse: collapse;
	width: 800px;
	margin: auto;
}
table > thead > tr {
	background-color: gray;
	color: white;
}

td, th {
	padding: 5px 10px;
	border-bottom: 1px solid gray;
	text-align: center;
	
	height: 40px;
}
tbody > tr:hover {
	background-color: silver;
}

/* view style */
.view {
	border: 1px solid black;
	width: 800px;
	margin: auto;
}
.viewName {
	padding: 15px;
	
	display: flex;
	justify-content: space-between;
	align-items: center;
	
	font-size: 20px;
	font-weight: bold;
}
.writeDate {
	border-bottom: 1px dashed gray;

	padding: 5px 5px 10px 5px;

	display: flex;
	justify-content: space-between;
	align-items: center;
}
.view textarea {
	width: 785px;
	height: 500px;
	margin: 5px 0px 0px 5px;
	resize: none;
	
	font-size: 18px;
}
.space {
	width: 800px;
	margin: 10px auto;
	
	display: flex;
	justify-content: flex-end;
}
.space a {
	padding: 10px 20px;
	margin-left: 20px;

	background-color: gray;
	color: #eee;
}
.image {
	width: 800px;
	margin: 10px auto;
	
	display: flex;
	flex-wrap: wrap;
}
.image img {
	width: 245px;
	height: 245px;
	margin: 10px;
}

/* search style */
.searchBar {
	width: 800px;
	margin: 10px auto;
	
	display: flex;
	justify-content: center;
}
.search {
	color: skyblue;
	font-weight: bold;
}
.avg {
	width: 800px;
	margin: 10px auto;
	
	display: flex;
	justify-content: flex-end;
}
</style>
</head>
<body>
	<header>
		<div class="project">
			<a href="${cpath }">맛집리뷰</a>
		</div>
		
		<div class="login">
			<c:if test="${empty login }">
				<div class="loginLeft">
					현재 회원 : 없음
				</div>
				<div class="loginRight">
					<a href="${cpath }/member/login">로그인</a>
					<a href="${cpath }/member/join">회원가입</a>
				</div>
			</c:if>
			<c:if test="${not empty login }">
				<div class="loginLeft">
					현재 회원 : ${login.userNick }님
				</div>
				<div class="loginRight">
					<a href="${cpath }/member/logout">로그아웃</a>
					<a href="${cpath }/member/modify/${login.idx }">정보수정</a>
					<a href="${cpath }/member/delete/${login.idx }">회원탈퇴</a>
				</div>
			</c:if>
		</div>
		
		<ul>
			<li><a href="${cpath }/review/list">리뷰리스트</a></li>
			<li><a href="${cpath }/review/add">리뷰작성</a></li>
		</ul>
		<hr>
	</header>
</body>
</html>