package Soin.controller.member.Common.Popup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.member.JdbcMemberDao;
import Soin.member.Member;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/Popup/find-id")
public class FindIdController extends HttpServlet 
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
			= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/find-id.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String phoneNum =request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		
		MemberDao memberDao = new JdbcMemberDao();
		
		String id = memberDao.findId(email, phoneNum);
		
		
		if(id == null)
		{
			out.println("<script>alert('아이디가 없거나 입력된 정보가 일치하지 않습니다.'); location.href='find-id';</script>");
		}
		else
		{
			request.setAttribute("id", id);
			
			RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/find-id-success.jsp");
			dispatcher.forward(request, response);
		}	
	}
}
