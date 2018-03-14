package Soin.controller.member.Common.Popup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Soin.member.JdbcMemberDao;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/Popup/find-password")
public class FindPasswordController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(request.getSession().getAttribute("id") != null)
		{	
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print("<script>alert('잘못된 접근입니다.'); history.back();</script>");
		}
		else
		{
			RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/find-password.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String phoneNum =request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		
		MemberDao memberDao = new JdbcMemberDao();
		Boolean ckPwd = memberDao.checkPassword(id, phoneNum);
		
		if(ckPwd == false)
		{
			out.println("<script>alert('입력된 정보가 일치하지 않습니다.'); location.href='find-password';</script>");
		}
		else
		{
			HttpSession fpwSession = request.getSession();
			fpwSession.setAttribute("memberId", id);
			fpwSession.setMaxInactiveInterval(300);
			RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/find-password-update.jsp");
			dispatcher.forward(request, response);
		}
	}
}
