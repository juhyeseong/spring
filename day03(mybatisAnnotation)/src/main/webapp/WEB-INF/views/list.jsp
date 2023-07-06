<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<form method="GET" action="${cpath }/searchList">
		<p align="center">
			<input type="search" name="search" value="${param.search }" placeholder="검색어를 입력하세요">
			<input type="submit" value="검색">
		</p>
	</form>
	<div id="list">
		<c:forEach var="dto" items="${list }">
		<div class="item">
			<div>
				<a href="${cpath }/view/${dto.idx }">
					<img src="${dto.thumbnail }">
				</a>
			</div>
			<div class="title">${dto.title }</div>
			<div>${dto.channel }</div>
		</div>
		</c:forEach>
	</div>
	
	<script>
		const titles = document.querySelectorAll('.title')
		const search = document.querySelector('input[type=search]').value		
		
		for(const title of titles) {
			titleText = title.innerText
			titleText = titleText.replace(search, '<span class="search">' + search + '</span>')
			title.innerHTML = titleText
		}
	</script>
</body>
</html>