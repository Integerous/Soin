package Soin.memberRole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcMemberRoleDao implements MemberRoleDao
{

	@Override
	public MemberRole get() 
	{
		
		return null;
	}
	
	
	@Override
	public int insert(MemberRole memberRole) 
	{
		String sql ="INSERT INTO MEMBER_ROLE (MEMBER_ID, ROLE_NAME) "																								
																										 + "VALUES(?, "
																										 + "?)";
		
		int result = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, memberRole.getMemberId());
			st.setString(2, memberRole.getRoleName());
			
			result = st.executeUpdate();
			
			st.close();
			con.close();			
		} 
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(String id) 
	{
	String sql ="DELETE FROM MEMBER_ROLE WHERE MEMBER_ID=?";
		
		int result = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			
			result = st.executeUpdate();
			
			st.close();
			con.close();			
		} 
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
}
