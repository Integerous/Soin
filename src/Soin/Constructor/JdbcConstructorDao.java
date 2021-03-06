package Soin.Constructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JdbcConstructorDao implements ConstructorDao{
	
	//시공업자 정보 입력
	@Override
	public int insert(Constructor constructor) {
		String sql ="INSERT INTO constructor ("+ 
				"member_id, " + 
				"name, " + 
				"corporate_registration_number, " + 
				"ceo_name, " + 
				"main_image, " + 
				"homepage_address, " + 
				"introduction, " + 
				"speciality01, " + 
				"speciality02, " + 
				"speciality03, " + 
				"speciality04" + 
				") VALUES (" + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?, " + 
				"?" + 
				")";
		
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, constructor.getMember_id());
			st.setString(2, constructor.getName());
			st.setString(3, constructor.getCorporateRegistrationNumber());
			st.setString(4, constructor.getCeoName());
			st.setString(5, constructor.getMainImage());
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

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	
	//시공업자 정보 갱신
	@Override
	public int update(Constructor constructor) {
		String sql = "UPDATE CONSTRUCTOR SET" + 
				"member_id = ?," +
				"NAME =?," + 
				"CORPORATE_REGISTRATION_NUMBER =?," + 
				"CEO_NAME =?," + 
				"MAIN_IMAGE =?," + 
				"HOMEPAGE_ADDERSS =?," + 
				"INTRODUCTION =?," + 
				"GPA =?," + 
				"SPECIALITY01 =?," + 
				"SPECIALITY02 =?," + 
				"SPECIALITY03 =?," + 
				"SPECIALITY04 =?";
														
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
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

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	//시공업자 정보 삭제
	@Override
	public int delete(String id) {
		String sql ="DELETE CONSTRUCTOR WHERE MEMBER_ID=?";

		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			
			result = st.executeUpdate();
			
			st.close();
			con.close();			
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}


/*	@Override
	public List<ConstructorView> getList() {

		String sql = "SELECT * FROM CONSTRUCTOR_VIEW ORDER BY NAME";

		List<ConstructorView> list = new ArrayList<>();
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			
			ConstructorView constructor = null;

			while (rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getInt("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04"),
						rs.getString("ROLE"),
						rs.getString("ADDRESS")
					);

				list.add(constructor);
			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}*/

	
	/*---------------------------------------------------------------------*/
	
	
	@Override
	public List<ConstructorView> getList(String query) {
		Scanner scan = new Scanner(System.in);
		String temp = scan.next();
		
		String sql = "SELECT * FROM CONSTRUCTOR_VIEW WHERE MEMBER_ID LIKE'%"+temp+"%'";
		List<ConstructorView> list = new ArrayList<>();
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			
			ConstructorView constructor = null;

			while (rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getFloat("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04"),
						rs.getString("ROLE"),
						rs.getString("ADDRESS")
					);

				list.add(constructor);
			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	
	
	@Override
	public List<ConstructorView> getList(int page) {
		String sql = "SELECT * FROM CONSTRUCTOR_VIEW WHERE NUM BETWEEN ? AND ? ORDER BY NAME";
		int start = 1+(page-1)*16;
	      int end = page*16;
		
		List<ConstructorView> list = new ArrayList<>();
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, start);
			st.setInt(2, end);
			//Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery();
			
			
			
			
			ConstructorView constructor = null;

			while(rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getFloat("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04"),
						rs.getString("ROLE"),
						rs.getString("ADDRESS")
					);

				list.add(constructor);
			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<ConstructorView> getList(int page,String query) {
		String sql = "SELECT * FROM CONSTRUCTOR_VIEW ORDER BY MEMBER_ID";

		List<ConstructorView> list = new ArrayList<>();
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			
			ConstructorView constructor = null;

			while (rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getFloat("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04"),
						rs.getString("ROLE"),
						rs.getString("ADDRESS")
					);

				list.add(constructor);
			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*---------------------------------추가분----------------------------------*/
	
	//시공업자정보 가져오기
	@Override
	public ConstructorView get(String id) {

		String sql = "SELECT * FROM CONSTRUCTOR_VIEW WHERE MEMBER_ID=?";

		ConstructorView constructor = null;

		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			
			
			if (rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getFloat("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04"),
						rs.getString("ROLE"),
						rs.getString("ADDRESS")
						
					);

			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return constructor;
	}


	@Override
	public int getCount() {
		String sql = "SELECT count(MEMBER_ID) count FROM CONSTRUCTOR_VIEW";
		
		int count = 0;

		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			
			
			if (rs.next()) {
						count = rs.getInt("count");
			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}


	@Override
	public List<ConstructorView> getList1(int page) {
		String sql = "SELECT * FROM CONSTRUCTOR_VIEW WHERE NUM BETWEEN ? AND ? ORDER BY GPA DESC";
		int start = 1+(page-1)*16;
	      int end = page*16;
		List<ConstructorView> list1 = new ArrayList<>();
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, start);
			st.setInt(2, end);
			//tatement st = con.createStatement();
			
			ResultSet rs = st.executeQuery();

			ConstructorView constructor = null;

			while(rs.next()) {
				constructor = new ConstructorView(
						rs.getString("MEMBER_ID"),
						rs.getString("NAME"),
						rs.getString("CORPORATE_REGISTRATION_NUMBER"),
						rs.getString("CEO_NAME"),
						rs.getString("MAIN_IMAGE"),
						rs.getString("HOMEPAGE_ADDRESS"),
						rs.getString("INTRODUCTION"),
						rs.getFloat("GPA"),
						rs.getString("SPECIALITY01"),
						rs.getString("SPECIALITY02"),
						rs.getString("SPECIALITY03"),
						rs.getString("SPECIALITY04"),
						rs.getString("ROLE"),
						rs.getString("ADDRESS")
					);

				list1.add(constructor);
			}

			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list1;
	}
	
}
