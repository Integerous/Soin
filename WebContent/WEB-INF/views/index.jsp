<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx"  value="${pageContext.request.servletContext.contextPath }"></c:set>
<style>
#main { background: url('Images/phz/main.jpg') no-repeat; background-size: cover; }
</style>

<main id="main">
	<section>
		<h1 class="hidden">견적 신청 카테고리 선택</h1>
		
		<div class="category">
			<form action="estimate/EstimateRequestForm/Form1">
				<div class="question center">
					<span>무엇을 바꾸고 싶으신가요?</span>
				</div>
				
				<div id="category01" class="content center mt20">	
					<div class="btn btn-window c1">
						<span class="win hidden">창문</span><img src="${ctx }/Images/phz/window.png" alt="창문">
					</div>

					<div class="btn btn-door c1">
						<img src="${ctx }/Images/phz/door.png" alt="문"><span class="door hidden">문</span>
					</div>
					
					<div class="btn btn-bath c1">	
						<img src="${ctx }/Images/phz/bath.png" alt="욕실"><span class="bath hidden">욕실</span>
					</div>
					
					<div  class="btn btn-wallpaper c1">
						<img src="${ctx }/Images/phz/wallpaper.png" alt="벽/바닥"><span class="wallpaper hidden">벽/바닥</span>
					</div>
					
					<div class="btn btn-kitchen c1">
						<img src="${ctx }/Images/phz/kitchen.png" alt="주방"><span class="kitchen hidden">주방</span>
					</div>
					
					<input id="01" type="hidden" name="constructionPosition">
				</div>
				
				<div id="category02" style="display:none;" class="content center mt20">	
					<input name="detailCategory" type="button" class="btn c2">	
					
					<input name="detailCategory" type="button"  class="btn c2">
					
					<input name="detailCategory" type="button" class="btn c2">

					<input name="detailCategory"  type="button" class="btn c2">
				</div> 
				
				<div id="category03" style="display:none;" class="content center mt20">	
					<input name="buildingType" type="button" class="btn c3" value="아파트">
					
					<input name="buildingType" type="button" class="btn c3" value="주택">
						
					<input name="buildingType" type="button" class="btn c3" value="빌라">
					
					<input name="buildingType" type="button" class="btn c3" value="상업시설">
				</div>
				
				<div class="center mt20">
					<input type="submit" class="btn-default btn-huge" value="견적신청"/>
				</div>
				
			</form>
		</div>
	</section>
</main>

