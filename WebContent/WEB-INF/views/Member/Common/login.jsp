<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<script src="Popup/js/find.js" type="text/javascript" ></script>
<main id="main">
	<section>
		<h1>로그인 화면</h1>
		<div class="login-box">
			<h1 class="hidden">로그인 양식</h1>
			<div class="top-padding">
				<img src="${ctx}/Images/phz/logocopy.png" >
			</div>
			
			<div class="msg-box">
				<img src="${ctx}/Images/phz/dquote_front.png" width="30" height="30">
				<span class="msg-strong"><strong style="color:#4BCBE5;">소인</strong>과 함께 시작하는 나만의 독특한 인테리어 생활</span>
				<img src="${ctx}/Images/phz/dquote_back.png" width="30" height="30">
				<br>
				<span class="text-small">로그인하시면 소인의 다양한 서비스를 바로 이용하실 수 있습니다.</span>
			</div>
			
			<div class="login-bg">
				<form>
					<div class="login-input">					
						<ul>
							<li>
								<label class="hidden">아이디</label>
								<input type="text" class="input" value="" placeholder="아이디를 입력해주세요." maxlength="20">
							</li>
							
							<li>
								<label class="hidden">비밀번호</label>
								<input type="password" class="input" value="" placeholder="비밀번호를 입력해주세요." maxlength="20">
							</li>
						</ul>
							
						<span>	
							<input type="checkbox" value="remember-id">아이디 기억하기
							<br>
						</span>	
							
						<div>
							<input type="submit" class="btn-login btn-a" value="로그인">
						</div>		
					</div>
				</form>
			</div>	
								
			<div class="login-etc">
				<ul>
					<li>
						<p>	
							<span>아이디나 비밀번호를 잊어버리셨나요?</span>
							<span><input type="button" class="btn-small" style="right: 85px" id="find-id" value="ID찾기"></span>
							<span><input type="button" class="btn-small" href="" id="find-pw" value="PW찾기"></span>
						</p>
					</li>
						
					<li>
						<p>
							<span>아직 회원가입을 하지 않으셨나요?</span>
							<span><a class="btn-small" href="register">회원가입</a></span>
						<p>
					</li>
				</ul>
			</div>
		</div>
	</section>
</main>