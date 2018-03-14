<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="Soin.Constructor.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 

			<main id="main">


			<h1>업체 상세 정보</h1>

			<section>
				<section class="box">
				
						<div>
							<img class="constructore-img" src="../../../Images/jyh/Adela.jpg"
								alt="아델라">

							<form>
								<label style="font-weight: bold;">상호명</label> <a>${constructor.name }</a>
							</form>
							<form>
								<label class="rank-label" style="font-weight: bold;">평점</label> <a>${constructor.gpa }</a>

							</form>

							<div>
								해쉬태그<br>#우와 #너무<br> #어려워 #뉴뉴...
							</div>
						</div>
					
				</section>

				<div class="box">
				<img src="${ctx }/Images/phz/write_ico.png" alt="아이콘"style="height:15px; width:15px;">
					<div class="box-display">업체 정보</div>
					<table class="table">
						<tr>
							<th>대표자명</th>
							<td>${constructor.ceoName }</td>
						</tr>

						<tr>
							<th>주소</th>
							<td>${constructor.address }</td>
						</tr>

						<tr>
							<th>연락처</th>
							<td>010-1234-5678</td>
						</tr>

						<tr>
							<th>홈페이지</th>
							<td>${constructor.homepageAddress }</td>
						</tr>
					</table>
					<img src="${ctx }/Images/phz/write_ico.png" alt="아이콘"style="height:15px; width:15px;">
					<div class="box-display">업체 소개</div>

					<div>
						<textarea class="textarea-size">${constructor.introduction}</textarea>
					</div>
				</div>


				<section>
					<div class="box">
						<div>
							<img class="area-distance-img"
								src="../../../Images/jyh/mapExam.png" alt="나와의거리">
							<form class="distance-form">
								<label>나와의거리</label> <input type="text" placeholder="10km">
							</form>


							<div>
								<input class="btn" type="submit" value="☆즐겨찾기"> <input
									class="btn" type="submit" value="♡좋아요"> <input
									class="btn" type="submit" value="〃공유">
							</div>
						</div>
					</div>

				</section>
			</section>

			<hr />

			<div>
				<h1>포트폴리오</h1>
			</div>

			<div class="box-display">
				<section class="box">
					<div class="distance">
						<div>
							<img src="../../../Images/jyh/Adela.jpg" alt="아델라">
							<li>서교동/벽지</li>
						</div>
					</div>


					<div class="distance">
						<div>
							<img src="../../../Images/jyh/Beanu.jpg" alt="아델라">
							<li>사2동/창문</li>
						</div>
					</div>



					<div class="distance">
						<div>
							<img src="../../../Images/jyh/Daum.jpg" alt="아델라">
							<li>본오동/문</li>
						</div>
					</div>

				</section>
			</div>
			<div class="box">

				<div><a href="${ctx}/estimate/EstimateRequestForm/Form1">
					<input class="btn btn-size" type="submit" value="견적요청">
					</a>
				</div>

				<div>
				<a href="${ctx}/member/constructor/portfolio/portfolioList">
					<input class="btn btn-size btn-margin" type="submit" value="더보기"
					 <%-- onclick = "location.href='${ctx}/Review/MainList'" --%>>
					 </a>
				</div>
			</div>
			<hr />
	<div>
				<h1>고객후기</h1>
			</div>

			<div class="box-display">
				<section class="box">
					<div class="distance">
						<div>
							<img src="../../../Images/jyh/Adela.jpg" alt="아델라">
							<li>서교동/벽지</li>
						</div>
					</div>


					<div class="distance">
						<div>
							<img src="../../../Images/jyh/Beanu.jpg" alt="아델라">
							<li>사2동/창문</li>
						</div>
					</div>



					<div class="distance">
						<div>
							<img src="../../../Images/jyh/Daum.jpg" alt="아델라">
							<li>본오동/문</li>
						</div>
					</div>

				</section>
			</div>
			<div class="box">

				<div><a href="${ctx}/estimate/EstimateRequestForm/Form1">
					<input class="btn btn-size" type="submit" value="견적요청">
					</a>
				</div>

				<div>
				<a href="${ctx}/Review/MainList">
					<input class="btn btn-size btn-margin" type="submit" value="더보기"
					 <%-- onclick = "location.href='${ctx}/Review/MainList'" --%>>
					 </a>
				</div>
			</div>



			</main>

