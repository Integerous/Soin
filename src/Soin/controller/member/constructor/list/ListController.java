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
		
		//기본페이지 
		int page = 1;
		int lastPage = 1;
		
		//요청한 페이지 값 있을시
		String page_ = request.getParameter("page");
		if(page_ != null && !page_.equals(""))
			page = Integer.parseInt(page_);
		
		ConstructorDao constructorDao = new JdbcConstructorDao();
		
		int count = constructorDao.getCount();
		
		if(count > 0) {
			lastPage = count/15;
			if(count % 15 >0)
				lastPage++;
		}
		
		int off = page % 5 - 1;
		int startNum = page - off;
		
		
		List<ConstructorView> list = constructorDao.getList(page);
		
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("lastPage", lastPage);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/List/list8.jsp");
		dispatcher.forward(request, response);
	}

}
