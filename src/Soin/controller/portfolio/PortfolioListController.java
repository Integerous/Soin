package Soin.controller.portfolio;

import java.io.IOException;
import java.util.List;

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

import Soin.portfolio.JdbcPortfolioDao;
import Soin.portfolio.PortfolioDao;
import Soin.portfolio.PortfolioView;


@WebServlet("/member/constructor/portfolio/portfolioList")
public class PortfolioListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int page =1;
		int lastPage =1;
		
		String page_ = request.getParameter("p");
		if(page_ != null&& !page_.equals(""))
			page = Integer.parseInt(page_);
		
		
		
		PortfolioDao portfolioDao = new JdbcPortfolioDao();
		/*List<PortfolioView> list = portfolioDao.getList();*/
		
		int count = portfolioDao.getCount();
		
		
		if(count>0) {
			lastPage = count/9;
			if(count%15>0)
				lastPage++;
			
		}
		
		int off =(page-1)%5;//밑에식을 써먹으려고만든거.
		int startNum = page - off;
		
		List<PortfolioView> list = portfolioDao.getList(page);
		
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("startNum", startNum);
		
		
		 /*ApplicationContext applicationContext = ServletUtil
		            .getApplicationContext(request.getSession().getServletContext());
		      TilesContainer container = TilesAccess.getContainer(applicationContext);
		      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		      container.render("student.community.answeris.list", servletRequest);*/
		
		
		
		/*RequestDispatcher dispatcher
			= request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/Portfolio/PortfolioList.jsp");
		
		dispatcher.forward(request, response);*/
		
		
		request.getContextPath();
			
		 ApplicationContext applicationContext = ServletUtil
	             .getApplicationContext(request.getSession().getServletContext());
	       TilesContainer container = TilesAccess.getContainer(applicationContext);
	       ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	       container.render("Member.Constructor.Portfolio.PortfolioList", servletRequest);
		
	       
	}
	
	
	
	
}
