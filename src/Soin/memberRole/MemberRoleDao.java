package Soin.memberRole;

public interface MemberRoleDao
{
	MemberRole get();
		
	int insert(MemberRole memberRole);
	
	int delete(String id);
	
}
