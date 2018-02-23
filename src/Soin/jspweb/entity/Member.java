package Soin.jspweb.entity;

public class Member 
{	
	private String id;
	private String password;
	private String email;
	private String phoneNum;
	private String address;
	private String detailAddress;
	
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
	
	//가입
	public Member(String id, String password, String email, String phoneNum, String address, String detailAddress) 
	{
		this.id = id;
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.detailAddress = detailAddress;
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
