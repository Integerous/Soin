<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx"  value="${pageContext.request.servletContext.contextPath }"></c:set>

<main id="main">
	<section>
		<h1>견적 신청 카테고리 선택</h1>
		<div class="category">
			<p><strong>무엇을 바꾸고 싶으신가요?</strong></p>

			
			<div class="btn btn-window">
				<a href=""><img src="${ctx }/Images/phz/window.png" alt="창문"></a>
			</div>
			<div class="btn btn-door">
				<a href=""><img src="${ctx }/Images/phz/door.png" alt="문"></a>
			</div>
			<div class="btn btn-bath">	
				<a href=""><img src="${ctx }/Images/phz/bath.png" alt="욕실"></a>
			</div>
			<div class="btn btn-wallpaper">
				<a href=""><img src="${ctx }/Images/phz/wallpaper.png" alt="벽지"></a>
			</div>
		</div>
	</section>
</main>