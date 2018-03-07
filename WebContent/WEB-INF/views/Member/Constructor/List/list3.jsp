<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 
<<<<<<< HEAD
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../Css/Style6.css" type="text/css" rel="stylesheet" />
<link href="../../Css/StyleHF.css" type="text/css" rel="stylesheet" />
<style type="text/css">
</style>
</head>
<body>
	<header>
		<div id="top-bar">
			<div class="tb-container">
				<div class="login-status" style="display:none;">
					<a href="#">로그아웃</a></div>
					
				<div class="logout-status">
					<a href="/SoinProject/Member/Common/login.html">로그인</a></div>
				<div class="logout-status">
					<a href="/SoinProject/Member/Common/register.html">회원가입</a></div>
				<div><a href="/SoinProject/CS/FAQ/MainList.html">고객센터</a></div>
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

	<div id="body">
		<div class="root-container">

			<!--------------------------main 시작----------------------------------->
=======
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
			<main id="main">
			<section>

				<label><input type="checkbox" value="door">문</label> <label><input
					type="checkbox" value="window">창문</label> <label><input
					type="checkbox" value="wall">벽</label> <label><input
					type="checkbox" value="bathroom">욕실</label> <label><input
					type="checkbox" value="the_others">기타</label>
			</section>

			<section>

				<h1 class="hidden">업체 검색 폼</h1>
				<select class="area-list area-list-height">
					<option value="마포구">마포구</option>
					<option value="강남구">강남구</option>
					<option value="강서구" selected="selected">강서구</option>
				</select> <select class="area-list">
					<option value="서교동">서교동</option>
					<option value="삼성동">삼성동</option>
					<option value="등촌동" selected="selected">등촌동</option>
				</select>
			</section>

			<form class="form">

				<label>업체검색</label> <input type="text" placeholder="Search..." /> <input
					type="submit" value="검색" />
			</form>

			<hr />


			<section>
				<h2>가까운 업체 리스트(거리 순 정렬-전체 리스트 중 5km 초과)</h2>
				<section>
				
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/540x360_20170424122432782_wbxxMRuMIB.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
			
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.</a></li>
							</ul>
					</div>

				</section>

			</section>

				<div class="pagination">
			    <a href="#">«</a>
				<a href="#">1</a>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>	
				<a href="#">»</a>
				
			</div>
			
			</main>


