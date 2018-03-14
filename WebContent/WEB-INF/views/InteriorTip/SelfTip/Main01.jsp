<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<main id = "main">
		<div class = "root-container">
			<h1>메인 컨텐츠</h1>
			<div class = "main-text-box">
				컨텐츠 관련 Text(팁 메인) 
			</div>
			
			<div>
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
			</div>
			
			<c:forEach var="it" items="${list }">
			<div class = "main-box">
				<div class = "img-box">
					<a href = "Detail01"><img class = "images" src = "${it.attachedFile}" ></a>
				</div>
				
				<div class = "text-box text-ellipsis">
					<div class = "subtitle">
						<a href="Detail01">subtitle</a>
					</div>
					
					<div class = "title">
						<a href="Detail01">${it.title }</a>
					</div>
					
					<div class = "surmmary">
						<a href="Detail01">${it.content }</a>
					</div>
					
					<div class = "review">
						<a href="Detail01">댓글 수 :${it.commentCount }		/		 좋아요: ${it.likeCount }</a>
					</div>
				</div>
			</div>
			</c:forEach>
			
			
			<div>
      
			     <c:if test="${startNum != 1 }">
			     	<a class="btn btn-prev" href="?p=${startNum-1 }">이전</a>
			     </c:if>
			      
			      <c:if test="${startNum == 1 }">
			      	<span class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');">이전</span>
			      </c:if>
      
   			</div>
   			
   			<c:forEach var="i" begin="0" end="4">
               		<c:if test="${startNum+i <= lastPage}">
               			<li><a href="?p=${startNum+i}&t=&q=" >${startNum+i }</a></li>
               		</c:if>
            </c:forEach>
			
			
			<div class = "main-box">
				<div class = "img-box">
					<a href = "Detail01"><img class = "images" src = "../../Images/jyh/Beanu.jpg" alt="비뉴"></a>
				</div>
				
				<div class = "text-box text-ellipsis">
					<div class = "subtitle">
						<a href="Detail01">subtitle</a>
					</div>
					
					<div class = "title">
						<a href="Detail01">title</a>
					</div>
					
					<div class = "surmmary">
						<a href="Detail01">surmmary</a>
					</div>
					
					<div class = "review">
						<a href="Detail01">리뷰 수 :		/		♥ 좋아요</a>
					</div>
				</div>
			</div>
			
			<div class = "main-box">
				<div class = "img-box">
					<a href = "Detail01"><img class = "images" src = "../../Images/jyh/DesignJ.jpg" alt="디자인제이"></a>
				</div>
				
				<div class = "text-box text-ellipsis">
					<div class = "subtitle">
						<a href="Detail01">subtitle</a>
					</div>
					
					<div class = "title">
						<a href="Detail01">title</a>
					</div>
					
					<div class = "surmmary">
						<a href="Detail01">surmmary</a>
					</div>
					
					<div class = "review">
						<a href="Detail01">리뷰 수 :		/		♥ 좋아요</a>
					</div>
				</div>
			</div>
			
			<div class = "main-box">
				<div class = "img-box">
					<a href = "Detail01"><img class = "images" src = "../../Images/jyh/Illi.jpg" alt="일리"></a>
				</div>
				
				<div class = "text-box text-ellipsis">
					<div class = "subtitle">
						<a href="Detail01">subtitle</a>
					</div>
					
					<div class = "title">
						<a href="Detail01">title</a>
					</div>
					
					<div class = "surmmary">
						<a href="Detail01">surmmary</a>
					</div>
					
					<div class = "review">
						<a href="Detail01">리뷰 수 :		/		♥ 좋아요</a>
					</div>
				</div>
			</div>
			
			<div class = "reg-btn">
				<a href="../Write"><input type="button" value="글쓰기" class = "btn"></a>
			</div>
		</div>
	</main>