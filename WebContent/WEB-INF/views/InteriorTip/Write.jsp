<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main id = "main">
		<div class = "root-container">
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
					제목  <input class = "write-title" type="text" size="30" placeholder="30자 이내로 작성해주세요.">
				</div>
				
				<br/>
				
				<div class = "tip-images">
					<div class="main-image">
						메인사진 <input type="file" name = "attached" class="tip-image">
					</div>
					
					<br/>
					
					<div class="sub-image">
						추가사진 <input type="file" name = "attached" class="tip-image">
					</div>
				</div>
				
				<br/>
				
				<div>
					팁 작성
					<div>
						<textarea rows="20" cols="60" placeholder="관련된 팁 및 정보에 대한 글을 작성해주세요." name = "tip-write"></textarea>
					</div>
				</div>
				
				<br/>
				
			</div>
				<div class="btn-box">
					<input type="submit"  class = "btn" value="글 등록하기">
					<a class="btn" href="Main01.html">취소</a>
				</div>
		</div>
	</main>