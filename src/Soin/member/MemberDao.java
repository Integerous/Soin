package Soin.member;

public interface MemberDao
{
	//로그인
	Member get(String inputId, String inputPassword);
	
	//회원가입
	int insert(Member member);
	
	//회원갱신
	int update(Member member);
	
	//회원탈퇴
	int delete(String id);
}
