package Soin.jspweb.entity;

public class Member 
{	
	//회원 공통
	private String id;
	private String password;
	private String email;
	private String phoneNum;
	private String address;
	private String role;
	
	//개인 회원이 가져야 할 것
	private String nickName;
	private int picked;
	
	//기업 회원이 가져야할 것
	private String name; 
	private String registrationNumber;
	private String speciality;
	private String ceoName;
	private String homepageAdress;
	private String introduction;
	private float gpa;
	
	//관리자 회원이 가져야할 것
	private String adminName;
	
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

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}
	
	
	public String getNickName() 
	{
		return nickName;
	}
	
	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}
	
	public int getPicked() 
	{
		return picked;
	}
	
	public void setPicked(int picked) 
	{
		this.picked = picked;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) 
	{
		this.registrationNumber = registrationNumber;
	}
	
	public String getSpeciality() 
	{
		return speciality;
	}
	
	public void setSpeciality(String speciality) 
	{
		this.speciality = speciality;
	}
	
	public String getCeoName() 
	{
		return ceoName;
	}
	
	public void setCeoName(String ceoName) 
	{
		this.ceoName = ceoName;
	}

	
	public String getHomepageAdress() 
	{
		return homepageAdress;
	}
	
	public void setHomepageAdress(String homepageAdress) 
	{
		this.homepageAdress = homepageAdress;
	}
	
	public String getIntroduction() 
	{
		return introduction;
	}
	
	public void setIntroduction(String introduction) 
	{
		this.introduction = introduction;
	}
	
	public float getGpa() 
	{
		return gpa;
	}
	
	public void setGpa(float gpa)
	{
		this.gpa = gpa;
	}


	public String getAdminName() 
	{
		return adminName;
	}

	public void setAdminName(String adminName)
	{
		this.adminName = adminName;
	}
	
	//개인회원
	public Member(String id, String password, String email, String phoneNum, String address, String role, String nickName, int picked) 
	{
		this.id = id;
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.role = role;
		this.nickName = nickName;
		this.picked = picked;
	}
	//기업회원
	public Member(String id, String password, String email, String phoneNum, String address, String role, 
							String name, String registrationNumber, String speciality, String ceoName,
							String homepageAdress, String introduction, float gpa)
	{
	
		this.id = id;
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.role = role;
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.speciality = speciality;
		this.ceoName = ceoName;
		this.homepageAdress = homepageAdress;
		this.introduction = introduction;
		this.gpa = gpa;
	}
	
	//관리자회원
	public Member(String id, String password, String email, String phoneNum, String address, String role, String name, String adminName) 
	{
		this.id = id;
		this.password = password;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.role = role;
		this.adminName = adminName;
	}
	

}
