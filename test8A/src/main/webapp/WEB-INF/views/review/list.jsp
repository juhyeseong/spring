<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<table>
			<thead>
				<tr>
					<th>No</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일자</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="review" items="${list }">
				<tr>
					<td>${review.idx }</td>
					<td><a href="${cpath }/review/view/${review.idx }">${review.title }</a></td>
					<td>${review.writer }</td>
					<td>${review.writeDate }</td>
				</tr>
			</c:forEach>	
			</tbody>
		</table>
	</div>
</body>
</html>