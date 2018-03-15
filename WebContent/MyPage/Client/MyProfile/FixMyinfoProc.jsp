<%@page import="Soin.member.MemberView"%>
<%@page import="Soin.member.Member"%>
<%@page import="Soin.client.Client"%>
<%@page import="Soin.client.ClientDao"%>
<%@page import="Soin.client.JdbcClientDao"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Soin.member.JdbcMemberDao"%>
<%@page import="Soin.member.MemberDao"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	
	
	String memId =(String)request.getSession().getAttribute("id");
    String password = request.getParameter("password");
	String confPassword = request.getParameter("confPassword");
	String email = request.getParameter("email");
	String phoneNum = request.getParameter("phoneNum");
	String address = request.getParameter("address");
	String detailAddress = request.getParameter("detailAddress");
	String nickName = request.getParameter("nickName");
	
	System.out.println(memId);
	System.out.println(password);
	System.out.println(confPassword);
	System.out.println(email);
	System.out.println(phoneNum);
	System.out.println(address);
	System.out.println(detailAddress);
	System.out.println(nickName);
	
/* 	ClientDao clientDao = new JdbcClientDao();
	Client client = clientDao.get(memId);
	client.setNickName(nickName);
	clientDao.update(client);
	
	MemberDao memberDao = new JdbcMemberDao();
	MemberView memberView = memberDao.get(memId);
	Member member = memberView.getMember();
	member.setPassword(password);
	member.setEmail(email);
	member.setPhoneNum(phoneNum);
	member.setAddress(address);
	member.setDetailAddress(detailAddress);
	memberDao.update(member); */
	
	
	
	
    String sql = "UPDATE CLIENT SET NICKNAME=? WHERE MEMBER_ID=?";	
 	String sql2 = "UPDATE MEMBER SET PASSWORD=?, EMAIL=?, PHONE_NUMBER=?, ADDRESS=?, DETAIL_ADDRESS=? WHERE ID=?";
 	
	//0.드라이버 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//1.연결 생성
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.251:1521:orcl", "c##soin",
			"soin1218");
	//2.문장 실행
	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1, nickName);
	st.setString(2, memId);
	st.executeUpdate();  
	
	PreparedStatement st2 = con.prepareStatement(sql2);
	st2.setString(1, password);
	st2.setString(2, email);
	st2.setString(3, phoneNum);
	st2.setString(4, address);
	st2.setString(5, detailAddress);
	st2.setString(6, memId);
	st2.executeUpdate();
	
	st.close();
	con.close();
	
	response.sendRedirect("MyProfile.jsp");
   %>