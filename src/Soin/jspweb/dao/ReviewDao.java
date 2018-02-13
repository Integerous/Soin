package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Review;


public interface ReviewDao {
	List<Review> getList();	
	List<Review> getList(String query);	
	List<Review> getList(int page);	
	List<Review> getList(int page, String field, String query);
		
	Review get(String id);
	Review getPrev(String id);
	Review getNext(String id);
	
}
