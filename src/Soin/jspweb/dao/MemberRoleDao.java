package Soin.jspweb.dao;

import Soin.jspweb.entity.MemberRole;

public interface MemberRoleDao
{
	MemberRole get();
		
	int insert(MemberRole memberRole);
	
	int delete(String id);
	
}
