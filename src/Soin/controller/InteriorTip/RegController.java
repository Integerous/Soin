package Soin.controller.InteriorTip;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Soin.InteriorTip.InteriorTip;
import Soin.InteriorTip.InteriorTipDao;
import Soin.InteriorTip.JdbcInteriorTipDao;

@WebServlet("/InteriorTip/Reg")
public class RegController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		InteriorTip interiorTip = new InteriorTip();
		interiorTip.setMemberId(request.getParameter("memberId"));
		interiorTip.setTitle(request.getParameter("title"));
		interiorTip.setContent(request.getParameter("content"));
		//interiorTip.set
		InteriorTipDao interiorTipDao = new JdbcInteriorTipDao();
	}
}
