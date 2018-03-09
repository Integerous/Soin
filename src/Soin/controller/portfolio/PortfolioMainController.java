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

import Soin.Constructor.Constructor;
import Soin.Constructor.ConstructorDao;
import Soin.Constructor.ConstructorView;
import Soin.portfolio.JdbcPortfolioDao;
import Soin.portfolio.PortfolioDao;
import Soin.portfolio.PortfolioView;

@WebServlet("/Member/Constructor/Portfolio/PortfolioMain")
public class PortfolioMainController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page =1;
		int lastPage =1;
		
		String page_ = request.getParameter("p");
		if(page_ != null&& !page_.equals(""))
			page = Integer.parseInt(page_);
		
		
		
		PortfolioDao portfolioDao = new JdbcPortfolioDao();
		List<PortfolioView> list = portfolioDao.getList(page);
		
		int count = portfolioDao.getCount();
		
		
		if(count>0) {
			lastPage = count/9;
			if(count%15>0)
				lastPage++;
			
		}
		
		int off =(page-1)%5;//밑에식을 써먹으려고만든거.
		int startNum = page - off;
		
		
		
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("startNum", startNum);
		
		
		request.getContextPath();
		
		 ApplicationContext applicationContext = ServletUtil
	             .getApplicationContext(request.getSession().getServletContext());
	       TilesContainer container = TilesAccess.getContainer(applicationContext);
	       ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	       container.render("Member.Constructor.Portfolio.PortfolioMain", servletRequest);
		
		
		/*String id= request.getParameter("member_id");//아이디가 꼭 있어야함.
		ConstructorView constructor = ConstructorDao.get(id);*/

		String id= request.getParameter("id");
		PortfolioView portfolio = portfolioDao.get(id);
		
		request.setAttribute("portfolio", portfolio);
		
		/*RequestDispatcher dispatcher
			 = request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/Portfolio/PortfolioMain.jsp");
		dispatcher.forward(request, response);*/
		
	}
	
}
