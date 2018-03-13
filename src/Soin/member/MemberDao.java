package Soin.member;

public interface MemberDao
{
	//정보조회
	MemberView get(String id);
	
	//로그인
	Member get(String inputId, String inputPassword);
	
	//아이디찾기
	String findId(String email, String phoneNum);
	
	//비밀번호 변경 인증
	Boolean checkPassword(String id, String phoneNum);
	
	//비밀번호 변경
	int updatePassword(String password, String id);
	
	//회원가입
	int insert(Member member);
	
	//회원갱신
	int update(Member member);
	
	//회원탈퇴
	int delete(String id);
		
	//아이디 중복체크
	Boolean getId(String ckid);
	
	//닉네임or업체명 중복체크
	Boolean getName(String name);
		
}
