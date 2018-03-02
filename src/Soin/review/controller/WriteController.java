package Soin.review.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.review.JdbcReviewDao;
import Soin.review.ReviewDao;
import Soin.review.ReviewView;

// 시공정보만 가져오면됨(카테고리,시공기간,시공업체,거주지역)
// 일단은 get 복붙했음!
@WebServlet("/Review/Write")
public class WriteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");

		ReviewDao reviewDao = new JdbcReviewDao();
		ReviewView review = reviewDao.get(id); //entity가 주로 모델이 됨
		
		request.setAttribute("review", review);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Review/Write.jsp");
		dispatcher.forward(request, response);
	}
}
