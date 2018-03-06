<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 
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


			<section>
				<h2>내 주변 업체(거리 순 정렬, 벽 필터에 해당 되는 업체)</h2>
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
				<div>
					<a href="list1.html" class="button button-more">더보기</a>
				</div>

			</section>

			<br />
			<br />
			<hr />



			<section>
				<h2>업체 랭킹(펑점 순 정렬, 벽 필터에 해당 되는 업체)</h2>
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
				<div>
					<a href="RankingMain.html" class="button button-more">더보기</a>
				</div>
			</section>

			<br />
			<br />
			<hr />

			<section>
				<h2>기본 리스트(게시판 형태 4x3,가나다 순 정렬, 벽 필터에 해당 되는 업체)</h2>
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
				<div>
					<a href="list8.html" class="button button-more">더보기</a>
				</div>
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


