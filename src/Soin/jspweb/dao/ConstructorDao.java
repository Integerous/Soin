package Soin.jspweb.dao;

import java.util.List;

import Soin.jspweb.entity.Constructor;


public interface ConstructorDao 
{

	//시공업체회원 가져오기
	Constructor get(String id, String password);
	
	//시공업체회원 정보입력
	int insert(Constructor constructor);
	
	//시공업체회원 정보갱신
	int update(Constructor constructor);
	
	//시공업체회원 정보삭제
	int delete(Constructor constuctor);
	
	
	List<Constructor> getList();
	List<Constructor> getList(String query);
	List<Constructor> getList(int page);
	List<Constructor> getList(int page, String filed, String query);

	Constructor get();
	
	
	
	/*Constructor getDistance();
	Constructor getGrade();
	Constructor getDefault();*/
}
