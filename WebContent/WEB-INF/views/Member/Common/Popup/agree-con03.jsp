<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	<title>아이디 찾기</title>
	<link href="../../Css/Style1p.css" type="text/css" rel="stylesheet"/>
</head>
<body class="root-container">
	<h1 class="hidden">아이디찾기</h1>
	<div class="find-box">
		
		<div class="title-box">
					아이디찾기
		</div>		
				
		<form method="post">
			<div class="content-box">
				<div class="text-box">
					<ul>
					<li><label class="label-text">e-mail</label><input class="length" type="text" /><br/>	</li>
					
					<li><label class="label-text">연락처(핸드폰)</label>
						<select class="length-sh" name="tel01" >
							<option value="010">010</option>
							<option value="011">011</option>
							<option value="016">016</option>
							<option value="016">017</option>
							<option value="016">018</option>
							<option value="019">019</option>
						</select><input name="tel02" class="length-sh"  type="text" ><input name="tel03" class="length-sh"  type="text" >
					</li>
					</ul>			
				</div>	
			</div>
			
			<div class="box-close">
				<input type="submit" class ="btn-close" value="찾기"/>
				<input type="button" class ="btn-close" value="닫기"/>
			</div>
			
		</form>
	</div>
</body>
</html>