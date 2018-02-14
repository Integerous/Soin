package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.InteriorTip;

public interface InteriorTipDao {
	
	List<InteriorTip> getList();
	List<InteriorTip> getList(int page);
	List<InteriorTip> getList(String query);
	List<InteriorTip> getList(int page, String query, String Category, String Material);
	
	InteriorTip get(String id);
}