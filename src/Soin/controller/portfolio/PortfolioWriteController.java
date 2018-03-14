package Soin.controller.portfolio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

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

import com.google.gson.Gson;

import Soin.Constructor.Constructor;
import Soin.Constructor.ConstructorDao;
import Soin.Constructor.JdbcConstructorDao;
import Soin.portfolio.JdbcPortfolioDao;
import Soin.portfolio.Portfolio;
import Soin.portfolio.PortfolioDao;
import Soin.portfolio.PortfolioView;


@WebServlet("/Member/Constructor/Portfolio/PortfolioWrite")

@MultipartConfig( 
		fileSizeThreshold=1024*1024,
		maxFileSize=1024*1024*5,
		maxRequestSize=1024*1024*5*5//전체 요청 크기 5메가 5개까지.
)

public class PortfolioWriteController extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			//String id= request.getParameter("id");//아이디가 꼭 있어야함.
//여기서 id값 넘어 오는지 찍어봐 id 요고 system.out같은 걸로ㅇㅋ
			//PortfolioDao portfolioDao = new JdbcPortfolioDao();
			//PortfolioView portfolio = portfolioDao.get(id);
			
			//request.setAttribute("portfolio", portfolio);
			
			//RequestDispatcher dispatcher
			//	 = request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/Portfolio/PortfolioWrite.jsp");
			
			//dispatcher.forward(request, response);
				
			//response.setCharacterEncoding("UTF-8");
			//response.setContentType("text/html; charset=UTF-8");
			
			/*Gson gson = new Gson(); 
			String json = gson.toJson(id);??????*/
			
			
			
			request.getContextPath();
			ApplicationContext applicationContext = ServletUtil
					.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("Member.Constructor.Portfolio.PortfolioWrite", servletRequest);
		}
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			

			
			request.setCharacterEncoding("utf-8");
			
			//regController.jsp보고 하기.
			String pathUrl ="/portfolio/upload";//물리적인 경로
			String pathSystem = request.getServletContext().getRealPath(pathUrl);
			
			
			File file = new File(pathSystem);

				if(!file.exists())
				file.mkdirs();
				
			Portfolio portfolio = new Portfolio();
			Constructor constructor = new Constructor();
			
			
			Part part = request.getPart("attached1");
			InputStream is = part.getInputStream();
			String fname = part.getSubmittedFileName();
			
			byte[] buf = new byte[1024]; //1024개의 배열을 만들고
			FileOutputStream fos = new FileOutputStream(pathSystem+File.separator+fname);
			
			int size = 0;
			
			while((size = is.read(buf,0,1024))!=-1)//size가 -1이면  값이 없는거임.
				fos.write(buf,0,size);
			
			is.close();
			fos.close();
			
			//임의값
			portfolio.setProductId("dd");
			portfolio.setConstructionPositionId("room");
			portfolio.setBuildingTypeId("ddddd");
			portfolio.setConstructionTypeId("window");
			
			
			//portfolio.setMemberId((String)request.getSession().getAttribute("id"));
			portfolio.setMemberId("test");
			
			
			
			portfolio.setTitle(request.getParameter("portfolio-title"));//포트폴리오제목
			portfolio.setCategory(request.getParameter("category"));//카테고리
			//portfolio.set(request.getParameter("constructorName"));//업체명
			portfolio.setLocation(request.getParameter("location"));//지역명
			portfolio.setPeriod(request.getParameter("constructionPeriod"));//공사기간
			//portfolio.set(request.getParameter("constructionSort"));//시공종류->나중에하기.
			//portfolio.setAttachedFile(request.getParameter("attached1"));//사진선택
			portfolio.setAttachedFile(fname);//사진선택
			
			portfolio.setContent(request.getParameter("detailContent"));//내용
			
			
			PortfolioDao portfolioDao = new JdbcPortfolioDao();
			portfolioDao.insert(portfolio);
/*			ConstructorDao constructorDao = new JdbcConstructorDao();
			constructorDao.get(constructor);
*/			
			//여기 부분 바로 리다이렉트 되니까 내가 주석처리 해놈
			response.sendRedirect("PortfolioMain");//작성하면 포폴메인으로 이동함.
		}
		
		
}