<script>
	window.addEventListener("load", function(){
		//변수준비
		var cat01 = document.querySelector("form #category01");
		var cat02 = document.querySelector("form #category02");
		var cat03 = document.querySelector("form #category03");
		
		var cat01Val = document.getElementById("01");

		var cat01Btn = document.querySelectorAll("form #category01 .c1");
		var cat02Btn = document.querySelectorAll("form #category02 .c2");
		var cat03Btn = document.querySelectorAll("form #category03 .c3");
		
		var question = document.querySelector(".question span");
		
		var cat02Win = ['하이샤시', '알루미늄', '목재창', '그 외'];
		var cat02Door = ['현관문', '방문', '슬라이딩 도어', '그 외'];
		var cat02Bath = ['세면대', '욕조', '타일', '변기', '그 외'];
		var cat02Wall = ['도배', '장판', '페인트', '그외'];
		var cat02Kit = ['싱크', '후드', '주방가구', '타일'];
		
		var cat03pl = ['아파트', '주택', '빌라', '상업시설'];
		//함수정의역========================================

			cat01Btn[0].onclick = function(){
				cat01Val.value="창문";
				openCat02()
			}
			cat01Btn[1].onclick = function(){ 
				cat01Val.value="문";
				openCat02()
			}
			cat01Btn[2].onclick = function(){ 
				cat01Val.value="욕실";
				openCat02()
			}
			cat01Btn[3].onclick = function(){ 
				cat01Val.value="벽/바닥";
				openCat02()
			}
			cat01Btn[4].onclick = function(){ 
				cat01Val.value="주방";
				openCat02()
			}
			
			function openCat02()
			{	
				cat01.style.display = "none";
				cat02.style.display = "flex"; 
				cat02.style.width ="500px";
				question.textContent = "어떤 시공을 원하시나요? - 세부사항";
				
/* 				var cat02l = cat02Btn.length;
				
	/* 			if(cat01Val.value=="욕실")
					var cat02l = 5; */
				
				for(var i=0; i<cat02Btn.length; i++)
				{
					if(cat01Val.value == "창문")
					{
						cat02Btn[i].value = cat02Win[i];
						cat02Btn[i].onclick = openCat03;
					}
					else if(cat01Val.value == "문")
					{	
						cat02Btn[i].value = cat02Door[i];
						cat02Btn[i].onclick = openCat03;
					}
					else if(cat01Val.value == "욕실")
					{
						
						cat02Btn[i].value = cat02Bath[i];
						cat02Btn[i].onclick = openCat03;
					}
					else if(cat01Val.value == "벽/바닥")
					{					
						cat02Btn[i].value = cat02Wall[i];
						cat02Btn[i].onclick = openCat03;
					}
					else
					{				
						cat02Btn[i].value = cat02Kit[i];
						cat02Btn[i].onclick = openCat03;
					}
			
				}
					
					
	 			function openCat03() 
				{	
					cat02.style.display = "none";
					cat03.style.display = "flex"; 
					cat03.style.width ="500px";	
					question.textContent = "어떤 주거 형태인가요? - 시공위치"; 
					
					
					for(var i=0;i< cat03Btn.length; i++)
					{
						cat03Btn[i].onclick = cat03Sel;

						function cat03Sel() {
							this.style.backgroundColor = "gray";
							this.style.color = "#fff";
							question.textContent = "하단의 버튼을 눌러 신청해주세요.(로그인 필요)";	
						}
					}
				}		
			}	


		//이벤트 처리========================================	
		var winBtn = document.querySelector(".btn-window");
		var doorBtn = document.querySelector(".btn-door");
		var wallpaperBtn = document.querySelector(".btn-wallpaper");
		var bathBtn = document.querySelector(".btn-bath");
		var kitchenBtn = document.querySelector(".btn-kitchen");
		
		var imgs = document.querySelectorAll(".c1 img");
		
		var win = winBtn.querySelector(".win");
		var door = document.querySelector(".door");
		var bath = document.querySelector(".bath");
		var wallpaper = document.querySelector(".wallpaper");
		var kitchen = document.querySelector(".kitchen");
		
		winBtn.onmouseover = function(){
	
			win.classList.remove("hidden");
			imgs[0].classList.add("hidden");

			winBtn.onmouseout = function(){
				
				win.classList.add("hidden");
				imgs[0].classList.remove("hidden");
			};
		};

		doorBtn.onmouseover = function(){
	
			door.classList.remove("hidden");
			imgs[1].classList.add("hidden");
			
			doorBtn.onmouseout = function(){
				
				door.classList.add("hidden");
				imgs[1].classList.remove("hidden");
			};
		};
		
		bathBtn.onmouseover = function(){
	
			bath.classList.remove("hidden");
			imgs[2].classList.add("hidden");
			
			bathBtn.onmouseout = function(){
				
				bath.classList.add("hidden");
				imgs[2].classList.remove("hidden");
			};
		};
		
		wallpaperBtn.onmouseover = function(){
	
			wallpaper.classList.remove("hidden");
			imgs[3].classList.add("hidden");
			
			wallpaperBtn.onmouseout = function(){
				
				wallpaper.classList.add("hidden");
				imgs[3].classList.remove("hidden");
			};
		}; 
		
		kitchenBtn.onmouseover = function(){
			
			kitchen.classList.remove("hidden");
			imgs[4].classList.add("hidden");
			
			kitchenBtn.onmouseout = function(){
				
				kitchen.classList.add("hidden");
				imgs[4].classList.remove("hidden");
			};
		}; 
		
	});
</script>