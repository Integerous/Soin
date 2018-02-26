package Soin.admin;

public class Admin 
{
	private String adminName;
	private String member_id;

	public String getAdminName() 
	{
		return adminName;
	}

	public void setAdminName(String adminName) 
	{
		this.adminName = adminName;
	}

	public String getMember_id() 
	{
		return member_id;
	}

	public void setMember_id(String member_id) 
	{
		this.member_id = member_id;
	}

	public Admin(String adminName, String member_id) 
	{
		this.adminName = adminName;
		this.member_id = member_id;
	}
	
	
	
}
