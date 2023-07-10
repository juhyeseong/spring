<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<form method="GET" action="${cpath }/review/searchList">
			<div class="searchBar">
				<input type="search" name="search" value="${param.search }" placeholder="검색어를 입력하세요">
				<input type="submit" value="검색">
			</div>
			<c:if test="${not empty avg }">
				<div class="avg">평균평점 : ${avg }</div>
			</c:if>
		</form>
		<table>
			<thead>
			<tr>
				<th>No</th>
				<th>맛집이름</th>
				<th>작성자</th>
				<th>작성날짜</th>
				<th>평점</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.idx }</td>
					<td>
						<a class="name" href="${cpath }/review/view/${dto.idx }">${dto.name }</a>
					</td>
					<td>${dto.writerNick }</td>
					<td>${dto.writeDate }</td>
					<td>${dto.grade }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	
	<script>
		const titles = document.querySelectorAll('.name')
		const search = document.querySelector('input[type=search]').value		
		
		for(const title of titles) {
			titleText = title.innerText
			titleText = titleText.replaceAll(search, '<span class="search">' + search + '</span>')
			title.innerHTML = titleText
		}
	</script>
</body>
</html>