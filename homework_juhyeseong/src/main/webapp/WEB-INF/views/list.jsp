<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% int idx = 1; %>
<%@ include file="header.jsp" %>
	<div class="main">
		<form method="GET" action="${cpath }/searchList">
			<div class="searchBar">
				<input type="search" name="search" value="${param.search }" placeholder="검색어를 입력하세요">
				<input type="submit" value="검색">
			</div>
		</form>
		<table>
			<thead>
			<tr>
				<th>No</th>
				<th>제목</th>
				<th>작성날짜</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="board" items="${list }">
			<tr>
				<td><%=idx++ %></td>
				<td><a class="title" href="${cpath }/view/${board.idx }">${board.title }</a></td>
				<td>${board.writeDate }</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	
	<script>
		const titles = document.querySelectorAll('.title')
		const search = document.querySelector('input[type=search]').value		
		
		for(const title of titles) {
			titleText = title.innerText
			titleText = titleText.replaceAll(search, '<span class="search">' + search + '</span>')
			title.innerHTML = titleText
		}
	</script>
</body>
</html>