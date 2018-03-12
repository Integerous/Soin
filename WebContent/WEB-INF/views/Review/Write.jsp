<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



	<main class="main-box">
	
	<h1 class="content-title">┃ 후기쓰기</h1>
	
	<div class="form content-table" style="min-height: 650px">
		<ul>
			<li>
				<label class="label-title" for="title">제목</label> 
				<input name="title" type="text" id="review-title" size="30" required="required" placeholder="20자 이내로 작성하세요." style="margin-left: 20px">
			</li>
			<li>
				<label class="label-title" for="star-button">평점</label> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button" id="input-box"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button">
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
				<input type="file" id="main-picture-button" style="margin-left:33px" required="required">			
			</li>
			<!--<li>
				<label class="label-title" for="plus-photo">추가사진</label> 
				<input type="file" id="plus-picture" style="margin-left:33px">
			</li> -->
			<li>
				<label class="label-title" for="review">후기작성</label> 
				<textarea name="content" rows="15" cols="60" id="review-write" placeholder="간략한 시공과정과 시공 하면서 느꼈던 점을 솔직하게 알려주세요 :)" style="margin-left:33px"></textarea>
			</li>
		</ul>
		<div>
			<input type="submit" class="hidden"  id="review-write">
			<a href="" class="write-button">
				<img alt="후기등록" src="../Images/nhy/pen3.png">
			</a>
			 	<!-- <a href="MainList.html" class="button text-button">취소하기</a>
				<a href="" class="button text-button">등록하기</a> --> 
		</div>
	</div>
	
	</main>
	
<script src="http://js.nicedit.com/nicEdit-latest.js" type="text/javascript"></script>
<script type="text/javascript">
   bkLib.onDomLoaded(nicEditors.allTextAreas);
</script>

<script>
	var mainPictureButton = document.querySelector("#main-picture-button");

	mainPictureButton.onchange=function(e){
		var files = mainPictureButton.files;
		var typeParts = files[0].type.split("/");

		if(typeParts[0] != "image"){
			alert("지원하는 이미지 파일 형식이 아닙니다.");
			return;
		};
	};

</script>