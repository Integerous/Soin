package Soin.controller.InteriorTip;

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

import Soin.InteriorTip.InteriorTip;
import Soin.InteriorTip.InteriorTipDao;
import Soin.InteriorTip.JdbcInteriorTipDao;

@WebServlet("/InteriorTip/Write")
@MultipartConfig(
		fileSizeThreshold = 1024 * 1024,		//1MB이상일 경우 메모리 사용 (?) ← 이게 무슨 말이야 ?
		maxFileSize = 1024 * 1024 * 3,	// 100메가
		maxRequestSize = 1024 * 1024 * 3 * 5 // 100메가 5개까지
		)

public class interiorTipWriteController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("id") == null)
		{
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>location.href='../Member/Common/login?returnUrl=../../Introduce/introduce'; alert('로그인이 필요한 서비스입니다.');</script>");

			/*response.sendRedirect("../Member/Common/login?returnUrl=../../InteriorTip/Write");*/
		}
		else
		{
			request.getContextPath();
			
			ApplicationContext applicationContext = ServletUtil
		            .getApplicationContext(request.getSession().getServletContext());
		      TilesContainer container = TilesAccess.getContainer(applicationContext);
		      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		      container.render("InteriorTip.Write", servletRequest);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		InteriorTip interiorTip = new InteriorTip();
		
		//파일 관련------------------------------------------------------------------
		
		String pathUrl = "/soin/upload/InteriorTip";
		
		String pathSystem = request.getServletContext().getRealPath(pathUrl);
		
		File file = new File(pathSystem);
		if(!file.exists())
			file.mkdirs();
		
		//Part part = null;
		
		//if(request.getPart("file").equals("")) {
		Part part = request.getPart("file");
		
		InputStream is = part.getInputStream();
		String fname = part.getSubmittedFileName();
		
		byte[] buf = new byte[1024];
		
		FileOutputStream fos = new FileOutputStream(pathSystem+File.separator+fname);
		
		int size = 0;
		
		while((size = is.read(buf, 0,1024)) != -1)
			fos.write(buf, 0, size);
		
		is.close();
		fos.close();
		interiorTip.setAttachedFile(fname);
		//}
		
		//파일 관련------------------------------------------------------------------
		
		
		//interiorTip.setMemberId(request.getParameter("memberId"));
		interiorTip.setTitle(request.getParameter("title"));
		interiorTip.setContent(request.getParameter("content"));
		
		InteriorTipDao interiorTipDao = new JdbcInteriorTipDao();
		interiorTipDao.insert(interiorTip);
		
		response.sendRedirect("SelfTip/Main01");
	}
}
