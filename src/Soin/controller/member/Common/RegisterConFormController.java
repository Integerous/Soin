package Soin.controller.Member.Common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Member/Common/registercon_form")
public class RegisterConFormController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/Member/Common/registercon_form.jsp");
		
		dispatcher.forward(request, response);
	}

}
