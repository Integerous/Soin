package Soin.jspweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Soin.jspweb.entity.Member;

public class JdbcMemberDao implements MemberDao
{

	@Override
	public Member get(String inputId, String inputPassword) 
	{		
			String sql = "SELECT * FROM MEMBER";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "----");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				String id =rs.getString("ID");
				String password = rs.getString("PASSWORD");
				
				if(inputId.equals(id) && inputPassword.equals(password))
				{
					String email = rs.getString("EMAIL");
					String phoneNum = rs.getString("PHONE_NUM");
					String address = rs.getString("ADDRESS");
					String role = rs.getString("ROLE");
					
					switch(role)
					{
						case "CLIENT":
							String nickName = rs.getString("NICKNAME");
							int picked = rs.getInt("PICKED");
							
							Member clnMember = new Member(id, password, email, phoneNum, address, role, nickName, picked);
							
							rs.close();
							st.close();
							con.close();	
							
							return clnMember;	
							
						case "CONSTRUCTOR":
							String name = rs.getString("NAME");
							String registrationNumber = rs.getString("REGISTRATION_NUM");
							String speciality = rs.getString("SPECIALITY");
							String ceoName = rs.getString("CEO_NAME");
							String homepageAdress = rs.getString("HOMEPAGE_ADDRESS");
							String introduction = rs.getString("INTRODUCTION");
							float gpa = rs.getFloat("GPA");
							
							Member conMember 
								= new Member(id, password, email, phoneNum, address, role, name, registrationNumber, speciality, 
																															ceoName, homepageAdress, introduction, gpa);
							
							rs.close();
							st.close();
							con.close();
							return conMember;
								
						case "ADMIN":
							String adminName = rs.getString("NAME");
							
							Member admMember = new Member(id, password, email, phoneNum, address, role, ceoName, adminName);
							
							rs.close();
							st.close();
							con.close();
							return admMember;		
					}
				}
			}
				
			rs.close();
			st.close();
			con.close();		
			return null;
			
	}

	@Override
	public void set(String id, String password, String email, String phoneNum, String address, String role,
			String nickName, int picked) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(String id, String password, String email, String phoneNum, String address, String role, String name,
			String registrationNumber, String speciality, String ceoName, String homepageAdress, String introduction,
			float gpa) {
		// TODO Auto-generated method stub
		
	}
	
	
}
