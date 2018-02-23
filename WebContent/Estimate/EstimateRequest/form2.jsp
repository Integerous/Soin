<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>










<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 견적의뢰 - 소규모 인테리어 시공 중개 플랫폼 소인</title>
<link href="../../Css/Style4.css" type="text/css" rel="stylesheet"/>

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
						<div class="step2">STEP 1</div>
						<div class="current-step">STEP 2</div>
						<div class="step3">STEP 3</div>
						<div class="step4">STEP 4</div>
				</section>
							
				<div class="triangle">
					 <div class="ta-2"></div>
					 <div class="current-ta"></div>
					 <div class="ta-3"></div>
					 <div class="ta-4"></div>
				</div>
			</div>
			
<!-- ------------form wrapper------------ -->		
		<div class="form-wrapper">

<!-- ------------견적의뢰서  타이틀------------ -->
			<section class="form-title">
				
				<img src="../../Images/ic_check_box_black_24dp_2x.png" alt="check-box" /></a>
				
				<div class="ft-container">
					견적의뢰서 작성
				</div>
			</section>

<!-- ------------카테고리 4 선택------------ -->			
		<section class="request-form">
					<div>
						<fieldset>
							<legend>4. 원하는 스타일/제품이 담긴 URL 입력</legend>
								<div class="options">
									<div>
										<input type="search">
										<input type="submit" value="URL 입력">
									</div>
								</div>
						</fieldset>
					</div>
					
<!-- ------------카테고리 5 선택------------ -->												
					<div>
						<fieldset>
							<legend>5. 현재 상태 사진 올리기</legend>
								<div class="options">
									<div>
										<input type="file" class="photos">
									</div>
								</div>
						</fieldset>
					</div>
					
<!-- ------------카테고리 6 선택------------ -->					
					<div>
						<fieldset>
							<legend>6. 희망 시공일 선택</legend>
								<div class="options">
									<div>
										<label><input type="date" id="start"></label>
									</div>
									<p>또는 </p>
									<div>
										<label><input type="date" id="end"></label>
									</div>
								</div>
						</fieldset>
					</div>
					
<!-- ------------카테고리 7 선택------------ -->					
					<div>
						<fieldset>
							<legend>7. 상세 요청사항</legend>
								<div class="options">
									<textarea name="request" cols="55" rows="5">
									</textarea>
								</div>
						</fieldset>
					</div>
		

<!-- ------------button container------------ -->
		<div class="btn-container">
		
<!-- ------------previous button------------ -->	
			<div class="previous-button">
				<button class="prev-btn" onclick="location.href='est-request1.html'"><span>이전</span></button>
			</div>		
				 
<!-- ------------next button------------ -->							
			<div class="next-button">
		      <button class="next-btn" onclick="location.href='est-request3.html'"><span>다음</span></button>
		    </div>


		</div>



			</section>
		</div>
	</main>

<!-- ---------------------FOOTER---------------------- -->	
		<footer>
			<p> Copyright 2018 SoinProject</p>
		</footer>
		
</body>
</html>