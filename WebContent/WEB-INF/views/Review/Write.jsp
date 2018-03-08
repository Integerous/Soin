<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



	<main class="main-box">
	<hr/>
	<hr/>
	
	<h1 class="content-title">┃ 후기쓰기</h1>
	
	<div class="form content-table" style="min-height: 650px">
		<ul>
			<li>
				<label class="label-title" for="title">제목</label> 
				<input name="title" type="text" id="input-box" size="20" placeholder="20자 이내로 작성하세요.">
			</li>
			<li>
				<label class="label-title" for="star-button">평점</label> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button" id="input-box"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button"> 
				<input name="gradePoint" type="image" src="../Images/star.png" class="star-button">
				<hr>
			</li>
			<li>
				<label class="label-title" for="info">시공정보</label> 
				<select size="1" id="input-box">
					<option>벽지/창문 - 2018/01/12</option>
				</select>
			</li>
		</ul>
		<!-- 여기다가 디비에서 가져온 시공정보를 불러와야해.....	 -->
	
		<table id="data-table">
			<tbody>
				<tr>
					<td>카테고리 :</td>
				</tr>
				<tr>
					<td>시공기간 :</td>
				</tr>
				<tr>
					<td>시공업체 :</td>
				</tr>
				<tr>
					<td>거주지역 :</td>
				</tr>
			</tbody>
		</table>
	
	
		<hr>
		<ul>
			<li>
				<label class="label-title" for="main-photo">메인사진</label> 
				<input type="file" id="input-box">
			</li>
			<li>
				<label class="label-title" for="plus-photo">추가사진</label> 
				<input type="file" id="input-box">
			</li>
			<li>
				<label class="label-title" for="review">후기작성</label> 
				<textarea name="content" rows="15" cols="60" id="input-box" placeholder="간략한 시공과정과 시공 하면서 느꼈던 점을 솔직하게 알려주세요 :)"></textarea>
			</li>
		</ul>
		<div>
			<input type="submit" class="write-button">
			<!-- <a href="MainList.html" class="button text-button">취소하기</a>
						<a href="" class="button text-button">등록하기</a> -->
		</div>
	</div>
	
	</main>
	
