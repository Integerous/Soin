package Soin.controller.member.Common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
import Soin.memberRole.JdbcMemberRoleDao;
import Soin.memberRole.MemberRole;
import Soin.memberRole.MemberRoleDao;

@WebServlet("/Member/Common/registercln_form")
public class RegisterClnFormController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
	     TilesContainer container = TilesAccess.getContainer(applicationContext);
	     ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	     container.render("Member.Common.registercln_form", servletRequest);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Member member = new Member();
		Client client = new Client();
		MemberRole memberRole = new MemberRole();
		
		String id = request.getParameter("id");
		String phoneNum;
		
		phoneNum = request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		
		
		member.setId(id);
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));
		member.setAddress(request.getParameter("address"));
		member.setDetailAddress(request.getParameter("detailAddress"));
		member.setPhoneNum(phoneNum);
		
		client.setMemberId(id);
		client.setNickName(request.getParameter("nickName"));
		client.setSelectCheck(Integer.parseInt(request.getParameter("selectCheck")));
		
		memberRole.setMemberId(id);
		memberRole.setRoleName(request.getParameter("roleName"));
		
		MemberDao memberDao = new JdbcMemberDao();
		memberDao.insert(member);
		
		ClientDao clientDao = new JdbcClientDao();
		clientDao.insert(client);
		
		MemberRoleDao memberRoleDao = new JdbcMemberRoleDao();
		memberRoleDao.insert(memberRole);
		
		response.sendRedirect("register_finish");
	}

}
