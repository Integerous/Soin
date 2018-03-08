package Soin.controller.estimate.EstimateRequestForm;

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

import Soin.EstimateRequest.EstimateRequest;
import Soin.EstimateRequest.EstimateRequestDao;
import Soin.EstimateRequest.EstimateRequestView;
import Soin.EstimateRequest.JdbcEstimateRequestDao;

@WebServlet("/estimate/EstimateRequestForm/Form1")

public class FormController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");

		EstimateRequestDao estimateRequestDao = new JdbcEstimateRequestDao();
		EstimateRequestView estimateRequest = estimateRequestDao.get(id);
		
		
		request.setAttribute("estimateRequest", estimateRequest);
		
		
		
		/*RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Estimate/EstimateRequestForm/Form1.jsp");
		dispatcher.forward(request, response);*/
		
		
		ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("Estimate.EstimateRequestForm.Form1", servletRequest);
		       
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		EstimateRequest estimateRequest = new EstimateRequest();
		estimateRequest.setConstructionPositionId(request.getParameter("construction-position"));

		EstimateRequestDao estimateRequestDao = new JdbcEstimateRequestDao();
		estimateRequestDao.insert(estimateRequest);
		
		//견적요청 리스트 페이지 만들고 나서 이거 되살리기!!!!!
		response.sendRedirect("List.jsp");
		
		
		
	
	}
	
}






