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
			<form action="interiortip">
				<div class="question center">
					<span>무엇을 바꾸고 싶으신가요?</span>
				</div>
				
				<div id="category01" class="content center mt20">	
					<a href="Estimate/EstimateRequestForm/Form1?construction-position=창문" class="btn btn-window c1">
						<img src="${ctx }/Images/phz/window.png" alt="창문"><span class="win hidden">창문</span>
					</a>
					
					<a href="Estimate/EstimateRequestForm/Form1?construction-position=문" class="btn btn-door c1">
						<img src="${ctx }/Images/phz/door.png" alt="문"><span class="door hidden">문</span>
					</a>
					
					<a href="Estimate/EstimateRequestForm/Form1?construction-position=욕실" class="btn btn-bath c1">	
						<img src="${ctx }/Images/phz/bath.png" alt="욕실"><span class="bath hidden">욕실</span>
					</a>
					
					<a href="Estimate/EstimateRequestForm/Form1?construction-position=벽" class="btn btn-wallpaper c1">
						<img src="${ctx }/Images/phz/wallpaper.png" alt="벽"><span class="wallpaper hidden">벽</span>
					</a>
				</div>
				
				<!-- <div id="category02" style="display:none;" class="content center mt20">	
					<button type="button" value="private" class="btn c2">
						<span>아파트/주택</span>
					</button>
					
					<button type="button" value="commercial" class="btn c2">
						<span>상업시설</span>
					</button>
				</div> 
				
				<div id="category03" style="display:none;" class="content center mt20">	
					<button type="button" value="room" class="btn c3">
						<span>방</span>
					</button>
					
					<div class="btn c3">
						<span>베란다</span>
					</div>
					
					<div class="btn c3">
						<span>욕실</span>
					</div>
					
					<div class="btn c3">
						<span>기타</span>
					</div>
				</div> 
				
				<div id="category04" style="display:none;" class="content center mt20">	
					<div class="btn c4">
						<span>PVC</span>
					</div>
					
					<div class="btn c4">
						<span>알루미늄</span>
					</div>
					
					<div class="btn c4">
						<span>목재</span>
					</div>
					
					<div class="btn c4">
						<span>기타</span>
					</div>
				</div>  -->
				
				<div class="center mt20">
					<input type="submit"  class="btn-default btn-huge" value="신청" />
				</div>
				
		<!--	<input id="01" type="hidden" name="" >
	 			<input id="02" type="hidden" name="c2" >
				<input id="03" type="hidden" name="c3" >
				<input id="04" type="hidden" name="c4"> -->
			</form>
		</div>
	</section>
</main>

<script>
	window.addEventListener("load", function(){
		//변수준비
		var cat01 = document.querySelector("form #category01");
		/* var cat02 = document.querySelector("form #category02");
		var cat03 = document.querySelector("form #category03");
		var cat04 = document.querySelector("form #category04"); */
		
		/* var cat01Val = document.getElementById("01");
		var cat02Val = document.getElementById("02");
		var cat03Val = document.getElementById("03");
		var cat04Val = document.getElementById("04"); */

		var cat01Btn = document.querySelectorAll("form #category01 .c1");
		/* var cat02Btn = document.querySelectorAll("form #category02 .c2");
		var cat03Btn = document.querySelectorAll("form #category03 .c3");
		var cat04Btn = document.querySelectorAll("form #category04 .c4"); */
		
		/* var question = document.querySelector(".question span") */
		
		//함수정의역========================================
		for(var i=0;i< cat01Btn.length; i++)
		{	
			cat01Btn[i].onclick = 	function () {

				location.href="../Estimate/EstimateRequestForm/Form1?construction-position="+cat01Btn[i].value;
			}	
		 }
		
			
			
			
	/* for(var i=0;i< cat01Btn.length; i++)
		{	
			cat01Btn[i].onclick = openCat02;
		 }*/

	/* cat01Btn[0].onclick = openCat02;
		cat01Btn[1].onclick = openCat02;
		cat01Btn[2].onclick = openCat02;
		cat01Btn[3].onclick = openCat02; 
		
		function openCat02()
		{	
			cat01Val.value = this.value;		
			cat01.style.display = "none";
			cat02.style.display = "flex"; 
			cat02.style.width ="280px";
			question.textContent = "어디에 위치해 있나요? - 시공종류";

			for(var i=0;i< cat02Btn.length; i++)
			{
				cat02Btn[i].onclick = openCat03;
				
			}
		
 			function openCat03() 
			{	
				cat02Val.value = this.value;
				cat02.style.display = "none";
				cat03.style.display = "flex"; 
				cat03.style.width ="500px";	
				question.textContent = "어디에 위치해 있나요? - 시공위치";
				
				for(var i=0;i< cat03Btn.length; i++)
				{
					cat03Btn[i].onclick = openCat04;
				}
				
				function openCat04() 
				{			
					cat03Val.value = this.value;	
					cat03.style.display = "none";
					cat04.style.display = "flex"; 
					cat04.style.width ="500px";
					question.textContent = "어떤 재질을 원하시나요?";
					
					for(var i=0;i< cat03Btn.length; i++)
					{
						cat04Btn[i].onclick = function () 
						{
							cat04Btn[i].style.backgroundColor= "#e9e9e9";
							cat04Val.value = this.value;
						};
					}
				}	
			}
		}*/

		//이벤트 처리========================================	
		var winBtn = document.querySelector(".btn-window");
		var doorBtn = document.querySelector(".btn-door");
		var wallpaperBtn = document.querySelector(".btn-wallpaper");
		var bathBtn = document.querySelector(".btn-bath");

		var imgs = document.querySelectorAll(".c1 img");
		
		var win = winBtn.querySelector(".win");
		var door = document.querySelector(".door");
		var bath = document.querySelector(".bath");
		var wallpaper = document.querySelector(".wallpaper");
		
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
		
	});
</script>