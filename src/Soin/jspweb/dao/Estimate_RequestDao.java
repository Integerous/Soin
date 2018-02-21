package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Estimate_Request;
import Soin.jspweb.entity.Estimate_RequestView;

public interface Estimate_RequestDao {

	
	public int insert(Estimate_RequestDao estimate_request);
	public int update(Estimate_RequestDao estimate_request);
	public int delete(String id);
	
	public List<Estimate_RequestDao> getList();
	public Estimate_RequestView get(String id);
	
	
	
	
///////////////////////////////////////////	
	//public List<Estimate_RequestDao> getList(String query);
	//public List<Estimate_RequestDao> getList(int step);
	//public List<Estimate_RequestDao> getList(int step, String query);

	
	//견적의뢰서 가져오기
	Estimate_RequestDao getEstimate_RequestDao(String id);
	
	// 이전,다음 버튼으로 
	Estimate_RequestDao getPrev(String id);
	Estimate_RequestDao getNext(String id);
	
}
