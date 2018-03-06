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
		
		
		corporateRegistrationNumber = 
				request.getParameter("connum01")+"-"+request.getParameter("connum02")+"-"+request.getParameter("connum03");
		
		constructor.setMember_id(id);
		constructor.setName("name");
		constructor.setCorporateRegistrationNumber(corporateRegistrationNumber);
		constructor.setCeoName("ceoName");
		constructor.setMainImage("mainImage");
		constructor.setHomepageAddress("homepageAddress");
		constructor.setIntroduction("introduction");
		constructor.setSpeciality1("speciality1");
		constructor.setSpeciality2("speciality2");
		constructor.setSpeciality3("speciality3");
		constructor.setSpeciality4("speciality4");
		
		
		ConstructorDao constructorDao = new JdbcConstructorDao();
		constructorDao.insert(constructor);
		
		response.sendRedirect("register_finish");
		
	}
	
}
