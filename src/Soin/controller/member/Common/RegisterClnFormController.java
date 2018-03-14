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

import Soin.client.Client;
import Soin.client.ClientDao;
import Soin.client.JdbcClientDao;
import Soin.member.JdbcMemberDao;
import Soin.member.Member;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/registercln_form")
public class RegisterClnFormController extends HttpServlet
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
			ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("Member.Common.registercln_form", servletRequest);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");
		
		Member member = new Member();
		Client client = new Client();
		
		String id = request.getParameter("id");
		String phoneNum;
		String address = request.getParameter("add01") + " " + request.getParameter("add02");
		
		phoneNum = request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		member.setId(id);
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));
		member.setAddress(address);
		member.setDetailAddress(request.getParameter("detailAddress"));
		member.setPhoneNum(phoneNum);
		member.setRole("CLIENT");
		
		MemberDao memberDao = new JdbcMemberDao();
		memberDao.insert(member);
		
		client.setMemberId(id);
		client.setNickName(request.getParameter("nickName"));
		client.setSelectCheck(request.getParameter("selectCheck"));
		
		ClientDao clientDao = new JdbcClientDao();
		clientDao.insert(client);
		
		ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Member.Common.register_finish", servletRequest);
	}

}
