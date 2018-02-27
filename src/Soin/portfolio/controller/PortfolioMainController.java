package Soin.portfolio.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.portfolio.JdbcPortfolioDao;
import Soin.portfolio.PortfolioDao;
import Soin.portfolio.PortfolioView;

@WebServlet("/member/constructor/portfolioMain")
public class PortfolioMainController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PortfolioDao portfolioDao = new JdbcPortfolioDao();
		List<PortfolioView> list = portfolioDao.getList();
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher
			= request.getRequestDispatcher("/WEB-INF/views/member/constructor/portfolioMain.jsp");
		
		dispatcher.forward(request, response);
	}
	
	
	
}
