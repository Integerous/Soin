package Soin.controller.member.Common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import Soin.member.JdbcMemberDao;
import Soin.member.Member;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/login")
public class LoginController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		if(request.getSession().getAttribute("id") != null)
		{	
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print("<script>history.back(); alert('이미 로그인 하셨습니다.');</script>");
		}
		
		else
		{
			ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("Member.Common.login", servletRequest);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String inputId = request.getParameter("id");
		String inputPassword = request.getParameter("password");
		
		MemberDao memberDao = new JdbcMemberDao();
		Member member =memberDao.get(inputId, inputPassword);
		
		String returnUrl = request.getParameter("returnUrl");
		
		if(member == null)
		{
			if(returnUrl != null)
				out.printf("<script>location.href='login?returnUrl=%s'; alert('아이디 또는 비밀번호가 정확하지 않습니다.');</script>", returnUrl);
			else
				out.print("<script>location.href='login'; alert('아이디 또는 비밀번호가 정확하지 않습니다.');</script>");
		}
		else if(!inputPassword.equals(member.getPassword()))
		{
			if(returnUrl != null)
				out.printf("<script>location.href='login?returnUrl=%s'; alert('아이디 또는 비밀번호가 정확하지 않습니다.');</script>", returnUrl);
			else
				out.print("<script>location.href='login'; alert('아이디 또는 비밀번호가 정확하지 않습니다.');</script>");
		}
		else
		{
			request.getSession().setAttribute("id", member.getId());
			request.getSession().setAttribute("role", member.getRole());
			
			
			if(returnUrl != null)
				response.sendRedirect(returnUrl);
			else
				response.sendRedirect("../../index");
				
		}		
		
	}
	
	
}
