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
					<option value="등촌동	" selected="selected">등촌동</option>
				</select>
			</section>

			<section>
				<form class="form">
					<label>업체검색</label> <input type="text" placeholder="Search..." />
					<input type="submit" value="검색" />

				</form>
			</section>



			<hr />

			<section>
				<h2>내 주변 업체(거리 순 정렬)</h2>
				<section>
					<div class="distance">	
						<a href="Detail.html">
							<img src="../../../Images/jyh/Adela.jpg" alt="아델라">
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
							<img src="../../../Images/jyh/Beanu.jpg" alt="아델라">
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
							<img src="../../../Images/jyh/Daum.jpg" alt="아델라">
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
							<img src="../../../Images/jyh/DesignJ.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail.html">업체명 : 아델라</a></li>
								<li><a href="Detail.html">평점/5.0</a></li>
							</ul>
					</div>

				</section>
				<div>
					<a href="${ctx }/member/constructor/list/surround" class="button button-more">더보기</a>
				</div>

			</section>

			<br />
			<br />
			<hr />



			<section>
				<h2>업체 랭킹(평점 순 정렬)</h2>
				<section>
					<c:forEach var="constructor" items="${list1}" begin="0" end="3">
					<div class="distance">
						<a href="detail?member_id=${constructor.member_id }"> 
							<img src="${ctx }/Images/540x360_20170424122432782_wbxxMRuMIB.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="detail?member_id=${constructor.member_id }">${constructor.name }</a></li>
								<li><a href="detail?member_id=${constructor.member_id }">평점 : ${constructor.gpa}</a></li>
							</ul>
					</div>
				</c:forEach>
				</section>

<!-- 				<section>
					<div class="distance">
						<a href="Detail.html">
							<img src="../../../Images/jyh/LSDesign.jpg" alt="아델라">
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
				</section> -->
				<div>
					<a href="${ctx }/member/constructor/list/gpa" class="button button-more">더보기</a>
				</div>
			</section>

			<br />	
			<br />
			<hr />

			<section>
				<h2>기본 리스트</h2>
				<section>
					<c:forEach var="constructor" items="${list}" begin="0" end="3">
					<div class="distance">
						<a href="detail?member_id=${constructor.member_id }"> 
							<img src="${ctx }/Images/jyh/Daum.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="detail?member_id=${constructor.member_id }">${constructor.name }</a></li>
								<li><a href="detail?member_id=${constructor.member_id }">평점 : ${constructor.gpa}</a></li>
							</ul>
					</div>
				</c:forEach>
				</section>

				<!-- <section>
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
				</section> -->
				<div>
					<a href="${ctx }/member/constructor/list/default" class="button button-more">더보기</a>
				</div>
			</section>




			</main>