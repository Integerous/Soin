package Soin.portfolio;

import java.util.List;

public interface PortfolioDao {

	public int insert(Portfolio portfolio);
	public int update(Portfolio portfolio);
	public int delete(String id);
	
	public List<PortfolioView> getList();
	public PortfolioView get(String id);

}
