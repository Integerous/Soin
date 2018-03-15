<%@page import="Soin.client.Client"%>
<%@page import="Soin.member.Member"%>
<%@page import="Soin.member.MemberView"%>
<%@page import="Soin.member.MemberDao"%>
<%@page import="Soin.member.JdbcMemberDao"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<%
String id = (String)request.getSession().getAttribute("id");
MemberDao memberdao = new JdbcMemberDao();
MemberView mv = memberdao.get(id);
Member m = mv.getMember();
Client c = mv.getClient();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soin fixMyinfo</title>
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
				
				<c:if test="${empty sessionScope.id}">
				<li><a href="${ctx}/Member/Common/login">로그인</a></li>
				</c:if>
				
				<c:if test="${not empty sessionScope.id}">
				<li><a href="${ctx}/Member/Common/logout">로그아웃</a></li>
				</c:if>
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
	 		<li><a href="MyProfile.jsp" class="btn">나의 프로필</a></li>
		    <li><a href="../MyEstimate/MyEstimate.jsp" class="btn">나의 견적</a></li>
	 		 <li><a href="../MyReview/MyReview.jsp" class="btn">나의 후기</a></li>
			 <li><a href="" class="btn">나의 문의내역</a></li>
	 		 <li><a href="" class="btn">찜한 업체</a></li>
	   </ul>
	
	</div>
	</aside>
<!------------------------------------main 시작 ---------------------------------->
	<main id = "main">
	
		<section class = "contents-box">
			<h1 class ="h1fix">회원정보 수정
			</h1>
		
		<form action="FixMyinfoProc.jsp" method="post">
		<section>
		<table class = "main-table3">
			<tr>
				<th>아이디</th>
				<td><%=m.getId() %></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password" class="input-text" value="" placeholder="비밀번호를 입력해주세요." maxlength="50"></td>
			</tr>
			
			<tr>
				<th>비밀번호확인</th>
				<td><input type="password"  name="confPassword" class="input-text" value="" placeholder="비밀번호를 다시 입력해주세요." maxlength="50"></td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" class="input-text" ></td>
				
			</tr>
			
			<tr>
				<th>연락처</th>
				<td><input type="text" name="phoneNum" class="input-text" ></td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td><input type="text" name="address" class="input-text input-textad" ></td>
			</tr>
			<tr>
			
				<th>상세주소</th>
				<td><input type="text" name="detailAddress" class="input-text input-textad" ></td>
			</tr>
			
			<tr>
				<th>닉네임</th>
				<td><input type="text"  name="nickName" class="input-text" ></td>
			</tr>
		
		</table>
		<section class="button button2">
		<input type="submit" value="저장하기" >
		</section>
		</section>
		</form>
		
		
			
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