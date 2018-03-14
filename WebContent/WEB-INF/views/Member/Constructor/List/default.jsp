<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Soin.Constructor.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/> 


			<main id="main">

			
			<section>

				<label><input type="checkbox" name="category1" value="door">문</label> 
				<label><input type="checkbox" name="category2" value="window">창문</label> 
				<label><input type="checkbox" name="category3" value="wall">벽</label> 
				<label><input type="checkbox" name="category4" value="bathroom">욕실</label> 
				<label><input type="checkbox" name="category5" value="the_others">기타</label>

</section>
				<section>
					<h1 class="hidden">업체 검색 폼</h1>
					
				<!-- 	<select onchange="categoryChange(this)" name="address" class="area-list area-list-height">

                              <option value="gangnam" selected="selected">강남구</option>
                              <option value="gangdong">강동구</option>
                              <option value="gangbuk">강북구</option>
                              <option value="gangseo">강서구</option>
                              <option value="gwanak">관악구</option>
                              <option value="gwangjin">광진구</option>
                              <option value="guro">구로구</option>
                              <option value="geumcheon">금천구</option>
                              <option value="nowon">노원구</option>
                              <option value="dobong">도봉구</option>
                              <option value="dongdaemun">동대문구</option>
                              <option value="dongjak">동작구</option>
                              <option value="mapo">마포구</option>
                              <option value="seodaemun">서대문구</option>
                              <option value="seocho">서초구</option>
                              <option value="seongdong">성동구</option>
                              <option value="seongbuk">성북구</option>
                              <option value="songpa">송파구</option>
                              <option value="yangcheon">양천구</option>
                              <option value="yeongdeungpo">영등포구</option>
                              <option value="yongsan">용산구</option>
                              <option value="eunpyeong">은평구</option>
                              <option value="jongro">종로구</option>
                              <option value="jung">중구</option>
                              <option value="jungrang">중랑구</option>
                              </select>
                             
                              <select id="dong" class="area-list">
                                 <option>동 선택</option>
                              </select> -->
		

					<select class="area-list area-list-height">
						<option value="마포구">마포구</option>
						<option value="강남구">강남구</option>
						<option value="강서구" selected="selected">강서구</option>
					</select> 
					
					<select class="area-list">
						<option value="서교동">서교동</option>
						<option value="삼성동">삼성동</option>
						<option value="등촌동" selected="selected">등촌동</option>
					</select>

					<form class="form">

						<label>업체검색</label> 
						<input type="text" name="q" placeholder="Search..." />
						<input id = "submit-button"type="submit" value="검색" />

					</form>
				
				
			</section>
			<hr />


			<%-- <c:forEach var="cstrt" items="${list }"> --%>
			
			
			<section>
				<h2>기본 업체 리스트(가나다 순 정렬 - 전체 리스트)</h2>
				<section>
				<c:forEach var="constructor" items="${list}">
					<div class="distance">
						<a href="detail?member_id=${constructor.member_id }"> 
							<img src="${ctx }/Images/jyh/Daum.jpg" alt="아델라">
						</a>
							<ul>
								<li><a href="detail?member_id=${constructor.member_id }">${constructor.name }</a></li>
								<li><a href="detail?member_id=${constructor.member_id }">평점 : ${constructor.gpa}</a></li>
							</ul>
					</div>
				</c:forEach>
				</section>

				

			</section>
			
		
		
    <div class="pagination">
		<c:if test="${startNum != 1 }">
			<a class="btn btn-prev" href="?page=${startNum-1 }" >«</a>
		</c:if>
		
		<c:if test="${startNum == 1}">
			<a class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');">«</a>
		</c:if>
	
				<c:forEach var="i" begin="0" end="4">
        
        	<c:if test="${startNum+i<=lastPage }">
        	
      
         	 <a class="btn btn-next" href="?page=${startNum+i }">${startNum+i }</a>
      
        
     		</c:if>
     		
		</c:forEach>
		
			<c:if test="${startNum+5 <=lastPage}">
				<a class="btn btn-next" href="?page=${startNum+5 }">»</a>
			</c:if>
			
			<c:if test="${ startNum+5 >lastPage}">
				<a class="btn btn-next" onclick="alert('다음 페이지가 없습니다.');">»</a>
			</c:if>
				
			</div>
	
