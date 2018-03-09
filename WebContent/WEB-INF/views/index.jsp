<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx"  value="${pageContext.request.servletContext.contextPath }"></c:set>
<style>
#main
{
	background: url('Images/phz/main.jpg') no-repeat;
	background-size: cover;
}



</style>


<main id="main">
	<section>
		<h1>견적 신청 카테고리 선택</h1>
		<div class="category">
			<form action="interiortip">
				<div class="question center">
					<span>무엇을 바꾸고 싶으신가요?</span>
				</div>
				
				<div id="category01" class="content center mt20">	
					<div class="btn btn-window">
						<span><img src="${ctx }/Images/phz/window.png" alt="창문"></span>
					</div>
					
					<div class="btn btn-door">
						<span><img src="${ctx }/Images/phz/door.png" alt="문"></span>
					</div>
					
					<div class="btn btn-bath">	
						<span><img src="${ctx }/Images/phz/bath.png" alt="욕실"></span>
					</div>
					
					<div class="btn btn-wallpaper">
						<span><img src="${ctx }/Images/phz/wallpaper.png" alt="벽지"></span>
					</div>
				</div>
				
				<div class="center mt20">
					<a href="" class="btn-default btn-huge">견적신청하기</a>
				</div>
				
				<input type="hidden" name="c1" >
				<input type="hidden" name="c2" >
				<input type="hidden" name="c3" >
				<input type="hidden" name="c4">
			</form>
		</div>
	</section>
</main>

<script>
	window.addEventListener("load", function(){
		
		var cat01 = document.getElementById("category01");


		var winBtn = document.querySelector(".btn-window");
		var doorBtn = document.querySelector(".btn-door");
		var wallpaperBtn = document.querySelector(".btn-wallpaper");
		var bathBtn = document.querySelector(".btn-bath");
		
		var spans = document.querySelectorAll(".btn span");
		
		var door = document.createTextNode("문");
		var win = document.createTextNode("창문");
		var wallpaper = document.createTextNode("벽지");
		var bath = document.createTextNode("욕실");
		
		winBtn.onmouseover = function(){
	
			winBtn.style["opacity"]="0.7";
			winBtn.appendChild(win);
			spans[0].classList.add("hidden");
			
			winBtn.onmouseout = function(){
				
				winBtn.style["opacity"]="1.0";
				winBtn.removeChild(win);
				spans[0].classList.remove("hidden");
			};
		};
		
		doorBtn.onmouseover = function(){
	
			doorBtn.style["opacity"]="0.7";
			doorBtn.appendChild(door);
			spans[1].classList.add("hidden");
			
			doorBtn.onmouseout = function(){
				
				doorBtn.style["opacity"]="1.0";
				doorBtn.removeChild(door);
				spans[1].classList.remove("hidden");
			};
		};
		
		bathBtn.onmouseover = function(){
	
			bathBtn.style["opacity"]="0.7";
			bathBtn.appendChild(bath);
			spans[2].classList.add("hidden");
			
			bathBtn.onmouseout = function(){
				
				bathBtn.style["opacity"]="1.0";
				bathBtn.removeChild(bath);
				spans[2].classList.remove("hidden");
			};
		};
		
		wallpaperBtn.onmouseover = function(){
	
			wallpaperBtn.style["opacity"]="0.7";
			wallpaperBtn.appendChild(wallpaper);
			spans[3].classList.add("hidden");
			
			wallpaperBtn.onmouseout = function(){
				
				wallpaperBtn.style["opacity"]="1.0";
				wallpaperBtn.removeChild(wallpaper);
				spans[3].classList.remove("hidden");
			};
		};
		
	});
</script>