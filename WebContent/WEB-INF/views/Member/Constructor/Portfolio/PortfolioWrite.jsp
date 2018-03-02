<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../Css/Style3.css" type="text/css" rel="stylesheet" />
<link href="../../../Css/StyleHF.css" type="text/css" rel="stylesheet" />
<style type ="text/css"></style>
</head>
<body>
	
<!-- ---헤더시작----------------------------------------------------- -->

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
					<img src="../../../Images/ic_notifications_active_black_24px.svg"/></a></div>
				<div><a href="#">마이페이지</a></div>
			</div>
		</div>
	
<!-- ------------logo & title------------ -->			
		<div id="mid-bar">
			<div class="mb-container">
				<div class="logo">
					<a href="index.html">
					<img src="../../../Images/logo_js.png" alt="Soin_Logo" /></a>
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
	


	<!-- <div id="header">
		
			<div class ="hor-menu menu-member">
			<ul>
				<li><a href="">로그인</a></li>
				<li><a href="">회원가입</a></li>
				<li><a href="">고객센터</a></li>
				<li><a href=""><div class ="imag-member"><img class ="logo-member" src="../../../Images/yurim/ic_add_alert_black_24dp_1x.png" alt=""/></div></a></li>
				<li><a href=""><div class ="imag-member"><img class ="logo-member" src="../../../Images/yurim/ic_contact_phone_black_24dp_1x.png" alt=""/></div></a></li>
			</ul>
	   		</div>
	
	
	   <div class ="img-logo">
	   		 <img id = "logo" src="../../../Images/soin-logo1.png" alt="소인로고"/>
	   </div>
	
	   <div class ="hor-menu menu-main">
			<ul>
				<li><a href="">소인소개</a></li>
				<li><a href="">업체소개</a></li> 
				<li><a href="">견적요청</a></li> 
				<li><a href="">인테리어Tip</a></li> 
				<li><a href="">시공후기</a></li>
			</ul>
	   	</div>
	 </div> 	 -->
		
<!-- -----바디시작-------------------------------------------	 -->
<div id ="wrap">
	<div id = "body">
	<form method ="post">
	<div class="detail-title">
	
		<div class="left-title">
		제목
		</div>
		<div class="title-cont">
		제목을 입력해주세요.
		</div>
	</div>
	
	<div class="category">
	
		<div class="left-title">
		카테고리
		</div>
		<div class ="construction-sort">
			<a href=""><img class="major" src="../../../Images/yurim/window2.png" alt="창문"/></a>
			<a href=""><img class="major" src="../../../Images/yurim/wallpaper3.png" alt="벽지"/></a>
			<a href=""><img class="major" src="../../../Images/yurim/door2.png" alt="문"/></a>
			<a href=""><img class="major" src="../../../Images/yurim/bath2.png" alt="욕조"/></a>
		</div>
		<div class="category-cont">
			*카테고리를 선택해 주세요.(복수선택 가능)
		</div>
	</div>
	
	<div class="construction-info">
		<div class="left-title">
		시공정보
		</div>
		<div class="construction-cont">
			<!-- 칸나눠서해야할공간. -->
			<div class = "construction-cont1">
				<div class = "con-name1">
				업체명
				</div>
				<div class ="con-name2">
				 <input type="text">
				</div>
			
			</div>
			<div class = "construction-cont2">
				<div class = "con-name1">
				지역명
				</div>
				<div class ="con-name2">
					<select style="margin-top:0px; width:auto; margin-left:auto;">
						<option value="서울시 강남구">서울시 강남구</option>
						<option value="서울시 강동구">서울시 강동구</option>
						<option value="서울시 강북구">서울시 강북구</option>
						<option value="서울시 강서구">서울시 강서구</option>
						<option value="서울시 관악구">서울시 관악구</option>
						<option value="서울시 광진구">서울시 광진구</option>
						<option value="서울시 구로구">서울시 구로구</option>
						<option value="서울시 금천구">서울시 금천구</option>
						<option value="서울시 노원구">서울시 노원구</option>
						<option value="서울시 도봉구">서울시 도봉구</option>
						<option value="서울시 동대문구">서울시 동대문구</option>
						<option value="서울시 동작구">서울시 동작구</option>
						<option value="서울시 마포구">서울시 마포구</option>
						<option value="서울시 서대문구">서울시 서대문구</option>
						<option value="서울시 서초구">서울시 서초구</option>
						<option value="서울시 성동구">서울시 성동구</option>
						<option value="서울시 성북구">서울시 성북구</option>
						<option value="서울시 송파구">서울시 송파구</option>
						<option value="서울시 양천구">서울시 양천구</option>
						<option value="서울시 영등포구">서울시 영등포구</option>
						<option value="서울시 용산구">서울시 용산구</option>
						<option value="서울시 은평구">서울시 은평구</option>
						<option value="서울시 종로구">서울시 종로구</option>
						<option value="서울시 중구">서울시 중구</option>
						<option value="서울시 중랑구">서울시 중랑구</option>

					</select>
					<!-- <select>
						<option value="동">동</option>
						<option value="조회순">조회순</option>
						<option value="인기순">인기순</option>
					</select> -->
				</div>
				
			</div>
			<div class = "construction-cont3">
				<div class = "con-name1">
				공사기간
				</div>
				<div class ="con-name2">
				<input type="text" style="width:50px;" >일
				</div>
			</div>
			<div class = "construction-cont4">
				<div class = "con-name1">
				시공종류
				</div>
				<div class ="con-name2">
				<input type="text" style="width:400px;" >
				</div>
			</div>
			<!-- <div class = "construction-cont5">
				<div class = "con-name1">
				공사비용
				</div>
				<div class ="con-name2">
				<input type="text"  >원
				</div>
			
			</div> -->
		
		</div>
	
	
	</div>
	<div class="detail-cont">
		<div class="left-title">
		상세내용
		</div>
		<div class="construction-cont">
			<form action="" method="post" enctype="multipart/form-data">
			<input type="text" style="width:680px; height:250px;" >
			<input type="file" style="float:right" name="image-upload">
			<input type ="submit" >
			</form>
		</div>
	
			</div>
			<div class="choice-container">
				<div class="flex-choice">
						<div><a href="" class="btn-large">등록하기</a></div>
				  		<div><a href="" class="btn-large">미리보기</a></div>
				  		<div><a href="" class="btn-large">취소하기</a></div>
				</div>
			</div>










			</form>


		</div>
	
	</div>

		
<!-- -풋터----------------------------------------- -->	 
<div id ="footer">
	<div class="root-container">
    <img id ="ceo" src="../../../Images/yurim/소인대표.jpg" alt="소인대표"/>
  	 <div id = "company-info">소인 대표 : James Han<br>
   
			본사 : 서울특별시 마포구 월드컵북로 21
			(지번)서울특별시 마포구 서교동 447-5<br>
			사업자등록번호 : 123-45-67890</div>

		<p id = "customer-svc">고객센터 :1588-1234 평일 10:00 ~ 18:00 / 주말 10:00 ~ 16:00<br>
			팩스 : 02 - 1234 - 5678
			이메일 : cs@soin.kr| 제휴문의 : constructor@soin.kr</p>
	
			<div id = "copyright">Copyrightⓒ 2018 By SOIN All Right Reserved.</div>
    </div>
</div>

<!-- ---사이드바-------------------------------------------- -->
<div id = "side">
 		<a href-"">견적 신청하기</a>
 </div>  

</body>
</html>		
		

</body>
</html>