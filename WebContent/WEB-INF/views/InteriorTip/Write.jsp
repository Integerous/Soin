<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<main id = "main">
		<div class = "root-container">
			<form method="post" enctype="multipart/form-data">
			<div class = "write">
				<div class = "tip-label">
					팁 작성하기
				</div>
				
				<br/>
				<div class = "tip-category">
					팁 카테고리
					<select name = "tip-categorys" class = "tip-select">
							<option value = "" selected = "selected">팁 카테고리</option>
							<option value = "창문">소재</option>
							<option value = "문">팁</option>
							<option value = "욕실">시공과정</option>
							<option value = "벽지">트랜드</option>
						</select>
				</div>
				
				<br/>
				
				<div class = "tip-title">
					제목  <input name = "title" class = "write-title" type="text" size="30" placeholder="30자 이내로 작성해주세요.">
				</div>
				
				<br/>
				
				<div class = "tip-images" >
					<div class="main-image" style="height:60px;">
						메인사진 <input type="file" name = "file" class="tip-image" id="main-img">
						<img id="main-photo" style="width:50px; height: 50px; border: 1px solid #595959; border-radius:25px; box-shadow: 0 4px 15px 0 rgba(0, 0, 0, 0.15);"/>
					</div>
					
					<br/>
					
					<!-- <div class="sub-image" style="height:60px;">
						추가사진 <input type="file" name = "file" class="tip-image" id="sub-img">
						<img id="sub-photo" style="width:50px; height: 50px; border: 1px solid #595959; border-radius:25px; box-shadow: 0 4px 15px 0 rgba(0, 0, 0, 0.15);"/>
					</div> -->
				</div>
				
				<br/>
				
				<div>
					팁 작성
					<div>
						<textarea name="content"  rows="20" cols="60" placeholder="관련된 팁 및 정보에 대한 글을 작성해주세요." name = "tip-write"></textarea>
					</div>
				</div>
				
				<br/>
				
			</div>
				<div class="btn-box">
					<input type="submit" class = "btn" value="글 등록하기">
					<a class="btn" href="SelfTip/Main01">취소</a>
				</div>
				</form>
		</div>
	</main>



	<script>
		window.addEventListener("load", function(){
			var mainImgButton = document.querySelector("#main-img");
			var subImgButton = document.querySelector("#sub-img");
			var mainPhoto = document.querySelector("#main-photo");
			var subPhoto = document.querySelector("#sub-photo");

			mainImgButton.onchange = function(e){
				var file = mainImgButton.files[0];
				var typeParts = file.type.split("/");

				if(typeParts[0] != "image")
					alert("지원되는 이미지 파일이 아닙니다.");

				var reader = new FileReader();
           		reader.onload = function(evt){
                	mainPhoto.src = evt.target.result;
            };
            reader.readAsDataURL(file);
			};

			subImgButton.onchange = function(e){
				var file = subImgButton.files[0];
				var typeParts = file.type.split("/");

				if(typeParts[0] != "image")
					alert("지원되는 이미지 파일이 아닙니다.");

				var reader = new FileReader();
           		reader.onload = function(evt){
                	subPhoto.src = evt.target.result;
            };
            reader.readAsDataURL(file);
			};
		});
	</script>