<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>
<body>

		
<!-- -----바디시작-------------------------------------------	 -->
<div id ="wrap">
	<div id = "body">
	<form method ="post" enctype ="multipart/form-data">
	<div class="detail-title">
	
		<div class="left-title">
		제목
		</div>
		<div class="title-cont">
		 <input id="portfolio-title" required="required" placeholder="제목을 입력하세요."type="text" style ="width:770px; border:none; font-size:18px;" name="portfolio-title"/>
		</div>
	</div>
	
	<div class="category">
	
		<div class="left-title">
		카테고리
		</div>
		<div class ="construction-sort" >
			
			<img class="major" src="${ctx}/Images/yurim/window2.png" alt="창문"/>
			<img class="major" src="${ctx}/Images/yurim/wallpaper3.png" alt="벽지"/>
			<img class="major" src="${ctx}/Images/yurim/door2.png" alt="문"/>
			<img class="major" src="${ctx}/Images/yurim/bath2.png" alt="욕조"/>
		</div>
		<div class ="bottom-ck">
			<input class ="wid" type ="checkbox" name="category" value="창문">창문
			<input class ="wid" type ="checkbox" name="category" value="벽지">벽지
			<input class ="wid" type ="checkbox" name="category" value="문">문
			<input class ="wid" type ="checkbox" name="category" value="욕조">욕조
			<%String[] sorts = request.getParameterValues("category"); %>
			
		</div>
		<div class="category-cont">
			*카테고리를 선택해 주세요.(하나만 선택하세요)
		</div>
	</div>
	
	<div class="construction-info">
		<div class="left-title">
		시공정보
		</div>
		<div class="construction-cont">
			<!-- 칸나눠서해야할공간. -->
			<div class = "construction-cont1">
				<!-- <div class = "con-name1">
				업체명
				</div>
				<div class ="con-name2">
				 <input type="text" />name="constructorName"  
				</div> -->
			
			</div>
			<div class = "construction-cont2">
				<div class = "con-name1">
				지역명
				</div>
				<div class ="con-name2">
					<select name ="location" style="margin-top:0px; width:auto; margin-left:auto;">
						
						<option value="서울시 강남구">서울시 강남구</option>
						<option value="서울시 강동구">서울시 강동구</option>
						<option value="서울시 강북구">서울시 강북구</option>
						<option value="서울시 강서구">서울시 강서구</option>
						<option value="서울시 관악구">서울시 관악구</option>
						<option value="서울시 광진구">서울시 광진구</option>
						<option value="서울시 구로구">서울시 구로구</option>
						<option value="서울시 금천구">서울시 금천구</option>
						<option value="서울시 노원구">서울시 노원구</option>
						<option value="서울시 도봉구">서울시 도봉구</option>
						<option value="서울시 동대문구">서울시 동대문구</option>
						<option value="서울시 동작구">서울시 동작구</option>
						<option value="서울시 마포구">서울시 마포구</option>
						<option value="서울시 서대문구">서울시 서대문구</option>
						<option value="서울시 서초구">서울시 서초구</option>
						<option value="서울시 성동구">서울시 성동구</option>
						<option value="서울시 성북구">서울시 성북구</option>
						<option value="서울시 송파구">서울시 송파구</option>
						<option value="서울시 양천구">서울시 양천구</option>
						<option value="서울시 영등포구">서울시 영등포구</option>
						<option value="서울시 용산구">서울시 용산구</option>
						<option value="서울시 은평구">서울시 은평구</option>
						<option value="서울시 종로구">서울시 종로구</option>
						<option value="서울시 중구">서울시 중구</option>
						<option value="서울시 중랑구">서울시 중랑구</option>
						<option selected value="">선택</option>
					</select>
					<!-- <select>
						<option value="동">동</option>
						<option value="조회순">조회순</option>
						<option value="인기순">인기순</option>
					</select> -->
				</div>
				
			</div>
			<div class = "construction-cont3">
				<div class = "con-name1">
				공사기간
				</div>
				<div class ="con-name2">
				<input type="text" name="constructionPeriod" style="width:50px;" />일
				</div>
			</div>
			<div class = "construction-cont4">
				<div class = "con-name1">
				시공종류
				</div>
				<div class ="con-name2">
				<input type="text" name="constuctionSort" style="width:400px;" />
				</div>
			</div>
			<!-- <div class = "construction-cont5">
				<div class = "con-name1">
				공사비용
				</div>
				<div class ="con-name2">
				<input type="text"  >원
				</div>
			
			</div> -->
		
		</div>
		
	</div>
	<div class="detail-cont">
		<div class="left-title">
		상세내용
		</div>
		<div class="construction-cont">
			
			<!-- 사진업로드 -->		
		
			<input id="photo-file-button" class="hidden" type="file" name="attached1"/>
			<input id="photo-button" class ="btn" type="button" value="사진선택"/>
			<img id="photo1" src="" style="width: 70px;height: 60px;border: 1px solid #595959; border-radius:5px;"/>
			<br>
			
			
			<input id="photo-file-button2" class="hidden" type="file" name="attached2"/>
			<input id="photo-button2" class ="btn hidden" type="button" value="사진추가"/>
			<img id="photo2" class="hidden" src="" style="width: 50px;height: 50px;border: 1px solid #595959; border-radius:5px;"/>
			
			<br>
			
			<tr>
			
				<td class="write-line" style="width:680px; height:250px;"><textarea name="detailContent" style="min-height: 200px; vertical-align: middle; width:700px;"></textarea></td>
			</tr>
			
			
			
		
			
			<!-- <tr>
				<td class="write-line"><input name="attached" type="file" style="float:left; padding-top:10px;" name="image-upload"/></td>
			</tr -->
			
			
			
			<!-- <form action="" method="post" enctype="multipart/form-data">
			<input type="text" style="width:680px; height:250px;" >
			<input type="file" style="float:right" name="image-upload">
			<input type ="submit" > -->
			
		</div>
	
			</div>
			<div class="choice-container">
				<div class="flex-choice">
						<div><input type="submit" class="btn-large" value ="등록하기"></div>
				  		<!-- <div><a href="" class="btn-large">미리보기</a></div> -->
				  		<div><a href="${ctx}/Member/Constructor/Portfolio/PortfolioMain" class="btn-large">취소하기</a></div>
				</div>
			</div>

			</form>

		</div>
	
	</div>

		

