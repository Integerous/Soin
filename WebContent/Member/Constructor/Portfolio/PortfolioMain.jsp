<%@page import="Soin.portfolio.PortfolioView"%>
<%@page import="Soin.portfolio.JdbcPortfolioDao"%>
<%@page import="Soin.portfolio.PortfolioDao"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	String id= request.getParameter("id");//아이디가 꼭 있어야함.

	PortfolioDao portfolioDao = new JdbcPortfolioDao();
	PortfolioView portfolio = portfolioDao.get(id);


%> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../../../Css/Style3.css" type="text/css" rel="stylesheet" />
<style type ="text/css"></style>
</head>
<body>
 <div id ="wrap">
    <div id="header">
   
   <div class ="hor-menu menu-member">
		<ul>
			<li><a href="">로그인</a></li>
			<li><a href="">회원가입</a></li>
			<li><a href="">고객센터</a></li>
			<li><a href=""><div class ="imag-member"><img class ="logo-member" src="../../../Images/yurim/ic_add_alert_black_24dp_1x.png" alt=""/></div></a></li>
			<li><a href=""><div class ="imag-member"><img class ="logo-member" src="../../../Images/yurim/ic_contact_phone_black_24dp_1x.png" alt=""/></div></a></li>
		</ul>
   </div>
    
   <div class ="img-logo">
   		 <img id = "logo" src="../../../Images/soin-logo1.png" alt="소인로고"/>
   </div>

   <div class ="hor-menu menu-main">
		<ul>
			<li><a href="">소인소개</a></li>
			<li><a href="">업체소개</a></li> 
			<li><a href="">견적요청</a></li> 
			<li><a href="">인테리어Tip</a></li> 
			<li><a href="">시공후기</a></li>
		</ul>
   </div>
    </div>
 <!--  바디!!!----------------------------------------------------------------------------------------- -->   
 
  <div id ="body">
  	<div class ="company-info">
 		 <div class="constructor-img">
  
  			<img class = "company-main-img" src="../../../Images/yurim/아델라.jpg" alt="아델라로고"/>
 			 <div class ="company-name">
 				 ADELA<br>
				  <img class="star" src="../../../Images/star.png" alt="별점"/>
				  <img class="star" src="../../../Images/star.png" alt="별점"/>
				  <img class="star" src="../../../Images/star.png" alt="별점"/>
				  <img class="star" src="../../../Images/star.png" alt="별점"/>
				  
 			 </div>
  		<div class= "padding-l-10"><a href="">총 10개의 후기</a></div>
  		</div>
  		<div class= "constructor-info">
 		<div class ="font-content">주요 시공> </div>
			  <div class="company-major">
			  <img class="major" src="../../../Images/yurim/window2.png" alt="창문"/>
			  <img class="major" src="../../../Images/yurim/wallpaper3.png" alt="벽지"/>
			  </div>
			  <div class="company-information padding-l-10">
			  <br>  ㈜아델라는 주거공간의 디자인 설계와 시공감리를 전문으로 하는 인테리어 그룹입니다. <br>
			36인의 아델라 멤버는 견적문의에서 계약상담, 감각적인 디자인과 꼼꼼한 시공완료에 이르기까지 
			체계적인 시스템을 바탕으로 유기적으로 활동하고 있습니다. <br><br> 
			
			아델라의 디자이너는 제각기 독특한 개성을 갖추고 있습니다. <br>
			도장찍듯 동일한 컨셉의 공간이 아닌 ‘나만의 집’을 위하여 아델라를 찾으신 
			고객님의 다채로움을 이해하고 즐기는 아델라의 개성넘치는 디자이너가 
			흰 도화지에 멋진 작품을 만들어 드릴 것입니다. <br><br>  
			아델라는 정직합니다. <br>
			정직한 주거 인테리어만을 바라보며 정도의 길을 달려온 지 20년이 되었습니다.<br>
			그간의 노하우와 아델라의 진심을 버무려 
			지금의 아델라가 존재하게 되었습니다. <br>
			예나 지금이나 변하지 않는 한가지, 
			진심은 통한다는 믿음으로 고객님과 함께 하겠습니다. <br><br> 
			

 		 </div>
  
 		 </div>
  </div>
