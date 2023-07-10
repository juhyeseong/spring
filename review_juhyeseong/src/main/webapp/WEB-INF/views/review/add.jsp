<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
	<div class="main">
		<fieldset>
			<legend>리뷰 작성</legend>
	
			<form method="POST" enctype="multipart/form-data">
				<p><input type="hidden" name="writer" value="${login.idx }"></p>
				<p><input type="text" name="name" placeholder="맛집이름" required></p>
				<div>
					<input type="file" name="upload" multiple onchange="previewImages(event)">
					<div id="preview"></div>
				</div>
				<p>
					<textarea name="content" placeholder="리뷰 내용"></textarea>
				</p>
				<p>
					<select name="grade">
						<option>===별점===</option>
						<option value="1">1점</option>
						<option value="2">2점</option>
						<option value="3">3점</option>
						<option value="4">4점</option>
						<option value="5">5점</option>
					</select>
				<p>
					<input type="submit" value="리뷰작성">
			</form>
		</fieldset>
	</div>
</body>
</html>