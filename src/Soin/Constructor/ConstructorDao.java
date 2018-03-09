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
	
	
	List<ConstructorView> getList();
	List<ConstructorView> getList(String query);
	List<ConstructorView> getList(int page);
	List<ConstructorView> getList(int page,String query);

	//시공업체회원 가져오기
	public ConstructorView get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	int getCount();
	
	/*Constructor getDistance();
	Constructor getGrade();
	Constructor getDefault();*/
}
