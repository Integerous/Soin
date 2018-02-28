<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../Css/Style6.css" type="text/css" rel="stylesheet" />
<style type="text/css">
</style>
</head>
<body>
	<header id="header">
		<div class="root-container">
				
					<img id="logo" src="../../../Images/soin-logo.png" alt="소인">
			
			<section class="head-menu">
				<h1 class="hidden">헤더</h1>

				<nav class="hor-menu member-menu">
					<h1 class="hidden">회원메뉴</h1>
					<ul>
						<li><a href=" /SoinProject/Member/Common/login.html">로그인</a></li>
						<li><a href="/SoinProject/Member/Common/register.html">회원가입</a></li>
						<li><a href="/SoinProject/CS/FAQ/MainList.html">고객센터</a></li>
						<li><a href=""><img class = "my-page"src="../../../Images/ic_notifications_black_24dp_2x.png" alt="알림"></a></li>
						<li><a href=""><img class = "my-page"src="../../../Images/ic_account_box_black_24dp_2x.png" alt="마이페이지"></a></li>
					</ul>
				</nav>


			</section>
		</div>
	</header>

	<!-------------- menu 시작------------------ -->
	<div id="main-menu" style="text-align: center">
		<div class="root-container">
			<nav class="hor-menu main-menu main-menu>ul>li fitst-pad-none">
				<h1 class="hidden">메인메뉴</h1>
				<ul>
					<li><a href="">소인소개</a></li>
					<li><a href="">업체소개</a></li>
					<li><a href="">견적요청</a></li>
					<li><a href="">인테리어TIP</a></li>
					<li><a href="">시공후기</a></li>
				</ul>
			</nav>
		</div>

	</div>

	<div id="body">
		<div class="root-container">

			<!--------------------------main 시작----------------------------------->
			<main id="main">
			<section>

				<label><input type="checkbox" value="door">문</label> <label><input
					type="checkbox" value="window">창문</label> <label><input
					type="checkbox" value="wall">벽</label> <label><input
					type="checkbox" value="bathroom">욕실</label> <label><input
					type="checkbox" value="the_others">기타</label>


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

					<form class="form">

						<label>업체검색</label> <input type="text" placeholder="Search..." />
						<input type="submit" value="검색" />

					</form>
				</section>

			</section>
			<hr />


			<c:forEach var="cstrt" items="${list }">
			<section>
				<h2>기본 업체 리스트(가나다 순 정렬 - 전체 리스트)</h2>
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

			</section>
			
		</c:forEach>
				<div class="pagination">
			    <c:forEach var="i" begin="1" end="5">
			   		 <c:if test="${i<=lastPage }">
					<li><a href="?page=${i }">${i }</a></li>
					</c:if>
				</c:forEach>
			</div>
			
			</main>
		</div>
	</div>
	<!---------------------footer -------------------- -->
	<footer id="footer">
		<div class="root-container">소인 소인 대표 : 한정수 본사 : 서울특별시 마포구 월드컵북로
			21 (지번)서울특별시 마포구 서교동 447-5 사업자등록번호 : 123-45-67890 Copyrightⓒ 2018 By
			SOIN All Right Reserved. 1588-1234 고객센터 : 평일 10:00 ~ 18:00 / 주말 10:00
			~ 16:00 팩스 : 02 - 1234 - 5678 이메일 : cs@soin.kr | 제휴문의 :
			constructor@soin.kr</div>

	</footer>



</body>
</html>


>