<!-- ---사이드바-------------------------------------------- -->
<div id = "side">
 		<a href="${ctx}/Estimate/EstimateRequestForm/Form1">견적 신청하기</a>
 </div>  

</body>
</html>		
		

</body>
</html>

<!-- 여기서 나중에 가져오기 --><script src="http://js.nicedit.com/nicEdit-latest.js" type="text/javascript"></script>

<script type="text/javascript">
bkLib.onDomLoaded(nicEditors.allTextAreas);
</script>


<script>

	window.addEventListener("load",function(){
	 
		var photoFileButton = document.querySelector("#photo-file-button");
	    var photoButton = document.querySelector("#photo-button");
	    
	    var photoFileButton2 = document.querySelector("#photo-file-button2");
	    var photoButton2 = document.querySelector("#photo-button2");
	    var photo1 = document.querySelector("#photo1");
	    var photo2 = document.querySelector("#photo2");
	    
	    photoButton.onclick = function(e){
	        var evt = new MouseEvent("click",{
	                view:window,
	                bubbles:true,
	                cancelable:true
	        });
	        photoFileButton.dispatchEvent(evt);
	    };
	
	    photoButton2.onclick = function(e){
	        var evt = new MouseEvent("click",{
	                view:window,
	                bubbles:true,
	                cancelable:true
	        });
	        photoFileButton2.dispatchEvent(evt);
	    };
	    
	    photoFileButton.onchange = function(e){
	        
	    	var file = photoFileButton.files[0];
	    	//var files = photoFileButton.files;
			
	        
	        //var info = "name:"+files[0].name+", size:"+files[0].size+", type:"+files[0].type;

	        var typeParts = file.type.split("/");

	        if(typeParts[0] !="image")
	            alert("지원되는 이미지 파일의 형식이 아닙니다.");
	        
	        var reader = new FileReader();
	        reader.onload = function(evt){
	        	photo1.src = evt.target.result;
	        };
	        reader.readAsDataURL(file);
	       
	       // alert(info);


	    };
	    photoFileButton2.onchange = function(e){
	        var file = photoFileButton2.files[0];
			
	        //var info = "name:"+files[0].name+", size:"+files[0].size+", type:"+files[0].type;

	        var typeParts = file.type.split("/");

	        if(typeParts[0] !="image")
	            alert("지원되는 이미지 파일의 형식이 아닙니다.");
	       
	       // alert(info);
			var reader = new FileReader();
			reader.onload = function(evt){
				photo2.src = evt.target.result;
			};
			reader.readAsDataURL(file);
	    };
	    
	    
	});

</script>