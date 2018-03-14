<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />

	<main id = "main">
		<div class = "root-container">
		
			
			<div class = "detail-title-box">
				<div class = "detail-title">
					${interiorTip.title }
				</div>
				
				<div class = "detail-popularity">
					댓글 수 :${interiorTip.commentCount }		/		 좋아요: ${interiorTip.likeCount }
					<hr>
				</div>
			</div>
			
			
			<div class = "detail-content">
				<div class = "detail-img">
					<img class = "images" src = "${ctx}/soin/upload/InteriorTip/${interiorTip.attachedFile}">
				</div>
				
				<div class = "detail-text">
					${interiorTip.content }
				</div>
			</div>
			
			
			<div class = "detail-btn">
				<input type = "button" value = "목록" onclick = "location.href = 'Main01'" class = "btn">
			</div>
		</div>
	</main>