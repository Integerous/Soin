<%@page import="java.sql.*"%>
<%@page import="Soin.client.Client"%>
<%@page import="Soin.member.Member"%>
<%@page import="Soin.member.MemberView"%>
<%@page import="Soin.member.MemberDao"%>
<%@page import="Soin.member.JdbcMemberDao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String memId = (String) request.getSession().getAttribute("ID");

	String sql = "SELECT * FROM REVIEW WHERE MEMBER_ID=?";
	//0.드라이버 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//1.연결 생성
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.251:1521:orcl", "c##soin",
			"soin1218");
	//2.문장 실행
	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1, memId);
	//3.결과집합 사용
	ResultSet rs = st.executeQuery();
	//4.패치
	/* rs.next(); */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soin myReview</title>
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
	 		<li><a href="../MyProfile/MyProfile.jsp" class="btn">나의 프로필</a></li>
		    <li><a href="../MyEstimate/MyEstimate.jsp" class="btn">나의 견적</a></li>
	 		 <li><a href="MyReview.jsp" class="btn">나의 후기</a></li>
			 <li><a href="" class="btn">나의 문의내역</a></li>
	 		 <li><a href="" class="btn">찜한 업체</a></li>
	   </ul>
	
	</div>
	</aside>
<!------------------------------------main 시작 ---------------------------------->
	<main id = "main">
		<section class = "contents-box">
		<h1 class=h1-myestim>나의 후기</h1>	
		<section>
		<table class = "table">
			<thead>
				<tr class ="thead">
					<th class = "width-sn">번호</th>
					<th class = "width-ex">후기제목</th>
					<th class = "width-nd">조회수</th>
					<th class = "width-md">작성날짜</th>
					<th class = "width-sm">만족도</th>
				</tr>
			</thead>
			<tbody>
			<%
			while(rs.next())  {
			%>
				<tr>
					<td class = "width-sn"><a href=""><%=rs.getString("ID") %></a></td>
					<td class = "width-ex"><a href=""><%=rs.getString("TITLE") %></a></td>
					<td class = "width-nd"><a href=""><%=rs.getInt("HIT") %></a></td>
					<td class = "width-md"><a href=""><%=rs.getDate("REGDATE") %></a></td>
					<td class = "width-sm"><a href=""><%=rs.getInt("GRADE_POINT") %></a></td>
				</tr>
			<%
			} 
			%>
			</tbody>		
		</table>
		</section>
		
		<div class=pn-page>
			<input type="button" value="이전" onclick="'location.href='#'">
					<a class="strong" href="">1
					<a href="">2</a>
					<a href="">3</a>
					<a href="">4</a>
					<a href="">5</a> 
			<input type="button"  value="다음" onclick="'location.href='#'">
		</div>
			
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
<%
	rs.close();
	st.close();
	con.close();
%>