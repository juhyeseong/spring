<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<fieldset>
			<legend>리뷰 수정</legend>
	
			<form method="POST" enctype="multipart/form-data">
				<p><input type="hidden" name="writer" value="${login.idx }"></p>
				<p><input type="text" name="name" value="${dto.name }" placeholder="맛집이름" required></p>
				<p><input type="file" name="upload" multiple></p>
				<sub>
					현재 첨부 파일 : 
					<c:if test="${empty dto.filePath }">
						없음
					</c:if>
					<c:if test="${not empty dto.filePath }">
						<c:forEach var="filePath" items="${dto.filePath }">
							<div>${filePath }</div>
						</c:forEach>
					</c:if>
					<input type="hidden" name="delete" value="${dto.filePath }">
					<label><input type="checkbox" name="deleteFile">첨부파일 삭제</label>
				</sub>
				<p><textarea name="content" placeholder="리뷰 내용">${dto.content }</textarea></p>
				<p>
					<select name="grade">
						<option>===별점===</option>
						<option ${dto.grade == 1 ? 'selected' : ' ' } value="1">1점</option>
						<option ${dto.grade == 2 ? 'selected' : ' ' } value="2">2점</option>
						<option ${dto.grade == 3 ? 'selected' : ' ' } value="3">3점</option>
						<option ${dto.grade == 4 ? 'selected' : ' ' } value="4">4점</option>
						<option ${dto.grade == 5 ? 'selected' : ' ' } value="5">5점</option>
					</select>
				<p><input type="submit" value="리뷰수정"></p>
			</form>
		</fieldset>
	</div>
</body>
</html>