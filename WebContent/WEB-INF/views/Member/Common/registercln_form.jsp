<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />
<script src="Popup/js/reg-cln-popup.js" type="text/javascript"></script>
<script src="Popup/js/check.js" type="text/javascript"></script>
 <script src="js/address.js" type="text/javascript" ></script>
 
<main id="main">
	<section>
		<h1 class="hidden">회원유형 선택</h1>
		
		<div class="register-box">
			<div class="register-step">
				<ul>
					<li><span>유형선택</span></li>
					<li class="selected-step"><span>정보입력</span></li>
					<li><span>가입완료</span></li>
				</ul>
			</div>
			
			<div class="msg-box mt20">	
					<strong class="msg-strong">정보입력</strong>
					<br />
					<span class="text-small">회원님의 정보를 입력해주십시오. 회원가입에는 실명 인증이 필요합니다.</span>
			</div>
			
			<div class="box-label mt20">
				<img src="${ctx}/Images/phz/write_ico.png" width="15" height="15"><span class="label-text">정보 입력</span>
			</div>
			<form method="post">
				<div class="info-bg" >
					<fieldset>
					<legend class= "hidden">정보입력폼</legend>
						<ul>
						
							<li><label class="label-text">아이디</label><input name="id" class="input-short"  type="text" pattern="^[a-zA-Z0-9]{5,15}$" maxlength="15" placeholder="영문, 숫자 5-15자리 이내" required /><input type="button" class="btn-input ml20" id="id-check" value="중복체크"><br /></li>
							
							<li><label class="label-text">비밀번호</label><input name="password" class="input"  type="password" pattern="^[a-zA-Z0-9!@#$%^&*()\-_+=]{8,15}$" maxlength="15" placeholder="대소문자, 숫자, 특수문자 8-15자리 이내" required /><br /></li>
							
							<li><label class="label-text">비밀번호 확인</label><input id="pw-check" class="input"  type="password" maxlength="15" ><br /></li>
							
							<li><div id="pw-check-message" class="text-small">*비밀번호를 한 번 더 입력해주세요.</div></li>
							
							<li><label class="label-text">닉네임</label><input class="input"  type="text" name="nickName" pattern="^[a-zA-Z0-9가-힣]{2,8}$" maxlength="8" placeholder="한글,영어,숫자 2-8자리" required />
							
							<li><label class="label-text">이메일</label><input name="email" class="input"  type="text"  pattern="^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$" maxlength="30" placeholder="abc@def.com" required /><br /></li>
							
							<li><label class="label-text">연락처(핸드폰)</label>
								<div class="wrap-box">
									<select name="tel01" >
										<option value="010">010</option>
										<option value="011">011</option>
										<option value="016">016</option>
										<option value="016">017</option>
										<option value="016">018</option>
										<option value="019">019</option>
									</select><input name="tel02" class="input-sh-short"  type="text"  pattern ="\d{3,4}" maxlength="4" placeholder="숫자 3-4자리" required /><input name="tel03" class="input-sh-short"  type="text"  pattern ="\d{4}" maxlength="4" placeholder="숫자 4자리" required />
								</div>
							</li>
									
							<!-- <li><label class="label-text">연락처(집)</label>
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
							</li>  -->	

							<!-- <li><label class="label-text">우편번호</label><input class="input-short"  type="text" ><a class="btn-input" href="">주소검색</a><br /></li> -->
						
							<li><label class="label-text">주소</label>
									<div class="wrap-box">
										<select id="cat01">
											<option>대분류 선택</option>
											<option value="01">ㄱ,ㄴ</option>
											<option value="02">ㄷ,ㅁ,ㅅ</option>
											<option value="03">ㅅ,ㅇ,ㅈ</option>
										</select>
										
										<select name="add01" id="cat02" name="address01">
											<option>중분류 선택</option>
										</select>
										
										<select name="add02" id="cat03" name="address02">
											<option>소분류 선택</option>
										</select>
									</div>
							</li>
							
							<li><label class="label-text">상세 주소</label><input class="input"  name="detailAddress" type="text" maxlength="30" /><br /></li>
						</ul>
					</fieldset>
				</div>
				
				<div class="box-label mt20">
					<img src="${ctx}/Images/phz/write_ico.png" width="15" height="15"><span class="label-text">약관 동의</span>
				</div>
				
				
														
				<div class="box">
					<ul class="agree">
						<li><label><input class="ck" id="reg-cln-chk-all" type="checkbox" >아래 약관에 모두 동의합니다.</label></li>
						<li><label><input class="ck" id="reg-cln-chk-01" type="checkbox" required /><span class="text-emp">(필수)</span> 개인정보처리방침에 동의합니다.</label><input type="button" id="agree-cln-01" class="btn-agree" value="상세보기">
						<li><label><input class="ck" id="reg-cln-chk-02" type="checkbox" required /><span class="text-emp">(필수)</span> 회원가입 약관에 동의합니다.</label><input type="button" id="agree-cln-02" class="btn-agree"  value="상세보기">
						<li><label><input class="ck" id="reg-cln-chk-03" type="checkbox" name="selectCheck" value="1"><span class="text-emp">(선택)</span> 인테리어 정보 및 이벤트 알림 수신에 동의합니다. </label><input type="button" id="agree-cln-03" class="btn-agree" value="상세보기">
					</ul>
				</div>
					
				<!-- <input type="hidden" name="roleName" value="CLIENT"> -->

				<input id="submit-button" type="submit" class="btn-default btn-huge" value="가입신청">	
			</form>
		</div>	
	</section>
</main>
