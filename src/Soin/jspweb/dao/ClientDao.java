package Soin.jspweb.dao;

import Soin.jspweb.entity.Client;

public interface ClientDao 
{
	//개인회원 가져오기
	Client get(String id);
	
	//개인회원 정보입력
	int insert(Client client);
	
	//개인회원 정보갱신
	int update(Client client);
	
	//개인회원 정보삭제
	int delete(String id);
	

}
