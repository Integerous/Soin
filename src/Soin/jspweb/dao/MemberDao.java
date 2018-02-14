package Soin.jspweb.dao;

import Soin.jspweb.entity.Member;

public interface MemberDao
{
	//멤버반환
	Member get(String inputId, String inputPassword);
	
	//회원가입 - 일반회원 가입페이지
	void set(String id, String password, String email, String phoneNum, String address, String role, String nickName, int picked);
	
	//회원가입 - 기업회원 가입페이지
	void set(String id, String password,  String email, String phoneNum, String address, String role, 
			String name, String registrationNumber, String speciality, String ceoName, String homepageAdress, String introduction, float gpa);
}