<%-- 	<div class="pagination">
		<c:if test="${startNum != 1 }">
			<a class="btn btn-prev" href="?page=${startNum-1 }">«</a>
		</c:if>
		
		<c:if test="${startNum == 1}">
			<a class="btn btn-prev">«</a>
		</c:if>
	
				<c:forEach var="i" begin="0" end="4" >
					<c:if test="${startNum+i<=lastPage}">
					<li><a href="?page=${ startNum+i}&t=&q=" >${startNum+i}</a></li>
					</c:if>
				</c:forEach>
		
			<c:if test="${startNum+5 <=lastPage}">
				<a class="btn btn-next" href="?page=${startNum+5 }">»</a>
			</c:if>
			
			<c:if test="${ startNum+5 >lastPage}">
				<a class="btn btn-next">»</a>
			</c:if>
		
	</div> --%>
	
	
			
			</main>	
		
			<script>
				window.addEventListener("load", function () {

						function categoryChange(e) {
							var gangnam = ["개포동", "논현동", "대치동",
								"도곡동", "삼성동", "세곡동",
								"수서동", "신사동", "압구정동",
								"역삼동", "일원동", "청담동"];
							var gangdong = ["강일동", "고덕동", "길동",
								"둔촌동", "명일동", "상일동",
								"성내동", "암사동", "천호동"];
							var gangbuk = ["미아동", "변제동", "삼각산동",
								"삼양동", "송중동", "송천동",
								"수유동", "우이동", "인수동"];
							var gangseo = ["가양동", "공항동", "등촌동",
								"발산동", "방화동", "염창동",
								"우장산동", "화곡동", "인수동"];
							var gwanak = ["낙성대동", "난곡동", "난향동",
								"남현동", "대학동", "미성동",
								"보라매동", "삼성동", "서림동",
								"서원동", "성현동", "신림동",
								"신사동", "신원동", "은천동",
								"인헌동", "조원동", "중앙동",
								"청룡동", "청림동", "행운동"];
							var gwangjin = ["광장동", "구의동", "군자동",
								"능동", "자양동", "중곡동",
								"화양동"];
							var guro = ["가리봉동", "개봉동", "고척동",
								"구로동", "수궁동", "신도림동",
								"오류동"];
							var geumcheon = ["가산동", "독산동", "시흥동"];
							var nowon = ["공릉동", "상계동", "월계동",
								"중계동", "하계동"];
							var dobong = ["도봉동", "방학동", "쌍문동",
								"창동"];
							var dongdaemun = ["답십리동", "용신동", "이문제동",
								"장안동", "전농동", "제기동",
								"청량리동", "회기동", "휘경동"];
							var dongjak = ["노량진동", "대방동", "사당동",
								"상도동", "신대방동"];
							var mapo = ["공덕동", "대흥동", "도화동",
								"망원동", "상암동", "서강동",
								"서교동", "성산동", "신수동",
								"아현동", "연남동", "염리동",
								"용강동"];
							var seodaemun = ["남가좌동", "북가좌동", "북아현동",
								"신촌동", "연희동", "천연동",
								"충현동", "홍은동"];
							var seocho = ["내곡동", "반포동", "방배동",
								"서초동", "양재동", "잠원동"];
							var seongdong = ["금호동", "마장동", "사근동",
								"성수동", "송정동", "옥수동",
								"왕십리동", "용답동", "응봉동",
								"행당동"];
							var seongbuk = ["길음동", "돈암동", "동선동",
								"보문동", "삼선동", "석관동",
								"성북동", "안암동", "월곡동",
								"장위동", "정릉동", "종암동"];
							var songpa = ["가락동", "거여동", "마천동",
								"문정동", "방이동", "삼전동",
								"석촌동", "송파동", "오금동",
								"오륜동", "위례동", "잠실동",
								"장지동", "풍납동"];
							var yangcheon = ["목동", "신월동", "신정동"];
							var yeongdeungpo = ["당산동", "대림동", "도림동",
								"문래동", "신길동", "양평동",
								"여의동", "영등포동"];
							var yongsan = ["남영동", "보광동", "서빙고동",
								"용문동", "원효로동", "이촌동",
								"이태원동", "청파동", "한강로동",
								"한남동", "효창동", "후암동"];
							var eunpyeong = ["갈현동", "구산동", "녹번동",
								"대조동", "불광동", "수색동",
								"신사동", "역촌동", "응암동",
								"증산동", "진관동"];
							var jongro = ["가회동", "교남동", "무악동",
								"부암동", "사직동", "삼청동",
								"숭인동", "이화동", "종로동",
								"창신동", "청운효자동", "평창동",
								"혜화동"];
							var jung = ["광희동", "다산동", "동화동",
								"명동", "소공동", "신당동",
								"약수동", "을지로동", "장충동",
								"중림동", "청구동", "필동",
								"황학동", "회현동"];
							var jungrang = ["망우동", "면목동", "묵제동",
								"상봉동", "신내동", "중화동"];


							var target = document.getElementById("dong");

							if (e.value == "gangnam") var d = gangnam;
							else if (e.value == "gangdong") var d = gangdong;
							else if (e.value == "gangbuk") var d = gangbuk;
							else if (e.value == "gangseo") var d = gangseo;
							else if (e.value == "gwanak") var d = gwanak;
							else if (e.value == "gwangjin") var d = gwangjin;
							else if (e.value == "guro") var d = guro;
							else if (e.value == "geumcheon") var d = geumcheon;
							else if (e.value == "nowon") var d = nowon;
							else if (e.value == "dobong") var d = dobong;
							else if (e.value == "dongdaemun") var d = dongdaemun;
							else if (e.value == "dongjak") var d = dongjak;
							else if (e.value == "mapo") var d = mapo;
							else if (e.value == "seodaemun") var d = seodaemun;
							else if (e.value == "seocho") var d = seocho;
							else if (e.value == "seongdong") var d = seongdong;
							else if (e.value == "seongbuk") var d = seongbuk;
							else if (e.value == "songpa") var d = songpa;
							else if (e.value == "yangcheon") var d = yangcheon;
							else if (e.value == "yeongdeungpo") var d = yeongdeungpo;
							else if (e.value == "yongsan") var d = yongsan;
							else if (e.value == "eunpyeong") var d = eunpyeong;
							else if (e.value == "jongro") var d = jongro;
							else if (e.value == "jung") var d = jung;
							else if (e.value == "jungrang") var d = jungrang;


							target.options.length = 0;

							for (x in d) {
								var opt = document.createElement("option");
								opt.value = d[x];
								opt.innerHTML = d[x];
								target.appendChild(opt);

							};
						};


      //});
















					var submitButton = document.querySelector("#submit-button");
					var doorCheckButton = document.querySelector("input[name='categor1']");
					var windowCheckButton = document.querySelector("input[name='category2']");
					var wallCheckButton = document.querySelector("input[name='category3']");
					var bathroomCheckButton = document.querySelector("input[name='category4']");
					var theOthersCheckButton = document.querySelector("input[name='category5']");
			
					submitButton.onclick = function(e){
						e.preventDefault();

						if(doorCheckButton.checked)
						location.href="filter";
					};

					submitButton.onclick = function(e){
						e.preventDefault();

						if(windowCheckButton.checked)
						location.href="filter";
					};

					submitButton.onclick = function(e){
						e.preventDefault();

						if(wallCheckButton.checked)
						location.href="filter";
					};
 
					submitButton.onclick = function(e){
						e.preventDefault();

						if(bathroomCheckButton.checked)
						location.href="filter";
					};

					submitButton.onclick = function(e){
						e.preventDefault();

						if(theOthersCheckButton.checked)
						location.href="filter";
					};

				});
			</script>