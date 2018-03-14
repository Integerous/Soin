<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	<title>비밀번호 찾기</title>
	<link href="css/Style1p.css" type="text/css" rel="stylesheet"/>
	<script src="js/close.js" type="text/javascript"></script>
</head>
<body class="root-container">
	<h1 class="hidden">비밀번호 찾기</h1>
	<div class="find-box">
		
		<div class="title-box">
			비밀번호 찾기
		</div>		
				
		<form method="post">
			<div class="content-box">
				<div class="input-box">
					<ul>
					
						<li><div class="center bold">아이디</div></li>
						<li>
							<div class="center"><input class="length" name="id" type="text" pattern="^[a-zA-Z0-9]{5,10}$" maxlength="10" placeholder="아이디를 입력해주십시오" required /></div>
						</li>
						<li><div class="center bold">연락처</div></li>
						<li>
							<div class="length fl center">
								<select class="length-sh" name="tel01" >
									<option value="010">010</option>
									<option value="011">011</option>
									<option value="016">016</option>
									<option value="016">017</option>
									<option value="016">018</option>
									<option value="019">019</option>
								</select>
								<input name="tel02" class="length-sh"  type="text" pattern ="\d{3,4}" maxlength="4" placeholder="숫자 3-4자리" required />
								<input name="tel03" class="length-sh"  type="text" pattern ="\d{4}" maxlength="4" placeholder="숫자 4자리" required />
							</div>
						</li>
					</ul>			
				</div>	
			</div>
			
			<div class="box-close">
				<input type="submit" class ="btn-close" value="찾기"/>
				<input id="button-close-popup" type="button" class ="btn-close bl" value="닫기"/>
			</div>
			
		</form>
	</div>
</body>
</html>