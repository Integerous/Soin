<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 견적의뢰 - 소규모 인테리어 시공 중개 플랫폼 소인</title>
<link href="../../../../../Css/Style4.css" type="text/css" rel="stylesheet"/>

</head>
<body>
	
<!-- <div id="grid">	 -->
<!-- ---------------------HEADER---------------------- -->

<!-- ------------top-bar------------ -->
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

<!-- ---------------------MAIN---------------------- -->	
	<main>
	
<!-- ------------progress bar------------ -->		
			<div class="pb-bar">
				<section class="progress-bar">
						<div class="step1">STEP 1</div>
						<div class="step2">STEP 2</div>
						<div class="current-step">STEP 3</div>
						<div class="step4">STEP 4</div>
				</section>
							
				<div class="triangle">
					 <div class="ta-1"></div>
					 <div class="ta-2"></div>
					 <div class="current-ta"></div>
					 <div class="ta-4"></div>
				</div>
			</div>
			
<!-- ------------form wrapper------------ -->		
		<div class="form-wrapper">

<!-- ------------견적의뢰서  타이틀------------ -->
			<section class="form-title">
				<img src="../../Images/ic_playlist_add_check_black_24dp_2x.png" alt="check-box2" />
					<div class="ft-container">
						견적의뢰서 요약
					</div>
			</section>

<!-- ------------견적의뢰서 요약------------ -->			
		<section class="request-form">
					<div>
						<table class="table">
					<thead>
						<tr>
							<th class="expand">제목</th>
							<th class="w100">언어</th>
							<th class="w100">플랫폼</th>
							<th class="w100">작성일</th>
						</tr>
					</thead>
					<tbody>
					
					<%-- <% for(AnswerisView a : list){%> --%>
					<c:forEach var="ai" items="${list}">
					<tr>
						<td class="text-align-left text-indent text-ellipsis">
						<a href="detail.jsp?id=${ai.id}">${ai.title}</a>
						</td>
						
						<td>
							<%-- <%=((List<Answeris>)request.getAttribute("list")).get(0).getLanguage()%> --%>
							<%-- ${list[0].language} --%>
							${ai.language}
						</td>
						
						<td class="text-ellipsis">
							${ai.platform}
						</td>
						
						<td>
							${ai.regDate}
						</td>
					
					</tr>
				<%-- 	<% }%> --%>
					</c:forEach>
					
					
					<%-- <% if(list.size() == 0){%> --%>
					<tr>
					<td colspan="4">작성된 글이 없습니다.</td>
					</tr>
					<%-- <% }%> --%>
					
					</tbody>
				</table>
					</div>
					


<!-- ------------button container------------ -->
		<div class="btn-container">
		
<!-- ------------previous button------------ -->	
			<div class="previous-button">
				<button class="prev-btn" onclick="location.href='form2.jsp'"><span>이전</span></button>
			</div>
<!-- ------------next button------------ -->							
			<div class="next-button">
		      <button class="next-btn"><span>다음</span></button>
		    </div>
	    
		</div>  
		    
		    
		    
		    
		    
			</section>
		</div>
	</main>

<!-- ---------------------FOOTER---------------------- -->	
		<footer>
			<p> Copyright 2018 SoinProject</p>
		</footer>
		
</body>
</html>