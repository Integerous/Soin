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
					<strong class="msg-strong">정보입력</strong>
					<br />
					<span class="text-small">업체 정보를 입력해주십시오. 회원가입에는 사업자 인증 필요합니다.</span>
			</div>
			
			<div class="box-label mt20">
				<img src="${ctx}/Images/phz/write_ico.png" width="15" height="15"><span class="label-text">정보 입력</span>
			</div>
			<form>
				<div class="info-bg" >
					<fieldset>
					<legend class= "hidden">정보입력폼</legend>
						<ul>
							<li><label class="label-text">업체명</label><input class="input-short"  type="text" ><a class="btn-input" href="">업체찾기</a><br /></li>
						
							<li><label class="label-text">사업자등록번호</label><input class="marl5 input-sh-short"  type="text" ><input class="input-sh-short"  type="text" ><input class="input-sh-short"  type="text" >
							
							<li><label class="label-text">아이디</label><input class="input-short"  type="text" ><a class="btn-input" href="">중복체크</a><br /></li>
							
							<li><label class="label-text">비밀번호</label><input class="input"  type="password" ><br /></li>
							
							<li><label class="label-text">비밀번호 확인</label><input class="input"  type="password" ><br /></li>
							
							<li><span class="text-small">*비밀번호를 한 번 더 입력해주세요.</span><br /></li>
							
							<li><label class="label-text">이메일</label><input class="input"  type="text" ><br /></li>
							
							<li><label class="label-text">연락처(핸드폰)</label>
									<select>
										<option value="010">010</option>
										<option value="011">011</option>
										<option value="016">016</option>
										<option value="016">017</option>
										<option value="016">018</option>
										<option value="109">019</option>
									</select><input class="input-sh-short"  type="text" ><input class="input-sh-short"  type="text" >
									<br />
									
							<li><label class="label-text">연락처(회사)</label>
									<select>
										<option value="02">02</option>
										<option value="031">031</option>
										<option value="032">032</option>
										<option value="041">041</option>
										<option value="042">042</option>
										<option value="043">043</option>
										<option value="044">044</option>
										<option value="051">051</option>
										<option value="052">052</option>
										<option value="053">053</option>
										<option value="054">054</option>
										<option value="055">055</option>
										<option value="061">061</option>
										<option value="062">062</option>
										<option value="064">064</option>		
									</select><input class="input-sh-short"  type="text" ><input class="input-sh-short"  type="text" >
									<br />		
							</li>
						
						
							<li><label class="label-text">우편번호</label><input class="input-short"  type="text" ><a class="btn-input" href="">주소검색</a><br /></li>
						
							<li><label class="label-text">주소</label><input class="input"  type="text" ><br /></li>
							
							<li><label class="label-text">상세 주소</label><input class="input"  type="text" ><br /></li>
						</ul>
					</fieldset>
				</div>
				
				<div class="box-label mt20">
					<img src="${ctx}/Images/phz/write_ico.png" width="15" height="15"><span class="label-text">약관 동의</span>
				</div>
				
				
														
				<div class="box">
					<ul class="agree">
						<li><label><input type="checkbox" >아래 약관에 모두 동의합니다.</label></li>
						<li><label><input type="checkbox" ><span class="text-emp">(필수)</span> 위치정보 이용약관에 동의합니다.</label><a id="agree-con-01" class="btn-agree" href="">상세보기</a></li>
						<li><label><input type="checkbox" ><span class="text-emp">(필수)</span> 개인정보 처리 방침에 동의합니다.</label><a id="agree-con-02" class="btn-agree" href="">상세보기</a></li>
						<li><label><input type="checkbox" ><span class="text-emp">(필수)</span> 회원가입 약관에 동의합니다.</label><a id="agree-con-03" class="btn-agree" href="">상세보기</a></li>
						</ul>
					</div>

				<input type="submit" class="btn-default btn-huge" value="가입신청">	
			</form>
		</div>	
	</section>
</main>