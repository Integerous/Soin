<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<<<<<< HEAD
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 


=======
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 
<<<<<<< HEAD
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${ctx }/Css/Style6.css" type="text/css" rel="stylesheet" />
<link href="${ctx }/Css/StyleHF.css" type="text/css" rel="stylesheet" />
<style type="text/css">
</style>
</head>
<body>
	<header>
		<div id="top-bar">
			<div class="tb-container">
				<div class="login-status" style="display:none;">
					<a href="${ctx }/#">로그아웃</a></div>
					
				<div class="logout-status">
					<a href="${ctx }/SoinProject/Member/Common/login.html">로그인</a></div>
				<div class="logout-status">
					<a href="${ctx }/SoinProject/Member/Common/register.html">회원가입</a></div>
				<div><a href="${ctx }/SoinProject/CS/FAQ/MainList.html">고객센터</a></div>
				<div class="notifications"><a href="#" >
					<img src="${ctx }/Images/ic_notifications_active_black_24px.svg"/></a></div>
				<div><a href="${ctx }/#">마이페이지</a></div>
			</div>
		</div>
	
<!-- ------------logo & title------------ -->			
		<div id="mid-bar">
			<div class="mb-container">
				<div class="logo">
					<a href="${ctx }/index">
					<img src="${ctx }/Images/logo_js.png" alt="Soin_Logo" /></a>
				</div>
				
					<a href="${ctx }/#">소인</a>
					
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
					<a href="${ctx }/#">소인소개</a></div>
				<div class="hello-contr">
					<a href="${ctx }/#">업체소개</a></div>
				<div class="est-request">
					<a href="${ctx }/#" style="color:gold">견적의뢰</a></div>
				<div class="tip">
					<a href="${ctx }/#">인테리어 TIP</a></div>
				<div class="review">
					<a href="${ctx }/#">시공후기</a></div>
			</nav>
		</div>
			
		<div class="liner"></div>
		
	</header>

	<div id="body">
		<div class="root-container">

			<!--------------------------main 시작----------------------------------->
=======
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
			<main id="main">
<<<<<<< HEAD
=======
			<hr/>
			<hr/>
			<hr/>
			<hr/>
			<hr/>
			<hr/>
			<hr/>
			<hr/>
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
			
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
<<<<<<< HEAD
					<li><a href="${ctx }Detail">평점/5.0</a></li>
					
					<li><a href="${ctx }/Detail">평점/5.0</a></li>
					</ul>
=======
<<<<<<< HEAD
								<li><a href="${ctx }Detail">평점/5.0</a></li>
=======
								<li><a href="${ctx }/Detail">평점/5.0</a></li>
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
							</ul>
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
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
<<<<<<< HEAD

=======
<<<<<<< HEAD
						<a href="Detail.html">
=======
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
						<a href="${ctx }/Detail">
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
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
<<<<<<< HEAD
								</ul>
=======
<<<<<<< HEAD
							</ul>
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
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
<<<<<<< HEAD
</ul>
					</div>
				</section>

				<section>
					<div class="distance">

						<a href="${ctx }/Detail">

=======
=======
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
							</ul>
					</div>
				</section>

				<section>
					<div class="distance">
<<<<<<< HEAD
						<a href="Detail.html">
=======
						<a href="${ctx }/Detail">
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
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
<<<<<<< HEAD
</ul>
=======
<<<<<<< HEAD
=======
							</ul>
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
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
<<<<<<< HEAD
</ul>
=======
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
							</ul>
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
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
<<<<<<< HEAD



</main>

=======
<<<<<<< HEAD
	<!---------------------footer -------------------- -->
	<footer>
 	<div id ="footer">
       <div class="root-container">
       <img id ="ceo" src="${ctx }/Images/yurim/소인대표.jpg" alt="소인대표"/>
         <div id = "company-info">소인 대표 : 한정수<br>
      
            본사 : 서울특별시 마포구 월드컵북로 21
            (지번)서울특별시 마포구 서교동 447-5<br>
            사업자등록번호 : 123-45-67890</div>
   
   
         <p id = "customer-svc">고객센터 :1588-1234 평일 10:00 ~ 18:00 / 주말 10:00 ~ 16:00<br>
            팩스 : 02 - 1234 - 5678
            이메일 : cs@soin.kr| 제휴문의 : constructor@soin.kr</p>
            
            <div id = "copyright"><p>Copyrightⓒ 2018 By SOIN All Right Reserved.</p></div>
          </div>   
    </div>
</footer>



</body>
</html>

=======
		
	
			
			</main>	
			
			
			
			
			
			
	
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
>>>>>>> branch 'master' of https://github.com/ryan-js/SoinProject.git
