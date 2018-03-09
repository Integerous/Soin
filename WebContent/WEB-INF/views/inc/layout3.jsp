<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

<link href="${ctx}/Css/Style3.css" type="text/css" rel="stylesheet"/>
<link href="${ctx}/Css/StyleHF.css" type="text/css" rel="stylesheet" />
</head>
<body>
<!-- 헤더부분 -->
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
<!-- 바디부분 -->
	<tiles:insertAttribute name="main"></tiles:insertAttribute>


<!-- 풋터부분 -->
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>









</body>
</html>