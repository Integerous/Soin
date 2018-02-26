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


@WebServlet("/InteriorTip/Process/Main02")
public class Main02Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InteriorTipDao interiorDao = new JdbcInteriorTipDao();
		List<InteriorTipView> list = interiorDao.getList();
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Information/Process/Main02.jsp");
		dispatcher.forward(request, response);
	}
}
