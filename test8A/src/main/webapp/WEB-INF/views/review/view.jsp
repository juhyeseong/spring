<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<div class="view">
			<div class="viewName">${review.title }</div>
			<div class="writeDate">
				<div>작성자 : ${review.writer }</div>
				<div>${review.writeDate }</div>
			</div>
			<div class="image">
				<c:forEach var="image" items="${review.filePath }">
					<img src="${cpath }/upload/${image }">
				</c:forEach>
			</div>
			<textarea readonly>${review.content }</textarea>
		</div>
	</div>
</body>
</html>