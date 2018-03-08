package Soin.review.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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
public class WriteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getContextPath();		
		
		
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Review.Write", servletRequest);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pathUrl = "/Review/upload";
		
		String pathSystem = request
				.getServletContext()
				.getRealPath(pathUrl);	
		//System.out.println(pathSystem);
		File file = new File(pathSystem);
		
		if(!file.exists())
			file.mkdirs();
		
		Review review= new Review();
		
		/*review.setTitle(request.getParameter("title"));*/
		Part part = request.getPart("attached");
		InputStream is = part.getInputStream();
		
		byte[] buf = new byte[1024];
		FileOutputStream fos = new FileOutputStream(pathSystem);
		
		int size = 0;
		while((size=is.read(buf, 0, size))!= -1)
			fos.write(buf,0,size);
		
		is.close();
		fos.close();

		/*ReviewDao answerisDao = new JdbcReviewDao();
		answerisDao.insert(review);

		response.sendRedirect("list");*/
	}
}
