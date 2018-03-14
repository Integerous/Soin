package Soin.controller.member.Common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Member/Common/logout")
public class LogoutController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(request.getSession().getAttribute("id") == null)
		{
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
				
			out.print("<script>alert('잘못된 접근입니다.'); history.back();</script>");
		}
		
		else
		{
			request.getSession().invalidate();
			
			response.sendRedirect("../../index");
		}
	}	
}
