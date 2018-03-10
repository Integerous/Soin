<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>
    
<main id="main">
	<section>
		<h1 class="hidden">회원유형 선택</h1>
		
		<div class="register-box">
			<div class="register-step">
				<ul>
					<li class="selected-step"><span>유형선택</span></li>
					<li><span>정보입력</span></li>
					<li><span>가입완료</span></li>
				</ul>
			</div>
			
			<div class="msg-box mt20">	
					<strong class="msg-strong">유형선택</strong>
					<br />
					 <span class="text-small">회원가입 유형에 따라 가입절차는 다르게 진행됩니다. 회원가입 유형을 선택해주세요.</span>
			</div>
			
			<div class="box-label mt20">
				<img src="${ctx}/Images/phz/write_ico.png" width="15" height="15"><span class="label-text">유형 선택</span>
			</div>
			
			<div class="type-bg">
				<div class=type-input>
					<div class="box-regtype">
						<a class="mt20"  href="registercln_form"><img src="${ctx}/Images/phz/member_client.png"  width="150" height="180"></a>
						<br />
						<a class="mt20"  href="registercln_form"><span class="btn-default">일반회원가입</span></a>
					</div>
					<div class="box-regtype">
						<a class="mt20" href="registercon_form"><img src="${ctx}/Images/phz/member_constructor.png" width="150" height="180"></a>
						<br />
						<a class="mt20"  href="registercon_form"><span class="btn-default">업체회원가입</span></a>
					</div>
				</div>
			</div>
		</div>	
	</section>
</main>