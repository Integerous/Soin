package Soin.controller.portfolio;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import Soin.portfolio.JdbcPortfolioDao;
import Soin.portfolio.Portfolio;
import Soin.portfolio.PortfolioDao;
import Soin.portfolio.PortfolioView;

@WebServlet("/Member/Constructor/Portfolio/PortfolioMain")



public class PortfolioMainController extends HttpServlet{
 
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String id= request.getParameter("id");//아이디가 꼭 있어야함.

		PortfolioDao portfolioDao = new JdbcPortfolioDao();
		PortfolioView portfolio = portfolioDao.get(id);
		
		request.setAttribute("portfolio", portfolio);
		
		RequestDispatcher dispatcher
			 = request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/Portfolio/PortfolioMain.jsp");
		dispatcher.forward(request, response);*/
		
		
		PortfolioDao portfolioDao = new JdbcPortfolioDao();
		List<Portfolio> list2 = portfolioDao.getList2();
		
		//ConstructorDao constructorDao = new JdbcConstructor();
		
		String title = portfolioDao.getTitle();
		String category = portfolioDao.getCategory();
		
		String memberId = "test";
		
		int pcount= portfolioDao.getTCount(memberId);	
		
		
		
		
		
		request.setAttribute("list2", list2);
		request.setAttribute("pcount", pcount);
		
		
		
		request.getContextPath();
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Member.Constructor.Portfolio.PortfolioMain", servletRequest);
	}
	
	
	
	
	
	
}
