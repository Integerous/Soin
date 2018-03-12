package Soin.controller.member.constructor.list;

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

import Soin.Constructor.ConstructorDao;
import Soin.Constructor.ConstructorView;
import Soin.Constructor.JdbcConstructorDao;

@WebServlet("/member/constructor/list")
public class ListController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 기본페이지 값은 1
		int page = 1;
		int lastPage = 1;

		// 요청한 page 값이 있을 경우 기본값을 대치함.
		String page_ = request.getParameter("page");
		if(page_ != null && !page_.equals(""))
			page = Integer.parseInt(page_);
		
		ConstructorDao constructorDao = new JdbcConstructorDao();
		
		int count = constructorDao.getCount();
		
		if(count > 0) {
			lastPage = count / 15;
			if(count % 15 > 0)
				lastPage++;
		}
		
		int off = (page-1) % 5;
		int startNum = page - off;	
		
		
		List<ConstructorView> list = constructorDao.getList(page);
		
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("startNum", startNum);
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Member/Constructor/List/list8.jsp");
		dispatcher.forward(request, response);*/
		
		//tiles 3.x 버전
		ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Member.Constructor.List.list8", servletRequest);

	}
}
