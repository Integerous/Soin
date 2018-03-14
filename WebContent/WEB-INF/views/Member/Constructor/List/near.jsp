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
					<option value="등촌동" selected="selected">등촌동</option>
				</select>
			</section>

			<form class="form">

				<label>업체검색</label> <input type="text" placeholder="Search..." /> <input
					type="submit" value="검색" />
			</form>

			<hr />


			<section>
				<h2>내 주변 업체 리스트(거리 순 정렬-5km 이내 업체만)</h2>
				<section>
				
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/540x360_20170424122432782_wbxxMRuMIB.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
			
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="Detail?id=">
							<img src="../../../Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="Detail?id=">업체명 : 아델라</a></li>
								<li><a href="Detail?id=">평점/5.</a></li>
							</ul>
					</div>

				</section>

			</section>

		<div class="pagination">
		<c:if test="${startNum != 1 }">
			<a class="btn btn-prev" href="?page=${startNum-1 }" >«</a>
		</c:if>
		
		<c:if test="${startNum == 1}">
			<a class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');">«</a>
		</c:if>
	
				<c:forEach var="i" begin="0" end="4">
        
        	<c:if test="${startNum+i<=lastPage }">
        	
      
         	 <a class="btn btn-next" href="?page=&p=${startNum+i }">${startNum+i }</a>
      
        
     		</c:if>
     		
		</c:forEach>
		
			<c:if test="${startNum+5 <=lastPage}">
				<a class="btn btn-next" href="?page=${startNum+5 }">»</a>
			</c:if>
			
			<c:if test="${ startNum+5 >lastPage}">
				<a class="btn btn-next" onclick="alert('다음 페이지가 없습니다.');">»</a>
			</c:if>
				
			</div>

			
			</main>

