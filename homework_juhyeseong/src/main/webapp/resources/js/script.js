'use strict'

function passwordHandler(buttonId) {
	const password = document.querySelector('.password').value
	const button = document.getElementById(buttonId).innerText
	const task = button == '수정' ? 'modify' : 'delete'
		
	if(password == inputPw) {
		alert('패스워드가 일치합니다 ~ ')
		location.href = cpath + task + '/' + idx
	}
	else {
		alert('패스워드가 일치하지 않습니다 ~ ')
	}
}