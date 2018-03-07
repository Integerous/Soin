<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />    
    
    
<main id="main">
	<section>
		<h1 class="hidden">회원유형 선택</h1>
		
		<div class="register-box">
			<div class="register-step">
				<ul>
					<li><span>유형선택</span></li>
					<li><span>정보입력</span></li>
					<li><span>가입완료</span></li>
				</ul>
			</div>
			
			<div class="msg-box mt20">	
					<strong class="msg-strong">가입완료</strong>
					<br />
					<span class="text-small">회원가입이 완료되었습니다.</span>
			</div>


			<div class="info-bg mt20 mb20" >
				<img src="${ctx}/Images/phz/regi_success.png" width="250px" height="250px">
						
				<p class=mt20>지금 바로 로그인하시면 소인의 다양한 서비스를 이용하실 수 있습니다. <br /></p>
			</div>		
				<a class ="btn-default btn-huge mb" href="${ctx}/index"><span>메인으로</span></a>
				<a class ="btn-default btn-huge" href="login"><span>로그인</span></a>		

		</div>	
	</section>
</main>