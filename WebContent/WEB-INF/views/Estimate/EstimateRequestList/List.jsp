<%@page import="Soin.EstimateRequest.EstimateRequestView"%>
<%@page import="java.util.List"%>
<%@page import="Soin.EstimateRequest.EstimateRequestDao"%>
<%@page import="Soin.EstimateRequest.JdbcEstimateRequestDao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
	
<!-- ------------logo & title------------ -->			

<!-- ------------navigation------------ -->


<!-- ---------------------MAIN---------------------- -->	
	<main>
	
<!-- ------------progress bar------------ -->		
	
<!-- ------------form wrapper------------ -->		
		<div class="form-wrapper">

<!-- ------------견적의뢰서  타이틀------------ -->
			<section class="form-title">
				<img src="../../Images/ic_playlist_add_check_black_24dp_2x.png" alt="check-box2" />
					<div class="ft-container">
						견적요청 게시판
					</div>
			</section>

<!-- ------------견적리스트------------ -->			
		<!-- <section class="request-form"> -->
		<div class="li-container">
			<div class="row">
				<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
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
								<td class="text-align-left text-indent text-ellipsis"><a
									href="detail.jsp?id=${ai.id}">${ai.title}</a></td>

								<td>
									<%-- <%=((List<Answeris>)request.getAttribute("list")).get(0).getLanguage()%> --%>
									<%-- ${list[0].language} --%> ${ai.language}
								</td>

								<td class="text-ellipsis">${ai.platform}</td>

								<td>${ai.regDate}</td>

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
					
					<a href="Form1.jsp" class="btn btn-primary pull-right"> 견적 요청하기</a>
				</table>
			</div>
		</div>



		<!-- ------------button container------------ -->
		<div class="btn-container">
		
			<div class="previous-button">
				<c:if test="${startNum != 1}">
					<button class="prev-btn" onclick="location.href='?p=${startNum-1}'"><span>이전</span></button>
				</c:if>
				<c:if test="${startNum == 1}">
					<button class="prev-btn"><span>이전</span></button>
				</c:if>
		
			</div>
			<ul class="pager-list">
		
				<!-- 객체 i에다가 담아준다 값을 -->
				<c:forEach var="i" begin="0" end="4">
					<c:if test="${startNum+i <= lastPage}">
						<li><a href="?p=${startNum+i}&t=&q=">${startNum+i}</a></li>
					</c:if>
				</c:forEach>
		
			</ul>
			<div class="next-button">
				<c:if test="${startNum+5 <= lastPage}">
					<button class="next-btn" onclick="location.href'?p=${startNum+5}'"><span>다음</span></button>
				</c:if>
				<c:if test="${startNum+5 > lastPage}">
					<button class="next-btn"><span>다음</span></button>
				</c:if>
		
		
			</div>
		
		</div>		
		
		
<!-- ------------견적 요청하기  button------------ -->			    
		    <div class="request-button">
		      <button class="request-btn"><span>견적 요청하기</span></button>
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