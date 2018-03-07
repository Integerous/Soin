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
public class MainListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReviewDao reviewDao = new JdbcReviewDao();
		List<ReviewView> list = reviewDao.getList(1);
		
		
		
		ApplicationContext applicationContext = ServletUtil
				.getApplicationContext(request.getSession().getServletContext());
		
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Review.MainList", servletRequest);
	}

}
