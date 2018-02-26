package Soin.Information.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.InteriorTip.InteriorTipDao;
import Soin.InteriorTip.InteriorTipView;
import Soin.InteriorTip.JdbcInteriorTipDao;

@WebServlet("/InteriorTip/SelfTip/Main01")
public class Main01Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InteriorTipDao interiorTipDao = new JdbcInteriorTipDao();
		List<InteriorTipView> list = interiorTipDao.getList();
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Information/SelfTip/Main01.jsp");
		
		dispatcher.forward(request, response);
	}
}
