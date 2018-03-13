<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soin inputPassword</title>
<link href="../../../Css/Style2.css" type="text/css" rel="stylesheet" />
<style type="text/css">
</style>
</head>

<body>
   <!------------------------------------header 시작 ---------------------------------->
	<header id ="header">
	<div class="root-container">
	
	<section>
		
		<nav class="hor-menu member-menu">
			<h1 class = "hidden">회원 메뉴</h1>
			<h1 class = "hidden">헤더</h1>
			<ul>
				<li><a href="">마이페이지</a></li>
				<li><a href="">알림</a></li>
				<li><a href="">고객센터</a></li>
				<li><a href="">회원가입</a></li>
				<li><a href="">로그인</a></li>
			</ul>
			<h1 id="logo"><img class = "logo-images" src="../../../Images/hgw/logo1.png" alt="Soin"/></h1>
		</nav>
		
		<nav class = "hor-menu main-menu">
			<h1 class = "hidden">메인 메뉴</h1>
			<ul>
				<li><a href="">소인소개</a></li>
				<li><a href="">업체소개</a></li>
				<li><a href="">견적요청</a></li>
				<li><a href="">인테리어TIP</a></li>
				<li><a href="">시공후기</a></li>
			</ul>
		</nav>

	</section>
	
	</div>
	</header>

 	<div id ="body">
 	 <div class ="root-container">

<!------------------------------------aside 시작 	---------------------------------->
	<aside id = "aside">
	<div class = "ver-menu">
		<ul> 
	 		<li><a href="" class="btn">나의 프로필</a></li>
		    <li><a href="" class="btn">나의 견적</a></li>
	 		 <li><a href="" class="btn">나의 후기</a></li>
			 <li><a href="" class="btn">나의 문의내역</a></li>
	 		 <li><a href="" class="btn">찜한 업체</a></li>
	   </ul>
	
	</div>
	</aside>
<!------------------------------------main 시작 ---------------------------------->
	<main id = "main">
		<section class = "contents-box">
			<h1>비밀번호 확인
			</h1>
			
		<div class = "notice-phrase">
			<p>
				회원님의 소중한 정보 보호를 위해 현재 비밀번호를 확인해 주세요		
			</p>
		</div>
		
		<section>
		<table class = "main-table2">
			<tr>
				<th>아이디</th>
				<td>soin_people</td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" class="input-password" value="" placeholder="비밀번호를 입력해주세요." maxlength="20"></td>
			</tr>
		
		</table>
		</section>
		
		<section class="button">
		<input type="button" value="확인" onclick="location.href='#">
		</section>
			
		</section>
	

	</main>
	
	
	 </div>
 	</div>
<!------------------------------------footer 시작 ---------------------------------->	
	<footer id="footer">
		<div class = "root-container">
		
		<div class = "com-info">
		<h4>소인 주식회사</h4> 
		대표 : 한정수
		본사 : 서울특별시 마포구 월드컵북로 21 / 지번 : 서울특별시 마포구 서교동 447-5 <br>
		사업자등록번호 : 123-45-67890
		</div>
		
		<div class = "copyright">Copyrightⓒ 2018 By SOIN All Right Reserved.</div>
		
		</div>
	</footer>
</body>
</html>