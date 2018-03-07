<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }"/>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${ctx }/Css/Style6.css" type="text/css" rel="stylesheet" />
<link href="${ctx }/Css/StyleHF.css" type="text/css" rel="stylesheet" />

</head>
<body>


	<div id="body">
		<div class="root-container">
		<tiles:insertAttribute name="header"/>

			<!--------------------------main 시작----------------------------------->
			<tiles:insertAttribute name="main"/>
		</div>
	</div>
	<!---------------------footer -------------------- -->
	<tiles:insertAttribute name="footer"/>

</body>
</html>
