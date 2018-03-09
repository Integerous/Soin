<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <!DOCTYPE html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>
<!-- 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../Css/Style3.css" type="text/css" rel="stylesheet" />
<link href="../../../Css/StyleHF.css" type="text/css" rel="stylesheet" />
<style type ="text/css"></style>
</head> -->
<body>


 <!--  바디!!!----------------------------------------------------------------------------------------- -->   
  <div id ="wrap">
  <div id ="body">
  	


 <!-- ------후기들시작----------------------------------  -->
  		<div class="marginfor">
  		<div class="company-port">
 		 <div class="company-content">
  
		<div class="company-content2">

		<a href=""><img class="img-interior" src="${ctx}/Images/yurim/문1.jpg" alt="문1"/></a>
		<ul class="text-ellipsis">
		<li style="text-align: center;">업체명</li>
		<li>문</li>
		<li style="font-size:11px">튼튼하고 견고한 문으로 바꿔서 좋아해요 </li>
		</ul>
		</div>


		<div class="company-content2">
			<a href=""><img class="img-interior" src="${ctx}/Images/yurim/타일1.jpg" alt="타일1"/></a>
				<ul class="text-ellipsis">
				<li style="text-align: center;">업체명</li>
				<li>벽지</li>
				<li style="font-size:11px">화사한 벽지로 변신!!</li>
				</ul>
		</div>

	<div class="company-content2">
		<a href=""><img class="img-interior" src="${ctx}/Images/yurim/창문1.jpg" alt="창문1"/></a>
			<ul class="text-ellipsis">
				<li style="text-align: center;">업체명</li>
				<li>창문</li>
				<li style="font-size:11px">확트인만큼 빛도 많이 들어오네?</li>
			</ul>
			</div>
  
  	</div>

  <div class="company-content">
  <div class="company-content2">
			<a href=""><img class="img-interior" src="${ctx}/Images/yurim/창문2.jpg" alt="창문2"/></a>
			<ul class="text-ellipsis">
			<li style="text-align: center;">업체명</li>
			<li>창문</li>
			<li style="font-size:11px">실내 창문의 또다른 혁명! 너도나도 고고고</li>
			</ul>
			</div>

		<div class="company-content2">
		<a href=""><img class="img-interior" src="${ctx}/Images/yurim/욕실1.jpg" alt="욕실1"/></a>
			<ul class="text-ellipsis">
			<li style="text-align: center;">업체명</li>
			<li>욕실</li>
		<li style="font-size:11px">깔끔한 모노톤으로 시공완료!</li>
		</ul>
		</div>

		<div class="company-content2">
		<a href=""><img class="img-interior" src="${ctx}/Images/yurim/욕실2.jpg" alt="욕실2"/></a>
		<ul class="text-ellipsis">
			<li style="text-align: center;">업체명</li>
			<li>욕실</li>
			<li style="font-size:11px">세면대와 변기를 바꿨어요</li>
		</ul>
		</div>
		  </div>
  
		  <div class="company-content">
		  <div class="company-content2">
		  <a href=""><img class="img-interior" src="${ctx}/Images/yurim/벽지1.jpg" alt="벽지1"/></a>
		 	 <ul class="text-ellipsis">
		 	 	<li style="text-align: center;">업체명</li>
				<li>벽지</li>
				<li style="font-size:11px">화사한 벽지로 변신!!</li>
			</ul>
		  </div>
		  <div class="company-content2">
		  	<a href=""><img class="img-interior" src="${ctx}/Images/yurim/벽지2.jpg" alt="벽지2"/></a>
		 	 <ul class="text-ellipsis">
		 	 	<li style="text-align: center;">업체명</li>
				<li>창문</li>
				<li style="font-size:11px">최대한 위에 창문을 달았네요</li>
			</ul>
 		 </div>
 		 <div class="company-content2">
  		<a href=""><img class="img-interior" src="${ctx}/Images/yurim/타일1.jpg" alt="타일1"/></a>
  		<ul class="text-ellipsis">
  		<li style="text-align:center;">업체명</li>
		<li>문</li>
		<li style="font-size:11px">같은 색으로 통일했네요 친환경스타일</li>
		</ul>
		  </div>
		  </div>
		  </div>
		  </div>
   
   
       	</div>
       	<!-- 페이지만들기 -->
       	<%-- <div>
       		<c:if test=${startNum !=1}">
       			<a class = pagination" href="?=${startNum-1}">«</a>
       		</c:if>
       		<c:if test="${startNum ==1}">
       			<span class = pagination">«</span>
       		</c:if>
       	</div>
 --%>       	
       	
       
       
    	<div class="pagination">
    	
			   <!--  <a href="#">«</a>
				<a href="#">1</a>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>	
				<a href="#">»</a> -->
				<%-- 
				<c:forEach var="i" begin="0" end="4">
					<c:if test="${startNum+i <= lastPage}">
					
					<a href="?p=${startNum+i}&t=&q=" >${startNum+i}</a>
					</c:if>	
				</c:forEach>	 --%>
				
			<%-- 	
				<div>
			<c:if test="${startNum+5 <= lastPage}">
			<!-- <span class="btn btn-next" onclick="alert('다음 페이지가 없습니다.');">다음</span> -->
			<a class="btn btn-next" href="?p=${startNum+5}">다음</a>
			</c:if>
			<c:if test="${startNum+5 > lastPage}">
			<span class="btn btn-next">다음</span>
			</c:if>
	</div> --%>
				
			</div>
	</div>
    	
 <!-- 풋터!!!-----------------------------------------------------------------------------------------  -->  
  <!--   <div id ="footer">
    	<div class="root-container">
	    <img id ="ceo" src="../../../Images/yurim/소인대표.jpg" alt="소인대표"/>
	  	 <div id = "company-info">소인 대표 : James Han<br>
	   
				본사 : 서울특별시 마포구 월드컵북로 21
				(지번)서울특별시 마포구 서교동 447-5<br>
				사업자등록번호 : 123-45-67890</div>
	
	
			<p id = "customer-svc">고객센터 :1588-1234 평일 10:00 ~ 18:00 / 주말 10:00 ~ 16:00<br>
				팩스 : 02 - 1234 - 5678
				이메일 : cs@soin.kr| 제휴문의 : constructor@soin.kr</p>
				
				<div id = "copyright"><p>Copyrightⓒ 2018 By SOIN All Right Reserved.</p></div>
			 </div>	
    </div>
     -->
 
  
   <!--side bar ------------------------- --> 
 <div id = "side">
 	
 		<a href-"">견적 신청하기</a>
 	
 
 </div>  	
  
  
  
</body>





</html>