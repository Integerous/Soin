<%@page import="Soin.review.JdbcReviewDao"%>
<%@page import="Soin.review.ReviewDao"%>
<%@page import="Soin.review.ReviewView"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"/> 
<%-- <%
	String id = request.getParameter("id");

	ReviewDao reviewDao = new JdbcReviewDao();
	ReviewView review = reviewDao.get(id);
%> --%>
	<main class="main-box" style="margin-top:9%">
			<div>
				<h1 class="content-title">┃ ${review.title} </h1>
				<ul class="title-box2 label2">
					<li> - 작성자 : ${review.memberId}</li>
					<li> - 작성일 : ${review.regdate}</li>
					<li> - 시공평점 : ${review.gradePoint} 점</li>			
				</ul>
			</div>
			<h3 class="hidden">후기상세</h3>
			
				<table class="form2">
					<tbody>					
						<tr style="background: #ECF0F1;">
							<th colspan="4" class="label">시공정보</th>
						</tr>
						<tr style="background-color: #FFFFFF;">
							<td colspan="4" style="padding:10px 30px 10px 30px; border-bottom: 1px solid #A9A9A9; border-top: 1px solid #A9A9A9">
								시공 카테고리 : 창문<br>
								시공 업체 : 쌍용 인테리어<br>
								시공 기간 : 2주<br>
								시공 지역 : 서울특별시 마포구<br>
							</td>
						</tr>		
												
						<tr style="background-color: #ECF0F1;">
							<th colspan="4" class="label">후기내용</th>
						</tr>
						<tr style="background-color: #FFFFFF;">
							<td colspan="4"  style="padding:20px; border-top: 1px solid #A9A9A9;">
								<img alt="후기메인사진" src="${ctx}/SoinProject/Review/upload/${review.attachedFile}" onerror="this.src='${ctx}/Images/nhy/room.jpg'" style="height:340px; width:420px; text-align: center ; "><br><br>
								${review.content}
							</td>
						</tr>						
					</tbody>
				</table>
			
				<div>
					<a href="${ctx}/Review/MainList" class="button text-button list-button2" ></a>
				</div>
			
				
	</main>
	
