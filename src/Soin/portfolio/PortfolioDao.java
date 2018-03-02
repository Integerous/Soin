package Soin.portfolio;

import java.util.List;

public interface PortfolioDao {

	public int insert(Portfolio portfolio);
	public int update(Portfolio portfolio);
	public int delete(String id);
	
	/*public List<PortfolioView> getList();*/
	
	
	List<PortfolioView> getList(int page);
	PortfolioView get(String id);
	
	int getCount();
	/*public PortfolioView getPrev(String id);//이전글
	public PortfolioView getNext(String id);//다음글
*/
	}
