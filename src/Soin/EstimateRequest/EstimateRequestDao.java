package Soin.EstimateRequest;

import java.util.List;


public interface EstimateRequestDao {

	
	int insert(EstimateRequest estimateRequest);
	int update(EstimateRequest estimateRequest);
	int delete(String id);
	
	public List<EstimateRequestView> getList(int page);
	public EstimateRequestView get(String id);
	
	int getCount();
	
	//String getLatest();
	
	
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
