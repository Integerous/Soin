package Soin.review.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.review.JdbcReviewDao;
import Soin.review.ReviewDao;
import Soin.review.ReviewView;

@WebServlet("/Review/MainList")
public class MainListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReviewDao reviewDao = new JdbcReviewDao();
		List<ReviewView> list = reviewDao.getList(1);
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Review/MainList.jsp");
		dispatcher.forward(request, response);
	}

}
