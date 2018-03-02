package Soin.memberRole;

public class MemberRole 
{
	private String memberId;
	private String roleName;
	
	public String getMemberId()
	{
		return memberId;
	}
	public void setMemberId(String memberId) 
	{
		this.memberId = memberId;
	}
	public String getRoleName() 
	{
		return roleName;
	}
	public void setRoleName(String roleName) 
	{
		this.roleName = roleName;
	}
	
	public MemberRole(String memberId, String roleName) 
	{
		this.memberId = memberId;
		this.roleName = roleName;
	}
	
	public MemberRole() 
	{
	
	}
	
	
	
}
