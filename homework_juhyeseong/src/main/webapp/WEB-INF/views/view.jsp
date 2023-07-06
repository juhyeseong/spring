<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<script src="${cpath }/resources/js/script.js"></script>
	<div class="main">
		<div class="view">
			<div class="viewTitle">${board.title }</div>
			<hr>
			<div class="date">${board.writeDate }</div>
			<textarea readonly>${board.content }</textarea>
		</div>
		<p>
			<input class="password" type="password" placeholder="수정 및 삭제를 위한 패스워드">
			<button id="modify" onclick="passwordHandler('modify')">수정</button>
			<button id="delete" onclick="passwordHandler('delete')">삭제</button>
		</p>
	</div>
	
	<script>
		const inputPw = '${board.password }'
		const idx = '${board.idx }'
		const cpath = '${cpath }/'
	</script>
</body>
</html>