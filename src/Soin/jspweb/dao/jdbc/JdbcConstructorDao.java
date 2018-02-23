package Soin.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Soin.jspweb.dao.ConstructorDao;
import Soin.jspweb.entity.Constructor;
import Soin.jspweb.entity.ConstructorView;

public class JdbcConstructorDao implements ConstructorDao{

	@Override
	public List<Constructor> getList() {

		String sql = "SELECT * FROM ANSWERIS_VIEW WHERE ID=?";

		List<Constructor> list = new ArrayList<>();
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url,"c##sist", "dclass");
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


}
	
