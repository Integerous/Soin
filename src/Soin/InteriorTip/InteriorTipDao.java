package Soin.InteriorTip;

import java.util.List;

public interface InteriorTipDao {

		public int insert(InteriorTip interiorTip);
		public int update(InteriorTip interiorTip);
		public int delete(String id);
		
		public List<InteriorTipView> getList();
		public InteriorTipView get(String id);
}
