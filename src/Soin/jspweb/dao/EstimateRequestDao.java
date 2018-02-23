package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.EstimateRequest;
import Soin.jspweb.entity.EstimateRequestView;

public interface EstimateRequestDao {

	
	public int insert(EstimateRequest estimateRequest);
	public int update(EstimateRequest estimateRequest);
	public int delete(String id);
	
	public List<EstimateRequestView> getList();
	public EstimateRequestView get(String id);
	
	
	
	
///////////////////////////////////////////	
	//public List<Estimate_RequestDao> getList(String query);
	//public List<Estimate_RequestDao> getList(int step);
	//public List<Estimate_RequestDao> getList(int step, String query);

	
	//견적의뢰서 가져오기
	EstimateRequestDao getEstimateRequestDao(String id);
	
	// 이전,다음 버튼으로 
	EstimateRequestDao getPrev(String id);
	EstimateRequestDao getNext(String id);
	
}
