<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Soin.member.JdbcMemberDao" %>
<%@ page import="Soin.member.MemberDao" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	<title>비밀번호 찾기</title>
	<link href="css/Style1p.css" type="text/css" rel="stylesheet"/>
</head>
<body class="root-container">
	<h1 class="hidden">비밀번호 찾기</h1>
	<div class="find-box">
		
		<div class="title-box">
					비밀번호 찾기
		</div>		
				
			<div class="content-box">
				
				<div class="input-box center tc">
					<img src="../../../Images/phz/find-icon.png" height="13px" width="13px"> 입력하신 아이디의 비밀번호
				</div>	
				<div class="result-box center">
					${password}
				</div>
				
			</div>
			
			<div class="box-close">
				<button id="button-close-popup" class ="btn-close">닫기</button>
			</div>
			
			<script>
				var closePopupButton = document.getElementById("button-close-popup");
				
				closePopupButton.onclick = function() {
					 window.open("about:blank", "_self").close(); 
					 window.open("about:blank","_parent").parent.close();
				}
			</script>
			
	</div>
</body>
</html>