package Soin.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newlecture.jspprj.entity.AnswerisView;

import Soin.jspweb.dao.ConstructorDao;
import Soin.jspweb.entity.Constructor;
import Soin.jspweb.entity.ConstructorView;

public class JdbcConstructorDao implements ConstructorDao{

	@Override
	public List<Constructor> getList() {

		String sql = "SELECT * FROM ANSWERIS_VIEW WHERE ID=?";

		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##sist", "dclass");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			List<ConstructorView> list = new ArrayList();
			
			ConstructorView constructor = null;

			if (rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("ADDRESS"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getInt("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04")
					);

				list.add(constructor);
			}

			rs.close();
			st.close();
			con.close();

			return list;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Constructor> getList(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Constructor> getList(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Constructor> getList(int page, String filed, String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Constructor get() {
		// TODO Auto-generated method stub
		return null;
	}

	/*---------------------------------추가분----------------------------------*/
	
	//시공업자정보 가져오기
	@Override
	public Constructor get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//시공업자 정보 입력
	@Override
	public int insert(Constructor constructor) 
	{
			String sql ="INSERT INTO CONSTRUCTOR (MEMBER_ID, "
																			+ "NAME, " 
																			+ "CORPORATE_REGISTRATION_NUMBER, "
																			+ "CEO_NAME, " 
																			+ "MAIN_IMAGE, " 
																			+ 	"HOMEPAGE_ADDRESS, " 
																			+ "INTRODUCTION, "
																			+ 	"SPECIALITY01, "
																			+ 	"SPECIALITY02, "
																			+ 	"SPECIALITY03, "
																			+ 	"SPECIALITY04) "
																										+ "VALUES (?, "
																														+ "?, "
																														+ "?, "
																														+ "?, "
																														+ "?, "
																														+ "?, "
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
			st.setString(1, constructor.getMember_id());
			st.setString(2, constructor.getName());
			st.setString(3, constructor.getCorporateRegistrationNumber());
			st.setString(4, constructor.getMainImage());
			st.setString(6, constructor.getHomepageAddress());
			st.setString(7, constructor.getIntroduction());
			st.setString(8, constructor.getSpeciality1());
			st.setString(9, constructor.getSpeciality2());
			st.setString(10, constructor.getSpeciality3());
			st.setString(11, constructor.getSpeciality4());

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
	
	//시공업자 정보 갱신
	@Override
	public int update(Constructor constructor)
	{
		String sql ="UPDATE CONSTRUCTOR SET "
																	+"NAME=?, "
																	+"CEO_NAME=?, "
																	+"MAIN_IMAGE=?, "
																	+"HOMEPAGE_ADDRESS=?, "
																	+"INTRODUCTION=?, "
																	+"SPECIALITY01=?, "
																	+"SPECIALITY02=?, "
																	+"SPECIALITY03=?, "
																	+"SPECIALITY04=? "
																	+"WHERE MEMBER_ID=?";
														
		int result = 0;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##Soin_DB", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, constructor.getName());
			st.setString(2, constructor.getCeoName());
			st.setString(3, constructor.getMainImage());
			st.setString(4, constructor.getHomepageAddress());
			st.setString(5, constructor.getIntroduction());
			st.setString(6, constructor.getSpeciality1());
			st.setString(7, constructor.getSpeciality2());
			st.setString(8, constructor.getSpeciality3());
			st.setString(9, constructor.getSpeciality4());
			st.setString(9, constructor.getMember_id());
			
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


	//시공업자 정보 삭제
	@Override
	public int delete(String id) 
	{
		String sql ="DELETE FROM CONSTRUCTOR WHERE MEMBER_ID=?";
		
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
	
