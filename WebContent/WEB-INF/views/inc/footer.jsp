<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>

    <!-- ---------------------FOOTER---------------------- -->
<footer>
 <div id ="footer">

       <div class="foot-container">

       <img id ="ceo" src="${ctx}/Images/yurim/소인대표.jpg" alt="소인대표"/>
         <div id = "company-info">소인 대표 : 한정수<br>
      
            본사 : 서울특별시 마포구 월드컵북로 21
            (지번)서울특별시 마포구 서교동 447-5<br>
            사업자등록번호 : 123-45-67890</div>
   
   
         <p id = "customer-svc">고객센터 :1588-1234 평일 10:00 ~ 18:00 / 주말 10:00 ~ 16:00<br>
            팩스 : 02 - 1234 - 5678
            이메일 : cs@soin.kr| 제휴문의 : constructor@soin.kr</p>
            
            <div id = "copyright"><p>Copyrightⓒ 2018 By SOIN All Right Reserved.</p></div>
          </div>   
    </div>
</footer>	