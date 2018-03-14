package Soin.controller.estimate.EstimateRequestForm;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

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

public class Form1Controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	String id = request.getParameter("id");

		EstimateRequestDao estimateRequestDao = new JdbcEstimateRequestDao();
		EstimateRequestView estimateRequest = estimateRequestDao.get(id);
		
		
		request.setAttribute("estimateRequest", estimateRequest);*/
		
		
		
		/*RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/Estimate/EstimateRequestForm/Form1.jsp");
		dispatcher.forward(request, response);*/
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		if(request.getSession().getAttribute("id") == null)
		{
			out.println("<script>location.href='../../Member/Common/login?returnUrl=../../estimate/EstimateRequestForm/Form1'; alert('로그인이 필요한 서비스입니다.');</script>");
		}
		else if(!request.getSession().getAttribute("role").equals("CLIENT"))
		{
			out.println("<script>history.back(); alert('개인 회원만 이용 가능합니다.');</script>");
		}
		else
		{
			ApplicationContext applicationContext = ServletUtil
		            .getApplicationContext(request.getSession().getServletContext());
		      TilesContainer container = TilesAccess.getContainer(applicationContext);
		      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		      container.render("Estimate.EstimateRequestForm.Form1", servletRequest);
		}     
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//String id = request.getParameter("id");
		
		String add01 = request.getParameter("add01");
		String add02 = request.getParameter("add02");
		
		String address = add01+" "+ add02;
		
		EstimateRequest estimateRequest = new EstimateRequest();
		
		//1. 시공종류 선택
		estimateRequest.setConstructionPositionId(request.getParameter("construction-position"));
		//2. 상세카테고리 선택
		estimateRequest.setDetailCategory(request.getParameter("detail-category"));
		//3. 건물 종류 선택
		estimateRequest.setBuildingTypeId(request.getParameter("building-type"));
		// 4.지역 선택
		estimateRequest.setAddress(address);
		// 5.희망시공일 선택 / DATE로 형변환
		String datePickerStr = request.getParameter("desired-date01");  
	    Date datePicker = java.sql.Date.valueOf(datePickerStr);
	       estimateRequest.setDesiredDate01(datePicker);
		// 6.기타 요청사항
		estimateRequest.setEtcRequest(request.getParameter("etc-request"));
		
		EstimateRequestDao estimateRequestDao = new JdbcEstimateRequestDao();
		estimateRequestDao.insert(estimateRequest);
		//String id = estimateRequestDao.getLatest();
		response.sendRedirect("Form4");
		
		
	}
}






