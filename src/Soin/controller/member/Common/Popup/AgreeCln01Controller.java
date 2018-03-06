package Soin.controller.member.Common.Popup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Member/Common/Popup/agree-cln01")
public class AgreeCln01Controller extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		RequestDispatcher dispatcher 
		= request.getRequestDispatcher("/WEB-INF/views/Member/Common/Popup/agree-cln01.jsp");
		dispatcher.forward(request, response);
	}
	
}
