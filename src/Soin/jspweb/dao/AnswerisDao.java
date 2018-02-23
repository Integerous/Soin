package Soin.jspweb.dao;

import java.util.List;

import Soin.portfolio.Portfolio;

public interface AnswerisDao {

	public int insert(Portfolio portfolio);
	public int update(Portfolio portfolio);
	public int delete(String id);
	
	public List<PortfolioView> getList();
	public PortfolioView get(String id);
	
}
