
<%@page import="Soin.EstimateRequest.EstimateRequestView"%>
<%@page import="Soin.EstimateRequest.JdbcEstimateRequestDao"%>
<%@page import="Soin.EstimateRequest.EstimateRequestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <%
	String id = request.getParameter("id");

	EstimateRequestDao estimateRequestDao = new JdbcEstimateRequestDao();
	EstimateRequestView estimateRequest = estimateRequestDao.get(id);
%> --%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 견적의뢰 - 소규모 인테리어 시공 중개 플랫폼 소인</title>
<link href="../../../../Css/Style4.css" type="text/css" rel="stylesheet"/>


</head>
<body>
	
<!-- <div id="grid">	 -->
<!-- ---------------------HEADER---------------------- -->

<!-- ------------top-bar------------ -->
	<header>
		<div id="top-bar">
			<div class="tb-container">
				<div class="login-status" style="display:none;">
					<a href="#">로그아웃</a></div>
					
				<div class="logout-status">
					<a href="#">로그인</a></div>
				<div class="logout-status">
					<a href="#">회원가입</a></div>
				<div><a href="#">고객센터</a></div>
				<div class="notifications"><a href="#" >
					<img src="../../Images/ic_notifications_active_black_24px.svg"/></a></div>
				<div><a href="#">마이페이지</a></div>
			</div>
		</div>
	
<!-- ------------logo & title------------ -->			
		<div id="mid-bar">
			<div class="mb-container">
				<div class="logo">
					<a href="index.html">
					<img src="../../Images/logo_js.png" alt="Soin_Logo" /></a>
				</div>
				
					<a href="#">소인</a>
					
				<div class="p">
					- 소규모 인테리어 시공 중개 플랫폼
				</div>
			</div>
		</div>
		
		<div class="liner"></div>
		
<!-- ------------navigation------------ -->
		<div id="top-nav">
			
			<nav class="tn-container">
				<div class="hello">
					<a href="#">소인소개</a></div>
				<div class="hello-contr">
					<a href="#">업체소개</a></div>
				<div class="est-request">
					<a href="#" style="color:gold">견적의뢰</a></div>
				<div class="tip">
					<a href="#">인테리어 TIP</a></div>
				<div class="review">
					<a href="#">시공후기</a></div>
			</nav>
		</div>
			
		<div class="liner"></div>
		
	</header>

<!-- ---------------------MAIN---------------------- -->	
	<main>
	
<!-- ------------progress bar------------ -->		
			<div class="pb-bar">
				<section class="progress-bar">
						<div class="current-step">STEP 1</div>
						<div class="step2">STEP 2</div>
						<div class="step3">STEP 3</div>
						<div class="step4">STEP 4</div>
				</section>
							
				<div class="triangle">
					 <div class="current-ta"></div>
					 <div class="ta-2"></div>
					 <div class="ta-3"></div>
					 <div class="ta-4"></div>
				</div>
			</div>
			
<!-- ------------form wrapper------------ -->		
		<div class="form-wrapper">

<!-- ------------견적의뢰서 ------------ -->
			<section class="form-title">
				
				<img src="../../Images/ic_check_box_black_24dp_2x.png" alt="check-box" /></a>
				
				<div class="ft-container">
					견적의뢰서 작성
				</div>
			</section>

<!-- ------------카테고리 1 선택------------ -->			
		<section class="request-form">
				<form action="form-proc.jsp" method="post">
				<fieldset>
					<legend>1. 어디에 시공이 필요하신가요?</legend>
						<div class="options">
							<div>
								<input id="window" type="radio" name="construction-position" value="창문" checked>
								<label for="window">창문</label>
							</div>
							<div>
								<input id="door" type="radio" name="construction-position" value="문">
								<label for="door">문</label>
							</div>
							<div>
								<input id="bathroom" type="radio" name="construction-position" value="욕실">
								<label for="bathroom">욕실</label>
							</div>
							<div>
								<input id="wall" type="radio" name="construction-position" value="벽">
								<label for="wall">벽</label>
							</div>
						</div>
				</fieldset>
	
<!-- ------------카테고리 2 선택------------ -->		
				<fieldset>
					<legend>2. 상세 카테고리 선택</legend>
						<div class="options">
							<div>
								<input id="high-ss" type="radio" name="category2" value="##" checked>
								<label for="high-ss">하이샤시</label>
							</div>
							<div>
								<input id="aluminum" type="radio" name="category2" value="##">
								<label for="aluminum">알루미늄 창</label>
							</div>
							<div>
								<input id="wood" type="radio" name="category2" value="##">
								<label for="wood">목재 창</label>
							</div>
							<div>
								<input id="etc" type="radio" name="category2" value="##">
								<label for="etc">기타</label>
							</div>
						</div>
				</fieldset>
	
<!-- ------------실측 사이즈------------ -->					
				<fieldset>
					<legend>3. 실측 사이즈</legend>
					<div class="options">
						<div class="category-3-a">
							<div>창문 너비 : 
								<input type="number" min="1" max="500" value="">cm
							</div>
							<div>창문 높이 :
								<input type="number" min="1" max="500" value="">cm
							</div>
						</div>
						<div class="category-3-b">
							<div>창틀 너비 : 
								<input type="number" min="1" max="500" value="">cm
							</div>
							<div>창틀 높이 :
								<input type="number" min="1" max="500" value="">cm
							</div>
						</div>
					</div>
				</fieldset>


<!-- ------------button container------------ -->
		<div class="btn-container">
				
<!-- ------------next button------------ -->							
			<div class="next-button">
		      <button class="next-btn" onclick="location.href='Form2.jsp'"><span>다음</span></button>
		    </div>
		    
		    
		</div>
		    
		    </form>
		    
			</section>
		</div>
	</main>

<!-- ---------------------FOOTER---------------------- -->	
<!-- 		<footer>
			<p> Copyright 2018 SoinProject</p>
		</footer> -->
		
</body>
</html>