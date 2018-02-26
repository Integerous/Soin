package Soin.client;

public class Client 
{
	private String memberId;
	private int picked;
	private String nickName;
	private int selectCheck; //선택약관동의여부
	
	public String getMemberId()
	{
		return memberId;
	}

	public void setMemberId(String memberId)
	{
		this.memberId = memberId;
	}

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

	//수정
	public Client(String nickName, int selectCheck)
	{
		this.nickName = nickName;
		this.selectCheck = selectCheck;
	}
	
	//가입
	public Client(String memberId, String nickName, int picked, int selectCheck) 
	{
		this.memberId = memberId;
		this.nickName = nickName;
		this.picked = picked;
		this.selectCheck = selectCheck;
	}
}
