package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Notice;

public interface NoticeDao {
	List<Notice> getList();	
	List<Notice> getList(String query);	
	List<Notice> getList(int page);	
	List<Notice> getList(int page, String field, String query);
		
	Notice get(String id);
	Notice getPrev(String id);
	Notice getNext(String id);
}
