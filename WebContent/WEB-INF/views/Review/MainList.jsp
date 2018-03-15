<%@page import="java.util.List"%>
<%@page import="Soin.review.JdbcReviewDao"%>
<%@page import="Soin.review.Review"%>
<%@page import="Soin.review.ReviewView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"/> 
<%-- <%			
	Review reviewDao = new JdbcReviewDao();
	List<ReviewView> list = reviewDao.getList();
%>	 --%>
	
	
<main class="main-box">
	<div class="sort-box label" style="margin-top:13%">

		<div>
			정렬 <select size="1">
				<option>최신순</option>
				<option>인기순</option>
				<option>조회순</option>
			</select>
		</div>
		<div style="display: flex; align-items: center;">
			분류 
			<img alt="창문" src="../Images/nhy/window_icon.png" class="box1" id="WINDOW">
			<img alt="벽지" src="../Images/nhy/wallpaper2_icon.png" class="box1" id="WALLPAPER">
			<img alt="문" src="../Images/nhy/door_icon.png" class="box1" id="DOOR"> 
			<img alt="욕조" src="../Images/nhy/bathtub_icon.png" class="box1" id="BATHTUB">
		</div>
		<div>
			검색 <input type="search" size="10"> <a href="MainList.html"
				class="button">찾기</a>
		</div>
	</div>
	
	<div class="content-box">
		<%-- <%for(ReviewView n : list){ %>
		<div class="box">
			<img alt="후기메인사진" src="<%=n.getAttachedFile() %>" style="height: 200px; width: 250px;">
			<p><%=n.getConstructionPositionId() %></p>
			<h3>
				<a href=""><%=n.getTitle() %></a>
			</h3>
			<p>작성자 : <%=n.getMemberId() %></p>
		</div>
		<%} %> --%>
		
		<c:forEach var="i" items="${list}">
			<div class="box" href="Detail?id=${i.id}">
				<img alt="후기메인사진" src="${ctx}/SoinProject/Review/upload/${i.attachedFile}" onerror="this.src='${ctx}/Images/nhy/room.jpg'" style="height:200px; width: 250px;">
				<p style="font-style: italic; color: #FAD23D;"> <%-- ${i.constructionTypeId} --%>WINDOW</p>
				<h3><a href="Detail?id=${i.id}">${i.title}</a></h3>
				<p>작성자 : ${i.memberId} </p>			
				<p>작성일 : <%-- ${i.regdate} --%>00/00/00 </p>	
			</div>
		</c:forEach>
		
				 <!-- <div  class="box">
					<img alt="후기메인사진" src="../Images/nhy/review_window.jpg" style="height:200px; width: 250px;">
					<p>창문</p>
					<h3><a href="Detail.html">큰 창으로 쏟아지는 햇빛이 매력적인 방</a></h3>
					<p>작성자 : cocaJJang2</p>			
				</div>
				
				<div  class="box">
					<img alt="후기메인사진" src="../Images/nhy/review_wall.jpg" style="height:200px; width: 250px;">
					<p>벽지</p>
					<h3><a href="Detail.html">아이방 벽지 시공</a></h3>
					<p>작성자 : home_g0g0</p>			
				</div>
				
				<div  class="box">
					<img alt="후기메인사진" src="../Images/nhy/review_bath.jpg" style="height:200px; width: 250px;">
					<p>욕조</p>
					<h3><a href="Detail.html">욕조 시공을 했습니다:D</a></h3>
					<p>작성자 : asdfg88</p>			
				</div>
				
				<div  class="box">
					<img alt="후기메인사진" src="../Images/nhy/review_bath.jpg" style="height:200px; width: 250px;">
					<p>욕조</p>
					<h3><a href="Detail.html">욕조 시공을 했습니다:D</a></h3>
					<p>작성자 : asdfg88</p>			
				</div>
				
				<div  class="box">
					<img alt="후기메인사진" src="../Images/nhy/review_bath.jpg" style="height:200px; width: 250px;">
					<p>욕조</p>
					<h3><a href="Detail.html">욕조 시공을 했습니다:D</a></h3>
					<p>작성자 : asdfg88</p>			
				</div>  -->
				
	
		<div>
			<h3 class="hidden">후기 작성하러 가기</h3>
			<a href="${ctx}/Review/Write" class="button go-button">후기작성하기</a>
		</div>
	</div>
	
	
	
	<div class="pagination">
	      <c:if test="${startNum != 1 }">
	         <a class="btn btn-prev" href="?page=${startNum-1 }" >«</a>
	      </c:if>
	      
	      <c:if test="${startNum == 1}">
	         <a class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');">«</a>
	      </c:if>
	   
	      <c:forEach var="i" begin="0" end="5">        
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
	
