package Soin.controller.member.constructor.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.Constructor.ConstructorDao;
import Soin.Constructor.ConstructorView;
import Soin.Constructor.JdbcConstructorDao;

@WebServlet("/member/constructor/list")
public class ListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConstructorDao constructorDao = new JdbcConstructorDao();
		List<ConstructorView> list = constructorDao.getList(1);
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/Member/Constructor/List/list8.jsp");
		dispatcher.forward(request, response);
	}

}
