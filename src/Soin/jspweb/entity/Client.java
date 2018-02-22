package Soin.jspweb.entity;

public class Client 
{
	private int picked;
	private String nickName;
	private int selectCheck;
	
	public int getPicked() 
	{
		return picked;
	}
	
	public void setPicked(int picked) 
	{
		this.picked = picked;
	}
	
	public String getNickName() 
	{
		return nickName;
	}

	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}

	public int getSelectCheck() 
	{
		return selectCheck;
	}

	public void setSelectCheck(int selectCheck)
	{
		this.selectCheck = selectCheck;
	}

	public Client()
	{
		
	}
	
	public Client(String nickName, int picked, int selectCheck) 
	{
		this.nickName = nickName;
		this.picked = picked;
		this.selectCheck = selectCheck;
	}
}
