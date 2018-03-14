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
					<option value="마포구" selected="selected">마포구</option>
						<option value="관악구">관악구</option>
						<option value="광진구">광진구</option>
						<option value="구로구">구로구</option>
						<option value="금천구">금천구</option>
						<option value="노원구">노원구</option>
						<option value="도봉구">도봉구</option>
						<option value="동대문구">동대문구</option>
						<option value="동작구">동작구</option>
						<option value="서대문구">서대문구</option>
						<option value="강남구">강남구</option>
						<option value="서초구">서초구</option>
						<option value="성동구">성동구</option>
						<option value="성북구">성북구</option>
						<option value="양천구">양천구</option>
						<option value="영등포구">영등포구</option>
						<option value="용산구">용산구</option>
						<option value="은평구">은평구</option>
						<option value="종로구">종로구</option>
						<option value="중구">중구</option>
						<option value="중랑구">중랑구</option>
				</select> 
				
				<select class="area-list">
					<option value="서교동" selected="selected">서교동</option>
						<option value="강일동">강일동</option>
						<option value="수유동">수유동</option>
						<option value="발산동">발산동</option>
						<option value="남현동">남현동</option>
						<option value="화양동">화양동</option>
						<option value="구로동">구로동</option>
						<option value="가산동">가산동</option>
						<option value="상계동">상계동</option>
						<option value="도봉동">도봉동</option>
						<option value="장안동">장안동</option>
						<option value="상도동">상도동</option>
						<option value="망원동">망원동</option>
						<option value="신촌동">신촌동</option>
						<option value="서초동">서초동</option>
						<option value="행당동">행당동</option>
						<option value="석촌동">석촌동</option>
						<option value="문래동">문래동</option>
						<option value="한남동">한남동</option>
						<option value="신사동">신사동</option>
						<option value="삼청동">삼청동</option>
						<option value="명동">명동</option>
						<option value="상봉동">상봉동</option>
				</select>
			</section>

			<form class="form">

				<label>업체검색</label> <input type="text" placeholder="Search..." /> <input
					type="submit" value="검색" />
			</form>

			<hr />


			<section>
				<h2>업체 랭킹(시공 수 정렬-전체 리스트)</h2>
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


