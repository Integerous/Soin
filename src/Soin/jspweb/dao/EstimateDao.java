package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Estimate;

public interface EstimateDao {

	
	public List<Estimate> getList();
	public List<Estimate> getList(String query);
	public List<Estimate> getList(int step);
	public List<Estimate> getList(int step, String query);

	
	
	//견적의뢰서 가져오기
	Estimate getEstimate(String id);
	
	// 이전,다음 버튼으로 
	Estimate getPrev(String id);
	Estimate getNext(String id);
	
}