<!-- --------------------------------------->
<div class="company-sort">
	<div class="company-array">
		<div class="body-font">정렬></div>
			<select>
				<option value="최신순">최신순</option>
				<option value="조회순">조회순</option>
				<option value="인기순">인기순</option>
			</select>
		</div>
	<div class ="construction-sort">
		<div class="body-font">분류></div>
			<a href=""><img class="major" src="../../../Images/yurim/window2.png" alt="창문"/></a>
			<a href=""><img class="major" src="../../../Images/yurim/wallpaper3.png" alt="벽지"/></a>
			<a href=""><img class="major" src="../../../Images/yurim/door2.png" alt="문"/></a>
			<a href=""><img class="major" src="../../../Images/yurim/bath2.png" alt="욕조"/></a>

	</div>
		<div>
			<form class="search">
				<input type ="text"/>
				<input class ="btn" type="submit" value="Search"/>
			
			</form>
		</div>
	
		
		<!-- <div class="search">
			<form class="box">
			<input type="text" />
			<input class="btn"  type="submit"  value="검색" />
		</form> 
		</div> -->
		</div>
 <!-- ------후기들시작----------------------------------  -->
  		<div class="company-port">
 		 <div class="company-content">
  
		<div class="company-content2">

		<a href=""><img class="img-interior" src="../../../Images/yurim/문1.jpg" alt="문1"/></a>
		<ul class="text-ellipsis">
		<li>문</li>
		<li style="font-size:11px">튼튼하고 견고한 문으로 바꿔서 좋아해요 </li>
		</ul>
		</div>


		<div class="company-content2">
			<a href=""><img class="img-interior" src="../../../Images/yurim/타일1.jpg" alt="타일1"/></a>
				<ul class="text-ellipsis">
				<li>벽지</li>
				<li style="font-size:11px">화사한 벽지로 변신!!</li>
				</ul>
		</div>

	<div class="company-content2">
		<a href=""><img class="img-interior" src="../../../Images/yurim/창문1.jpg" alt="창문1"/></a>
			<ul class="text-ellipsis">
				<li>창문</li>
				<li style="font-size:11px">확트인만큼 빛도 많이 들어오네?</li>
			</ul>
			</div>
  
  	</div>

  <div class="company-content">
  <div class="company-content2">
			<a href=""><img class="img-interior" src="../../../Images/yurim/창문2.jpg" alt="창문2"/></a>
			<ul class="text-ellipsis">
			<li>창문</li>
			<li style="font-size:11px">실내 창문의 또다른 혁명! 너도나도 고고고</li>
			</ul>
			</div>

		<div class="company-content2">
		<a href=""><img class="img-interior" src="../../../Images/yurim/욕실1.jpg" alt="욕실1"/></a>
			<ul class="text-ellipsis">
			<li>욕실</li>
		<li style="font-size:11px">깔끔한 모노톤으로 시공완료!</li>
		</ul>
		</div>

		<div class="company-content2">
		<a href=""><img class="img-interior" src="../../../Images/yurim/욕실2.jpg" alt="욕실2"/></a>
		<ul class="text-ellipsis">
		<li>욕실</li>
		<li style="font-size:11px">세면대와 변기를 바꿨어요</li>
		</ul>
		</div>
		  </div>
  
		  <div class="company-content">
		  <div class="company-content2">
		  <a href=""><img class="img-interior" src="../../../Images/yurim/벽지1.jpg" alt="벽지1"/></a>
		 	 <ul class="text-ellipsis">
				<li>벽지</li>
				<li style="font-size:11px">화사한 벽지로 변신!!</li>
			</ul>
		  </div>
		  <div class="company-content2">
		  	<a href=""><img class="img-interior" src="../../../Images/yurim/벽지2.jpg" alt="벽지2"/></a>
		 	 <ul class="text-ellipsis">
				<li>창문</li>
				<li style="font-size:11px">최대한 위에 창문을 달았네요</li>
			</ul>
 		 </div>
 		 <div class="company-content2">
  		<a href=""><img class="img-interior" src="../../../Images/yurim/타일1.jpg" alt="타일1"/></a>
  		<ul class="text-ellipsis">
		<li>문</li>
		<li style="font-size:11px">같은 색으로 통일했네요 친환경스타일</li>
		</ul>
		  </div>
		  </div>
		  </div>
    
    	</div>
    	<div class="pagination">
			    <a href="#">«</a>
				<a href="#">1</a>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>	
				<a href="#">»</a>
				
			</div>
	</div>
    	
 <!-- 풋터!!!-----------------------------------------------------------------------------------------  -->  
    <div id ="footer">
    	<div class="root-container">
	    <img id ="ceo" src="../../../Images/yurim/소인대표.jpg" alt="소인대표"/>
	  	 <div id = "company-info">소인 대표 : James Han<br>
	   
				본사 : 서울특별시 마포구 월드컵북로 21
				(지번)서울특별시 마포구 서교동 447-5<br>
				사업자등록번호 : 123-45-67890</div>
	
	
			<p id = "customer-svc">고객센터 :1588-1234 평일 10:00 ~ 18:00 / 주말 10:00 ~ 16:00<br>
				팩스 : 02 - 1234 - 5678
				이메일 : cs@soin.kr| 제휴문의 : constructor@soin.kr</p>
				
				<div id = "copyright"><p>Copyrightⓒ 2018 By SOIN All Right Reserved.</p></div>
			 </div>	
    </div>
    
 
  
   <!--side bar ------------------------- --> 
 <div id = "side">
 	
 		<a href-"">견적 신청하기</a>
 	
 
 </div>  	
  
  
  
</body>





</html>