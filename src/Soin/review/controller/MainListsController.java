package Soin.review.controller;

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

import Soin.review.JdbcReviewDao;
import Soin.review.ReviewDao;
import Soin.review.ReviewView;

@WebServlet("/Review/MainList")
public class MainListsController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 기본값은 1
	      int page = 1;
	      int lastPage = 1;
	      
		// 요청한 page 값이 있을 경우 기본값을 대치함.
		String page_ = request.getParameter("p");
		if (page_ != null && !page_.equals(""))
			page = Integer.parseInt(page_);

		ReviewDao reviewDao = new JdbcReviewDao();
		int count = reviewDao.getCount();

		if (count > 0) {
			lastPage = count / 6;
			if (count % 6 > 0)
				lastPage++;
		}

		int off = (page - 1) % 5;
		int startNum = page - off;

       
		List<ReviewView> list = reviewDao.getList(page);

		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("startNum", startNum);
		request.setAttribute("lastPage", lastPage);
		
		
		
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());		
		TilesContainer container = TilesAccess.getContainer(applicationContext);		
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Review.MainList", servletRequest);
	}

}
