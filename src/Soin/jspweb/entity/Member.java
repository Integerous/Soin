package Soin.jspweb.entity;

public class Member 
{	
	private String id;
	private String password;
	private String email;
	private String phoneNum;
	private String address;
	private String detailAddress;
	private String role;
	
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhoneNum() 
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getDetailAddress() 
	{
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress)
	{
		this.detailAddress = detailAddress;
	}

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}
	
	//가입
	public Member(String id, String password, String email, String phoneNum, String address, String detailAddress, String role) 
	{
		this.id = id;
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.detailAddress = detailAddress;
		this.role = role;
	}

	//정보 갱신
	public Member(String password, String email, String phoneNum, String address, String detailAddress) 
	{
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.detailAddress = detailAddress;
	}
}
