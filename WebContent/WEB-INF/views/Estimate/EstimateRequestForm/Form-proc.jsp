<%@page import="Soin.EstimateRequest.JdbcEstimateRequestDao"%>
<%@page import="Soin.EstimateRequest.EstimateRequestDao"%>
<%@page import="Soin.EstimateRequest.EstimateRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	EstimateRequest estimateRequest = new EstimateRequest();
	estimateRequest.setConstructionPositionId(request.getParameter("construction-position"));

	EstimateRequestDao estimateRequestDao = new JdbcEstimateRequestDao();
	estimateRequestDao.insert(estimateRequest);
	
	//견적요청 리스트 페이지 만들고 나서 이거 되살리기!!!!!
	//response.sendRedirect("list.jsp");
    
%>