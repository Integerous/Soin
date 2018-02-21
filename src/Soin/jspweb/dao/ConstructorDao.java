package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Constructor;


public interface ConstructorDao {

	List<Constructor> getList();
	List<Constructor> getList(String query);
	List<Constructor> getList(int page);
	List<Constructor> getList(int page, String filed, String query);

	Constructor get();
	
	
	
	/*Constructor getDistance();
	Constructor getGrade();
	Constructor getDefault();*/
}
