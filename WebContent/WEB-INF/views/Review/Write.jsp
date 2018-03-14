
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"/> 



	<main class="main-box" style="margin-top:8%">
	
	<h1 class="content-title">┃ 후기쓰기</h1>
	<form method="post" enctype="multipart/form-data"> <!-- 자기 자신을 mapping할때는 아무것도 적지 않는다. -->
	
	<div class="form content-table" style="min-height: 650px">
		<ul>
			<li>
				<label class="label-title" for="title">제목</label> 
				<input name="title" type="text" id="review-title" size="30" required="required" placeholder="20자 이내로 작성하세요." style="margin-left: 20px">
			</li>
			<li>
				<label class="label-title" for="star-button">평점</label> 
							
				<input type="radio" name="gradePoint" value="1" style="margin-left: 20px">1점
				<input type="radio" name="gradePoint" value="2">2점
				<input type="radio" name="gradePoint" value="3" checked="checked">3점
				<input type="radio" name="gradePoint" value="4">4점
				<input type="radio" name="gradePoint" value="5">5점
				<!-- <input name="gradePoint" type="image" src="../Images/star.png" class="star-button" id="input-box"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> -->
				<hr>
			</li>
			<li>
				<label class="label-title" for="info">시공정보</label> 
				<select size="1" id="info-box" style="margin-left: 25px">
					<option selected="selected">시공카테고리 - 시공일자</option>
					<option value="info">문 - 171223</option>
				</select>
			</li>
		</ul>
		<!-- 여기다가 디비에서 가져온 시공정보를 불러와야해.....	 -->
	
		<table id="data-table">
			<tbody>
				<tr>
					<td>카테고리 :</td>
				</tr>
				<tr>
					<td>시공기간 :</td>
				</tr>
				<tr>
					<td>시공업체 :</td>
				</tr>
				<tr>
					<td>거주지역 :</td>
				</tr>
			</tbody>
		</table>
	
	
		<hr>
		<ul>
			<li>
				<label class="label-title" for="main-photo">메인사진</label> 
				<input type="file" name="attachedFile" id="main-picture-button" style="margin-left:33px" required="required">			
			</li>
			<!--<li>
				<label class="label-title" for="plus-photo">추가사진</label> 
				<input type="file" id="plus-picture" style="margin-left:33px">
			</li> -->
			<li style="display: flex; align-items: flex-start;">
				<label class="label-title" for="review">후기작성</label> 
				<textarea name="content" rows="17" cols="60" id="review-write" placeholder="간략한 시공과정과 시공 하면서 느꼈던 점을 솔직하게 알려주세요 :)" style="margin-left:33px"></textarea>
			</li>
		</ul>
	
			<!-- <input type="submit" class="hidden"  id="review-write"> -->
			<!-- <a href="" class="write-button">
				<img alt="후기등록" src="../Images/nhy/pen3.png">
			</a> -->
	
			<input type = "submit" class="button text-button review-button" value = "등록하기"/>
		
	</div>
	</form>
	</main>
	

<script>
	window.addEventListener("load",function(){
		var mainPictureButton = document.querySelector("#main-picture-button");
			
			mainPictureButton.onchange=function(e){
				var file = mainPictureButton.files[0];
				
			var typeParts = file.type.split("/");

			if(typeParts[0] != "image"){
				alert("지원하는 이미지 파일 형식이 아닙니다.");
				return;
			}
			/* var reader = new FileReader();
			
			reader.onload = function(evt){
				photo.src = evt.target.result; //메모리상의 이미지를 넣어줄거야
			};
				
			reader.readAsDataURL(file); */
			};

	});
	

</script>