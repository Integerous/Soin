package Soin.controller.estimate.EstimateRequestList;

import java.io.IOException;
import java.util.List;

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


import Soin.EstimateRequest.EstimateRequestDao;
import Soin.EstimateRequest.EstimateRequestView;
import Soin.EstimateRequest.JdbcEstimateRequestDao;

@WebServlet("/Estimate/EstimateRequestList/List")

public class ListController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page = 1;
		int lastPage = 1;
		
		String page_ = request.getParameter("p");
		if(page_ != null && !page_.equals(""))
				page = Integer.parseInt(page_);
				
		int off = (page-1) % 5;
		int startNum = page - off;
		
		EstimateRequestDao EstimateRequestDao = new JdbcEstimateRequestDao();
		List<EstimateRequestView> list = EstimateRequestDao.getList(page);
		
		int count = EstimateRequestDao.getCount();
		if(count != 0)
			lastPage = count / 15;

		if(count % 15 > 0)
			lastPage++;
		
		
		//setAttribute("키값", 변수)
		//request에 내용 보내기 위해 준비 -> 서블릿에서 서블릿으로 이동할 때 request에 내용저장한다
		request.setAttribute("list", list);
		//count는 왜?
		request.setAttribute("count", count);
		//lastPage 보내기
		request.setAttribute("lastPage", lastPage);
		
		request.setAttribute("startNum", startNum);
		
		/*//detail.jsp로 보내기 위한 준비 -> dispatcher
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/WEB-INF/views/student/community/answeris/list.jsp");
		
		//dispatch를 통해서 forward한다. request엔 answeris set 되어있음
		dispatcher.forward(request, response);*/
		
		//tile을 담고있는 container
		/*TilesContainer container = TilesAccess.getContainer(
	              request.getSession().getServletContext());
	      container.render("student.community.answeris.list", request, response);
	      container.endContext(request, response);*/
		
		 ApplicationContext applicationContext = ServletUtil
		            .getApplicationContext(request.getSession().getServletContext());
		      TilesContainer container = TilesAccess.getContainer(applicationContext);
		      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
		      container.render("Estimate.EstimateRequestList.List", servletRequest);
		
		
		
	
	}
	
}






