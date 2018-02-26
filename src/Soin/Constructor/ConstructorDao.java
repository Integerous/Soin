package Soin.Constructor;

import java.util.List;


public interface ConstructorDao 
{

	//시공업체회원 정보입력
	int insert(Constructor constructor);
	
	//시공업체회원 정보갱신
	int update(Constructor constructor);
	
	//시공업체회원 정보삭제
	int delete(String id);
	
	
	List<Constructor> getList();
	List<Constructor> getList(String query);
	List<Constructor> getList(int page);
	List<Constructor> getList(int page,String query);

	//시공업체회원 가져오기
	Constructor get(String id);

	
	/*Constructor getDistance();
	Constructor getGrade();
	Constructor getDefault();*/
}
