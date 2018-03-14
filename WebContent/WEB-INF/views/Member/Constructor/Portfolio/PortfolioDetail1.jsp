<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>

<!-- <html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../Css/Style3.css" type="text/css" rel="stylesheet" />
<link href="../../../Css/StyleHF.css" type="text/css" rel="stylesheet" />
<style type ="text/css"></style>
</head> -->
<body>
 
<!-- --바디시작--------------------------------------------- -->	 
 <div id ="wrap">
<div id = "body">

	<div class="detail-title">
		${portfolio.title}
	</div>
	<div class ="detail-info">
		<div>
			<img class="detail-img" src="${ctx}/portfolio/upload/${portfolio.attachedFile}" alt=""/>
		</div>
		<div class="detail-cate">
			<div class="font-content">
				<div style ="float:left; margin:20px">
				카테고리> ${portfolio.category}</div>
				<!-- <img  src="../../../Images/yurim/window2.png" alt="창문"/> -->
			</div>
		<div class="construction-content">
			
			<table border="2" class="detail-table">
				<tr>
					<td>시공 업체</td> <td>${portfolio.memberId}</td>
				</tr>
				<tr>
					<td>시공 지역</td> <td>${portfolio.location}</td>
				</tr>
				<tr>
					<td>시공 기간</td> <td>${portfolio.period}일</td>
				</tr>
				<tr>
					<td>시공 종류</td> <td>${portfolio.category}</td>
				</tr>
				<!-- <tr>
					<td>시공비용</td> <td>1,500,000 원</td>
				</tr> -->
			</table>
		</div>
		<div class="menu-total">
			<div style="padding-left:150px; margin:0; "><p>많이 이용해 주세요:)</p></div>
			<!-- <div class="hits" type="submit" value="조회수:58"> </div> -->
			<div class = "hit-love">
				<!-- <input class="hits" type="submit" value="조회수: 58">
				<input  class="hits" type="submit" value="♥ 좋아요: 20"> -->
			</div>
		</div>
		
		
		</div>
	</div>
	<div class="detail-content">
		${portfolio.content}<br>
		 직접 방문을 해보니, 노후되어 시공하는데 조심스러웠습니다.<br>
  		 저희만의 기술로 시공하여 더욱더 좋아졌네요^^<br>
  		 어떠한 크기도 가능합니다. 저희와 함께라면요!!!!<br>
	</div>
	<div class="choice-container">		
		<div class="flex-choice">
				<!-- <div><a href="" class="btn-large">내용 수정</a></div> -->
		  		<!-- <div><a href="" class="btn-large">게시물 삭제</a></div> -->
		  		<div><a href="${ctx}/Member/Constructor/Portfolio/PortfolioMain" class="btn-large">뒤로가기</a></div>
		</div>
	</div>
</div>

</div>
	 


<!-- ---사이드바-------------------------------------------- -->
<div id = "side">
 		<a href="">견적 신청하기</a>
 </div>  

</body>
