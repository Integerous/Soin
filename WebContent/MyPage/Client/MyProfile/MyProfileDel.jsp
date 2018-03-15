<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%   

    request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	
	String memId = (String) request.getSession().getAttribute("id");
	
    String sql = "DELETE MEMBER WHERE ID=?";	
	//0.드라이버 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//1.연결 생성
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.251:1521:orcl", "c##soin",
			"soin1218");
	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1, memId);
	st.executeUpdate();
	
	st.close();
	con.close();
	
	request.getSession().invalidate();
	response.sendRedirect("MyProfile.jsp");
	
 %>