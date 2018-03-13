
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
				<form method="post">
				<fieldset>
					<legend>1. 어디에 시공이 필요하신가요?</legend>
						<div class="options">
							<div>
								<input id="window" type="radio" name="construction-position" value="window" onclick="javascript:showWindow();" checked>
								<label for="window">창문</label>
							</div>
							<div>
								<input id="door" type="radio" name="construction-position" value="door" onclick="javascript:showDoor();">
								<label for="door">문</label>
							</div>
							<div>
								<input id="bathroom" type="radio" name="construction-position" value="bathroom" onclick="javascript:showBathroom();">
								<label for="bathroom">욕실</label>
							</div>
							<div>
								<input id="wall" type="radio" name="construction-position" value="wall" onclick="javascript:showWall();">
								<label for="wall">벽</label>
							</div>
						</div>
				</fieldset>

				<!-- ------------카테고리 2 선택------------ -->		
				<fieldset id="ifWindow">
					<legend>2. 상세 카테고리 선택</legend>
					<div class="options" >
						<div>
							<input id="high-ss" type="radio" name="detail-category" value="high-ss" checked>
							<label for="high-ss">하이샤시</label>
						</div>
						<div>
							<input id="aluminum" type="radio" name="detail-category" value="aluminum">
							<label for="aluminum">알루미늄 창</label>
						</div>
						<div>
							<input id="wood" type="radio" name="detail-category" value="wood">
							<label for="wood">목재 창</label>
						</div>
						<div>
							<input id="etc" type="radio" name="detail-category" value="etc">
							<label for="etc">기타</label>
						</div>
					</div>
				</fieldset>

				<fieldset  id="ifDoor">
						<legend>2. 상세 카테고리 선택</legend>
						<div class="options">
							<div>
								<input id="high-ss" type="radio" name="detail-category" value="high-ss" checked>
								<label for="high-ss">문</label>
							</div>
							<div>
								<input id="aluminum" type="radio" name="detail-category" value="aluminum">
								<label for="aluminum">문</label>
							</div>
							<div>
								<input id="wood" type="radio" name="detail-category" value="wood">
								<label for="wood">문</label>
							</div>
							<div>
								<input id="etc" type="radio" name="detail-category" value="etc">
								<label for="etc">문</label>
							</div>
						</div>
					</fieldset>
				<fieldset  id="ifBathroom">
						<legend>2. 상세 카테고리 선택</legend>
						<div class="options">
							<div>
								<input id="high-ss" type="radio" name="detail-category" value="high-ss" checked>
								<label for="high-ss">욕실</label>
							</div>
							<div>
								<input id="aluminum" type="radio" name="detail-category" value="aluminum">
								<label for="aluminum">욕실</label>
							</div>
							<div>
								<input id="wood" type="radio" name="detail-category" value="wood">
								<label for="wood">욕실</label>
							</div>
							<div>
								<input id="etc" type="radio" name="detail-category" value="etc">
								<label for="etc">욕실</label>
							</div>
						</div>
					</fieldset>
					<fieldset  id="ifWall">
							<legend>2. 상세 카테고리 선택</legend>
							<div class="options">
								<div>
									<input id="high-ss" type="radio" name="detail-category" value="high-ss" checked>
									<label for="high-ss">벽</label>
								</div>
								<div>
									<input id="aluminum" type="radio" name="detail-category" value="aluminum">
									<label for="aluminum">벽</label>
								</div>
								<div>
									<input id="wood" type="radio" name="detail-category" value="wood">
									<label for="wood">벽</label>
								</div>
								<div>
									<input id="etc" type="radio" name="detail-category" value="etc">
									<label for="etc">벽</label>
								</div>
							</div>
						</fieldset>
				
			<script>
					function showWindow(){
						var a = document.getElementById('ifWindow');
						var b = document.getElementById('ifDoor');
						var c = document.getElementById('ifBathroom');
						var d = document.getElementById('ifWall');
						a.style.display = "block";
						b.style.display = "none";
						c.style.display = "none";
						d.style.display = "none";
					}
					function showDoor(){
						var a = document.getElementById('ifWindow');
						var b = document.getElementById('ifDoor');
						var c = document.getElementById('ifBathroom');
						var d = document.getElementById('ifWall');
						a.style.display = "none";
						b.style.display = "block";
						c.style.display = "none";
						d.style.display = "none";
					}
					function showBathroom(){
						var a = document.getElementById('ifWindow');
						var b = document.getElementById('ifDoor');
						var c = document.getElementById('ifBathroom');
						var d = document.getElementById('ifWall');
						a.style.display = "none";
						b.style.display = "none";
						c.style.display = "block";
						d.style.display = "none";
					}
					function showWall(){
						var a = document.getElementById('ifWindow');
						var b = document.getElementById('ifDoor');
						var c = document.getElementById('ifBathroom');
						var d = document.getElementById('ifWall');
						a.style.display = "none";
						b.style.display = "none";
						c.style.display = "none";
						d.style.display = "block";
					}
					
			</script>
																							
<!-- ------------스타일/제품 선택------------ -->
				<fieldset>
					<legend>3. 건물 종류 선택</legend>
					<div class="options">
						<div>
								<input id="apt" type="radio" name="building-type" value="apt" checked>
								<label for="apt">아파트</label>
							</div>
							<div>
								<input id="house" type="radio" name="building-type" value="house">
								<label for="house">주택</label>
							</div>
							<div>
								<input id="villa" type="radio" name="building-type" value="villa">
								<label for="villa">빌라</label>
							</div>
							<div>
								<input id="commercial" type="radio" name="building-type" value="commercial">
								<label for="commercial">상업시설</label>
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