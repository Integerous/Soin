<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Soin.member.JdbcMemberDao" %>
<%@ page import="Soin.member.MemberDao" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	<title>비밀번호 변경</title>
	<link href="css/Style1p.css" type="text/css" rel="stylesheet"/>
	<script src="js/close.js" type="text/javascript"></script>
	<script>
	window.addEventListener("load", function() {
	
	var pwDiff = document.getElementById("pw-diff");
	var pwInput = document.getElementById("pw-input");
	var pwCheckInput = document.getElementById("pw-check-input");
	var submitButton = document.querySelector("input[type='submit']");
	var pwCheck = false;
	
	pwInput.onchange = ckDiff;
	pwCheckInput.onchange = ckDiff;
	
	function ckDiff() {
		if(pwInput.value == pwCheckInput.value)
		{
			pwCheck = true;
			pwDiff.style.color = "#000";
			pwDiff.textContent = "*비밀번호가 일치합니다."
		}
		else
		{
			pwCheck = false;
			pwDiff.style.color = "red"; 
			pwDiff.textContent = "*비밀번호가 일치하지 않습니다."
		}
	}	

	submitButton.onclick = function(ev) {
		
		if(pwCheck==false)
		{
			alert("비밀번호를 확인해 주십시오.");
			ev.preventDefault();
		}

	};
});
	</script>
	
</head>
<body class="root-container">
	<h1 class="hidden">비밀번호 변경</h1>
	<div class="find-box">
		
		<div class="title-box">
			비밀번호 변경
		</div>		
		<form action="find-password-update" method="post">		
			<div class="content-box">
				
				<div class="input-box center tc">
					<span id="memberId" class="bold">${requestScope.id}</span>님, 새로운 비밀번호를 설정해주세요.
				</div>	
				
				<div class="input-box center">
					<ul>
						<li><div class="center bold">새로운 비밀번호</div></li>
						<li><div class="center"><input id="pw-input" class="length" name="password" type="password" pattern="^[a-zA-Z0-9!@#$%^&*()\-_+=]{8,15}$" maxlength="15" placeholder="대소문자, 숫자, 특수문자 8-15자리 이내" required /></div></li>
						<li><div class="center bold">새로운 비밀번호 확인</div></li>
						<li><div class="center"> <input id="pw-check-input" class="length" type="password" pattern="^[a-zA-Z0-9!@#$%^&*()\-_+=]{8,15}$" maxlength="15" placeholder="대소문자, 숫자, 특수문자 8-15자리 이내" required /></div></li>
						<li><div id="pw-diff" class="center tc font-s"></div></li>
					</ul>
				</div>
				
			</div>
			
			<div class="box-close">
				<input type="submit" class ="btn-close" value="변경" />
				<input type="button" id="button-close-popup" class ="btn-close bl" value="닫기" />
			</div>	
		</form>
	</div>
</body>
</html>