package Soin.portfolio.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.portfolio.JdbcPortfolioDao;
import Soin.portfolio.PortfolioDao;
import Soin.portfolio.PortfolioView;


@WebServlet("/Member/Constructor/Portfolio/PortfolioWrite")
public class PortfolioWriteController extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String id= request.getParameter("id");//아이디가 꼭 있어야함.

			PortfolioDao portfolioDao = new JdbcPortfolioDao();
			PortfolioView portfolio = portfolioDao.get(id);
			
			request.setAttribute("portfolio", portfolio);
			
			RequestDispatcher dispatcher
				 = request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/Portfolio/PortfolioWrite.jsp");
			
			dispatcher.forward(request, response);
			
			
		}
}
