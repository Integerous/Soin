package Soin.controller.Introduce;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/Introduce/introduce")
public class IntroduceController extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/*ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
		TilesContainer container = TilesAccess.getContainer(applicationContext);
		ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		container.render("Introduce.introduce", servletRequest);*/
		
		
		if(request.getSession().getAttribute("id") == null)
		{
			/*response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>location.href='../Member/Common/login?returnUrl=../../Introduce/introduce'; alert('로그인이 필요한 서비스입니다.');</script>");*/
			response.sendRedirect("../Member/Common/login?returnUrl=../../Introduce/introduce");
		}
		else
		{
			ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
			TilesContainer container = TilesAccess.getContainer(applicationContext);
			ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
			container.render("Introduce.introduce", servletRequest);
		}
		
	}
	
	
}
