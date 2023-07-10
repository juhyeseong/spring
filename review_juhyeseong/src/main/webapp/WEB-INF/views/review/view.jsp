<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<div class="main">
		<div class="view">
			<div class="viewName">
				<span>${dto.name }</span>
				<span>평점 : ${dto.grade }점</span>
			</div>
			<hr>
			<div class="writeDate">
				<span class="writer">${dto.writerNick }</span>
				<span>${dto.writeDate }</span>
			</div>
			<div class="image">
				<c:forEach var="item" items="${dto.filePath }">
					<img src="${cpath }/upload/${item }">
				</c:forEach>
			</div>
			<textarea readonly>${dto.content }</textarea>
		</div>
		<p class="space">
			<a href="${cpath }/review/modify/${dto.idx }"><button>수정</button></a>
			<a class="confirm" href="${cpath }/review/delete/${dto.idx }"><button>삭제</button></a>
		</p>
	</div>
	
	<script>
		const btn = document.querySelector('a.confirm')
		const login = '${login.userNick }'
		
			function confirmHandler(event) {
				event.preventDefault()				
				let target = event.target			
				while(target.tagName != 'A') {		
					target = target.parentNode		
				}
				
				const writer = document.querySelector('span.writer').innerText
				
				if(login != writer) {				
					alert('본인의 게시글만 삭제할 수 있습니다')	
					return							
				}
				
				if(confirm('정말 삭제하시겠습니까 ? ')) { 	
					location.href = target.href			
				}
				else {								
					alert('삭제를 취소합니다 ~ ')  
				}
			}
		
		btn.onclick = confirmHandler
	</script>
</body>
</html>