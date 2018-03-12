package Soin.controller.InteriorTip;

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

import Soin.InteriorTip.InteriorTipDao;
import Soin.InteriorTip.InteriorTipView;
import Soin.InteriorTip.JdbcInteriorTipDao;

@WebServlet("/InteriorTip/Material/Main03")
public class Main03Controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page = 1;
		int lastPage = 1;
		
		String page_ = request.getParameter("p");
		if(page_ != null && !page_.equals(""))
			page = Integer.parseInt(page_);
		
		
		InteriorTipDao interiorTipDao = new JdbcInteriorTipDao();
		
		int count = interiorTipDao.getCount();
		
		if(count > 0) {
			lastPage = count/15;
			if(lastPage % 15 > 0)
				lastPage++;
		}
		
		int off = (page - 1) % 5;
		int startNum = page - off;
		
		List<InteriorTipView> list = interiorTipDao.getList(page);
		
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("startNum", startNum);
		
		
		/*RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Information/SelfTip/Main01.jsp");
		
		dispatcher.forward(request, response);*/
		
		
		// tiles 3.x 버전에서 사용하는 방법
	      ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("InteriorTip.Material.Main03", servletRequest);
	}
}
