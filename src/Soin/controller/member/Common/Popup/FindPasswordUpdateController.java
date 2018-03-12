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

@WebServlet("/Member/Common/Popup/find-password-update")
public class FindPasswordUpdateController extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		HttpSession fpwSession = request.getSession();
		
		String password = request.getParameter("password");
		String id = (String)fpwSession.getAttribute("memberId");
		
		MemberDao memberDao = new JdbcMemberDao();
		memberDao.updatePassword(password, id);

		fpwSession.removeAttribute("memberId");
		
		out.println("<script>alert('비밀번호 변경에 성공하였습니다.');  window.open('about:blank', '_self').close(); </script>");
		
	}
}