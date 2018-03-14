package Soin.controller.InteriorTip;

import java.io.IOException;

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

@WebServlet("/InteriorTip/Process/Detail02")
public class Detail02Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		InteriorTipDao interiorTipDao = new JdbcInteriorTipDao();
		InteriorTipView interiorTip = interiorTipDao.get(id);
		
		request.setAttribute("interiorTip", interiorTip);
		
		/*RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Information/Process/Detail02.jsp");
		
		dispatcher.forward(request, response);*/
		
		 ApplicationContext applicationContext = ServletUtil
		            .getApplicationContext(request.getSession().getServletContext());
		      TilesContainer container = TilesAccess.getContainer(applicationContext);
		      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		      container.render("InteriorTip.Process.Detail02", servletRequest);
	}
}
