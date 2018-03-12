<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 

			<!--------------------------main 시작----------------------------------->

			<main id="main">

			
			<section>

				<label><input type="checkbox" name="category" value="door">문</label> 
				<label><input type="checkbox" name="category" value="window">창문</label> 
				<label><input type="checkbox" name="category" value="wall">벽</label> 
				<label><input type="checkbox" name="category" value="bathroom">욕실</label> 
				<label><input type="checkbox" name="category" value="the_others">기타</label>


				<section>
					<h1 class="hidden">업체 검색 폼</h1>
					<select class="area-list area-list-height">
						<option value="마포구">마포구</option>
						<option value="강남구">강남구</option>
						<option value="강서구" selected="selected">강서구</option>
					</select> 
					
					<select class="area-list">
						<option value="서교동">서교동</option>
						<option value="삼성동">삼성동</option>
						<option value="등촌동" selected="selected">등촌동</option>
					</select>

					<form class="form">

						<label>업체검색</label> 
						<input type="text" name="q" placeholder="Search..." />
						<input type="submit" value="검색" />

					</form>
				</section>

			</section>
			<hr />


			<%-- <c:forEach var="cstrt" items="${list }"> --%>
			<%-- <c:forEach var="constructor" items="${list}"> --%>
			
			<section>
				<h2>기본 업체 리스트(가나다 순 정렬 - 전체 리스트)</h2>
				<section>
					<div class="distance">
						<a href="${ctx }/Detail.html">
							<img src="${ctx }/Images/540x360_20170424122432782_wbxxMRuMIB.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }Detail">평점/5.0</a></li>
							</ul>
					</div>
		
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
							<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
							<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>

				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
						<a href="${ctx }/Detail">
							<img src="${ctx }/Images/soin-logo.png" alt="아델라">
						</a>
							<ul>
								<li><a href="${ctx }/Detail">업체명 : 아델라</a></li>
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
							</ul>
					</div>
				</section>

			</section>
			
		<%-- </c:forEach> --%>
		
		
	<div class="pagination">
		<c:if test="${startNum != 1 }">
			<a class="btn btn-prev" href="?page=${startNum-1 }">«</a>
		</c:if>
		
		<c:if test="${startNum == 1}">
			<a class="btn btn-prev">«</a>
		</c:if>
	
				<c:forEach var="i" begin="0" end="4" >
					<c:if test="${startNum+i<=lastPage}">
					<li><a href="?page=${ startNum+i}&t=&q=" >${startNum+i}</a></li>
					</c:if>
				</c:forEach>
		
			<c:if test="${startNum+5 <=lastPage}">
				<a class="btn btn-next" href="?page=${startNum+5 }">»</a>
			</c:if>
			
			<c:if test="${ startNum+5 >lastPage}">
				<a class="btn btn-next">»</a>
			</c:if>
		
	</div>

	
			
			</main>	
			

