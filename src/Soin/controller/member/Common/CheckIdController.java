package Soin.controller.member.Common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.member.JdbcMemberDao;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/idcheck")
public class CheckIdController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String ckId = request.getParameter("id");
		
		MemberDao memberDao = new JdbcMemberDao();
		Boolean cki = memberDao.getId(ckId);

		out.print(cki);
			
	}

}
