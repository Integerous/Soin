package Soin.review;

import java.util.List;

public interface ReviewDao {
	
	public int insert(Review review);
	public int update(Review review);
	public int delete(String id);
	
	public ReviewView get(String id);
	public List<ReviewView> getList(int page);
	int getCount();
}
