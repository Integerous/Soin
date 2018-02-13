package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Portfolio;

public interface PortfolioDao {

	List<Portfolio> getList();
	List<Portfolio> getList(String query);
	List<Portfolio> getList(int page);
	List<Portfolio> getList(int page, String array, String category, String query);

	
	Portfolio get(String id);
	//Portfolio getPrev(String id);
	//Portfolio getNext(String id);
	
	
	//List<Portfolio> getList(String cityCategory, String townCategory);
}
