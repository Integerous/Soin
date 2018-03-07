package Soin.controller.member.Common;

import java.io.IOException;

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

import Soin.Constructor.Constructor;
import Soin.Constructor.ConstructorDao;
import Soin.Constructor.JdbcConstructorDao;
import Soin.member.JdbcMemberDao;
import Soin.member.Member;
import Soin.member.MemberDao;

@WebServlet("/Member/Common/registercon_form")
public class RegisterConFormController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
	     TilesContainer container = TilesAccess.getContainer(applicationContext);
	     ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	     container.render("Member.Common.registercon_form", servletRequest);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member();
		Constructor constructor = new Constructor();
		
		String id = request.getParameter("id");
		String phoneNum;
		String corporateRegistrationNumber;
		phoneNum = request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		
		member.setId(id);
		member.setPassword(request.getParameter("password"));
		member.setEmail(request.getParameter("email"));
		member.setAddress(request.getParameter("address"));
		member.setDetailAddress(request.getParameter("detailAddress"));
		member.setPhoneNum(phoneNum);
		member.setRole("CONSTRUCTOR");
		
		MemberDao memberDao = new JdbcMemberDao();
		memberDao.insert(member);
		
		corporateRegistrationNumber = 
				request.getParameter("connum01")+"-"+request.getParameter("connum02")+"-"+request.getParameter("connum03");
		
		constructor.setMember_id(id);
		constructor.setName(request.getParameter("name"));
		constructor.setCorporateRegistrationNumber(corporateRegistrationNumber);
		constructor.setCeoName(request.getParameter("ceoName"));
/*		constructor.setMainImage("mainImage");*/
		constructor.setHomepageAddress(request.getParameter("homepageAddress"));
		constructor.setIntroduction(request.getParameter("introduction"));
		
		constructor.setSpeciality1(request.getParameter("speciality01"));
		
		if(!request.getParameter("speciality02").equals("null"))
			constructor.setSpeciality2("speciality02");
		if(!request.getParameter("speciality03").equals("null"))
			constructor.setSpeciality3("speciality03");
		if(!request.getParameter("speciality04").equals("null"))
			constructor.setSpeciality4("speciality04");
		
		
		ConstructorDao constructorDao = new JdbcConstructorDao();
		constructorDao.insert(constructor);
		
		response.sendRedirect("register_finish");
		
	}
	
}
