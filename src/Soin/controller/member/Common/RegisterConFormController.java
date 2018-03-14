package Soin.controller.member.Common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

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
@MultipartConfig( 
		fileSizeThreshold = 1024*1024*3,
		maxFileSize = 1024*1024*3,
		maxRequestSize = 1024*1024*3
)
public class RegisterConFormController extends HttpServlet
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
			container.render("Member.Common.registercon_form", servletRequest);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");
		
		Member member = new Member();
		Constructor constructor = new Constructor();
		Part part = null;
		
		String id = request.getParameter("id");
		String phoneNum;
		String corporateRegistrationNumber;
		phoneNum = request.getParameter("tel01")+"-"+request.getParameter("tel02")+"-"+request.getParameter("tel03");
		
		String imgName = "main.png";
		
		if(request.getPart("mainImage").getSize()!=0)
		{
			part = request.getPart("mainImage");
			
			String path = "/Member/Constructor/Upload/MainImage/"+id;
			String realPath = request.getServletContext().getRealPath(path);
			
			File file = new File(realPath);
			if(!file.exists())
				file.mkdirs();
			
			imgName = part.getSubmittedFileName();
			InputStream is = part.getInputStream();
			
			byte[] buf = new byte[1024];
			int size = 0;
			
			FileOutputStream fos = new FileOutputStream(realPath+File.separator+imgName);
			
			while((size = is.read(buf, 0, 1024)) != -1)
			{
				fos.write(buf, 0, size);
			}
			
			is.close();
			fos.close();
		}	
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
		constructor.setMainImage(imgName);
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
		
		ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Member.Common.register_finish", servletRequest);
		
	}
	
}
