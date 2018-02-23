package Soin.InteriorTip;

import java.util.List;

public interface InteriorTipDao {
	
	List<InteriorTip> getList();
	List<InteriorTip> getList(int page);
	List<InteriorTip> getList(String query);
	List<InteriorTip> getList(int page, String query, String Category, String Material);
	
	InteriorTip get(String id);
}