package Soin.member;

import Soin.client.Client;

public class MemberView
{
	private Member member;
	private Client client;

	public Member getMember() 
	{
		return member;
	}

	public void setMember(Member member)
	{
		this.member = member;
	}

	public Client getClient() 
	{
		return client;
	}

	public void setClient(Client client) 
	{
		this.client = client;
	}
}