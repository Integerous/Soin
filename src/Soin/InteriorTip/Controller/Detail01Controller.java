package Soin.InteriorTip.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.InteriorTip.InteriorTipDao;
import Soin.InteriorTip.InteriorTipView;
import Soin.InteriorTip.JdbcInteriorTipDao;

@WebServlet("/InteriorTip/SelfTip/Detail01")
public class Detail01Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		InteriorTipDao interiorTipDao = new JdbcInteriorTipDao();
		InteriorTipView interiorTip = interiorTipDao.get(id);
		
		request.setAttribute("interiorTip", interiorTip);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Information/SelfTip/Dateil01.jsp");
		
		dispatcher.forward(request, response);
	}
}
