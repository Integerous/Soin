package Soin.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		String sql ="INSERT INTO MEMBER (ID, PASSWORD, EMAIL, PHONE_NUMBER, ADDRESS, DETAIL_ADDRESS, ROLE) "
																																							+ "VALUES (?, "
																																										+ "?, "
																																										+ "?, "
																																										+ "?, "
																																										+ "?, "
																																										+ "?,"
																																										+ "?)";
																																																									
			int result = 0;
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				
				Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, member.getId());
				st.setString(2, member.getPassword());
				st.setString(3, member.getEmail());
				st.setString(4, member.getPhoneNum());
				st.setString(5, member.getAddress());
				st.setString(6, member.getDetailAddress());
				st.setString(7, member.getRole());
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
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
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

	@Override
	public Boolean getId(String ckId) 
	{
		
		String sql = "SELECT ID FROM MEMBER WHERE ID=?";
		
		Boolean cki = false;
		
		try
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, ckId);
			ResultSet rs = st.executeQuery();
		
			if(rs.next())
			{
				cki = true;
			}
			
			rs.close();
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
		
		return cki;
	}
		
	@Override
	public Boolean getName(String ckname) 
	{
		String sql = "SELECT NAME FROM MEMBER WHERE NAME=?";
		
		Boolean ckn = false;
		
		try
		{
			String id = null;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, ckname);
			ResultSet rs = st.executeQuery();
		
			if(rs.next())
				ckn = true;
			
			
			
			rs.close();
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
		
		return ckn;
	}
		
	@Override
	public String getId(String email, String phoneNum) {
		
		String sql = "SELECT ID FROM MEMBER WHERE EMAIL=? AND PHONE_NUMBER=?";
		
		String id = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, email);
			st.setString(2, phoneNum);
			ResultSet rs = st.executeQuery();
		
			if(rs.next())
				id = rs.getString("ID");
			
			rs.close();
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
	
		return id;
	}
	
	@Override
	public String getPassword(String id, String phoneNum) 
	{
		String sql = "SELECT PASSWORD FROM MEMBER WHERE ID=? AND PHONE_NUMBER=?";
	
		String password = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, phoneNum);
			ResultSet rs = st.executeQuery();
		
			if(rs.next())
				password = rs.getString("PASSWORD");
			
			rs.close();
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
		
		return password;
	}

}
