package Soin.controller.member.Common;

import java.io.IOException;

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

@WebServlet("/Member/Common/register_finish")
public class RegisterFinishController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ApplicationContext applicationContext = ServletUtil.getApplicationContext(request.getSession().getServletContext());
	     TilesContainer container = TilesAccess.getContainer(applicationContext);
	     ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	     container.render("Member.Common.register_finish", servletRequest);
	}

}
