<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
    
    
    <!-- ---------------------HEADER---------------------- -->

<!-- ------------top-bar------------ -->
	<header>
		<div id="top-bar">
			<div class="tb-container">
				
				<c:if test="${not empty sessionScope.id}">
				<div class="login-status">
					<a href="${ctx}/Member/Common/logout">로그아웃</a></div>
				</c:if>
					
				<c:if test="${empty sessionScope.id}">	
				<div class="logout-status">
					<a href="${ctx}/Member/Common/login">로그인</a></div>
				</c:if>
				
				<c:if test="${empty sessionScope.id}">	
				<div class="logout-status">
					<a href="${ctx}/Member/Common/register">회원가입</a></div>
				</c:if>
				
				<div><a href="#">고객센터</a></div>
				<%-- <div class="notifications"><a href="#" >
					<img src="${ctx}/Images/ic_notifications_active_black_24px.svg"/></a></div> --%>
				<div><a href="${ctx}/MyPage/Client/MyProfile/MyProfile.jsp ">마이페이지</a></div>
			</div>
		</div>
	
<!-- ------------logo & title------------ -->			
		<div id="mid-bar">
			<div class="mb-container">
				<div class="logo">
					<a href="${ctx}/index">
					<img src="${ctx}/Images/logo_js.png" alt="Soin_Logo" /></a>
				</div>
				
					<a href="${ctx}/index">소인</a>
					
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
					<a href="${ctx}/Introduce/introduce">소인소개</a></div>
				<div class="hello-contr">
					<a href="${ctx}/member/constructor/list/main">업체소개</a></div>
				<div class="est-request">
					<a href="${ctx}/estimate/EstimateRequestForm/Form1">견적의뢰</a></div>
				<div class="tip">
					<a href="${ctx}/InteriorTip/SelfTip/Main01">인테리어 TIP</a></div>
				<div class="review">
					<a href="${ctx}/Review/MainList">시공후기</a></div>
			</nav>
		</div>
			
		<div class="liner"></div>
		
	</header>