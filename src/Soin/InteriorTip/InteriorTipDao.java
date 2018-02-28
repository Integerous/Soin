package Soin.InteriorTip;

import java.util.List;

public interface InteriorTipDao {

		int insert(InteriorTip interiorTip);
		int update(InteriorTip interiorTip);
		int delete(String id);
		
		List<InteriorTipView> getList();
		InteriorTipView get(String id);
}
