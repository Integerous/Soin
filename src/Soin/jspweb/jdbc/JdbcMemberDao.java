package Soin.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Soin.jspweb.dao.MemberDao;
import Soin.jspweb.entity.Member;

public class JdbcMemberDao implements MemberDao
{

	@Override
	public Member get(String inputId, String inputPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Member member)
	{
		String sql ="INSERT INTO MEMBER (ID, PASSWORD, EMAIL, PHONE_NUMBER, ADDRESS, DETAIL_ADDRESS) "
																																							+ "VALUES (?, "
																																										+ "?, "
																																										+ "?, "
																																										+ "?, "
																																										+ "?, "
																																										+ "?)";
																																																									
			int result = 0;
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				
				Connection con = DriverManager.getConnection(url, "c##Soin_DB", "soin1218");
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, member.getId());
				st.setString(2, member.getPassword());
				st.setString(3, member.getEmail());
				st.setString(4, member.getPhoneNum());
				st.setString(5, member.getAddress());
				st.setString(6, member.getDetailAddress());
				
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
	public int update(Member member) 
	{
		String sql ="UPDATE MEMBER SET "
														+ "PASSWORD=?, "
														+ "EMAIL=?, "
														+ "PHONE_NUMBER=?,"
														+ "ADDRESS=?,"
														+ "DETAIL_ADDRESS=?"
														+ "WHERE ID=?";
				
		int result = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##Soin_DB", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, member.getPassword());
			st.setString(2, member.getEmail());
			st.setString(3, member.getPhoneNum());
			st.setString(4, member.getAddress());
			st.setString(5, member.getDetailAddress());
			st.setString(6, member.getId());
	
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
		String sql ="DELETE FROM MEMBER WHERE ID=?";
		
		int result = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

			Connection con = DriverManager.getConnection(url, "c##Soin_DB", "soin1218");
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
