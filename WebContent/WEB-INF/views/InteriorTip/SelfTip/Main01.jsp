<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}" />

<main id = "main">
		<div class = "root-container">
			<h1>메인 컨텐츠</h1>
			<div class = "main-text-box">
				<!-- 컨텐츠 관련 Text(팁 메인) --> 
			</div>
			
			<!-- <div>
				<div class = "search-box03">
						<select name = "category">
							<option value = "" selected = "selected">카테고리1</option>
							<option value = "창문">창문</option>
							<option value = "문">문</option>
							<option value = "욕실">욕실</option>
							<option value = "벽지">벽지</option>
							<option value = "기타">기타</option>
						</select>

						<select name = "category">
							<option value = "" selected = "selected">소재:카테고리2</option>
							<option value = "알루미늄">알루미늄</option>
							<option value = "목재">목재</option>
							<option value = "비닐">비닐</option>
							<option value = "기타">기타</option>
						</select>					
					
					<input type = "search"  id = "search" placeholder="소재 관련 검색"  class = "search-text">
					<input type = "submit" value = "검색" class = "btn">
				</div>
			</div> -->
			
			<c:forEach var="it" items="${list }">
			<div class = "main-box">
				<div class = "img-box">
					<a href = "Detail01?id=${it.id }"><img class = "images" src = "${ctx}/soin/upload/InteriorTip/${it.attachedFile}" ></a>
				</div>
				
				<div class = "text-box text-ellipsis">
					<%-- <div class = "subtitle">
						<a href="Detail01?id=${it.id }">subtitle</a>
					</div> --%>
					
					<div class = "title">
						<a href="Detail01?id=${it.id }}">${it.title }</a>
					</div>
					
					<div class = "surmmary .text-ellipsis">
						<a href="Detail01?id=${it.id }">${it.content }</a>
					</div>
					
					<div class = "review-like">
						<a href="Detail01?id=${it.id }">댓글 수 :${it.commentCount }		/		 좋아요: ${it.likeCount }</a>
					</div>
				</div>
			</div>
			</c:forEach>
			
			
			<div>
      
			     <c:if test="${startNum != 1 }">
			     	<a class="btn" href="?p=${startNum-1 }">이전</a>
			     </c:if>
			      
			      <c:if test="${startNum == 1 }">
			      	<span class="btn" onclick="alert('이전 페이지가 없습니다.');">이전</span>
			      </c:if>
      
   			
   			
   			<c:forEach var="i" begin="0" end="4">
               		<c:if test="${startNum+i <= lastPage}">
						<a style="font-size: 15px;" href="?p=${startNum+i}" >${startNum+i }</a>
               		</c:if>
            </c:forEach>
			
			
			<c:if test="${startNum+5 <= lastPage }">
        		<a class="btn"  href="?p=${startNum+5 }">다음</a>
         	</c:if>
         
         <c:if test="${startNum+5 > lastPage }">
         <span class="btn" onclick="alert('다음 페이지가 없습니다.');">다음</span>
         </c:if>
         
			</div>
			<div class = "reg-btn">
				<a href="../Write"><input type="button" value="글쓰기" class = "btn"></a>
			</div>
		</div>
	</main>