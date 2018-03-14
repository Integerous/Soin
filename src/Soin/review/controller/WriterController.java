package Soin.review.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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

import Soin.review.JdbcReviewDao;
import Soin.review.Review;
import Soin.review.ReviewDao;
import Soin.review.ReviewView;

// 시공정보만 가져오면됨(카테고리,시공기간,시공업체,거주지역)
// 일단은 get 복붙했음!
@WebServlet("/Review/Write")

@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*5,
		maxRequestSize = 1024*1024*5*5)


public class WriterController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getContextPath(); //경로 알아내기
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		if(request.getSession().getAttribute("id") == null)
		{
			out.println("<script>location.href='../Member/Common/login?returnUrl=../../Review/Write'; alert('로그인이 필요한 서비스입니다.');</script>");
		}
		else if(!request.getSession().getAttribute("role").equals("CLIENT"))
		{
			out.println("<script>history.back(); alert('개인 회원만 이용 가능합니다.');</script>");
		}
		else
		{
			ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("Review.Write", servletRequest);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8;");
		
		Review review= new Review();
		
		//메인사진(첨부파일)을 넣자
		String pathUrl = "SoinProject/Review/upload";
		
		String pathSystem = request
					.getServletContext()
					.getRealPath(pathUrl);	
		//System.out.println(pathSystem);
		File file = new File(pathSystem);
		
		if(!file.exists())
			file.mkdirs();
		
				
		Part part = request.getPart("attachedFile");
		InputStream is = part.getInputStream();
		String fname = part.getSubmittedFileName();
		
		byte[] buf = new byte[1024];
		FileOutputStream fos = new FileOutputStream(pathSystem+File.separator+fname);
		
		int size = 0;
		
		while((size=is.read(buf, 0, 1024))!= -1)
			fos.write(buf,0,size);
		
		is.close();
		fos.close();
		

		//디비에 등록		
		review.setTitle(request.getParameter("title"));
		review.setGradePoint(request.getParameter("gradePoint"));
		review.setAttachedFile(fname);
		review.setContent(request.getParameter("content"));
		//review.setMemberId("newlec123");

		
		ReviewDao reviewDao = new JdbcReviewDao();
		reviewDao.insert(review);

		response.sendRedirect("MainList");
	}
}
