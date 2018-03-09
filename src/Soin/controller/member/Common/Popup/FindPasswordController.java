package Soin.controller.member.Common.Popup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.member.JdbcMemberDao;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/Popup/find-password")
public class FindPasswordController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher dispatcher 
		= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/find-password.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String id = request.getParameter("id");
		String phoneNum =request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		
		MemberDao memberDao = new JdbcMemberDao();
		
		String password_ = memberDao.getPassword(id, phoneNum);
		
		request.setAttribute("password", password_);
		
		RequestDispatcher dispatcher 
		= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/find-password-success.jsp");
		dispatcher.forward(request, response);
		
	}
}
