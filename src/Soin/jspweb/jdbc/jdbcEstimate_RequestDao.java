package Soin.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.newlecture.jspprj.entity.AnswerisView;

import Soin.jspweb.dao.Estimate_RequestDao;
import Soin.jspweb.entity.Estimate_Request;
import Soin.jspweb.entity.Estimate_RequestView;

public class jdbcEstimate_RequestDao implements Estimate_RequestDao {

	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public int insert(Estimate_RequestDao estimate_request) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public int update(Estimate_RequestDao estimate_request) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public List<Estimate_RequestDao> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
//////////////////////////////////////////////////////////////////
	@Override
	public Estimate_RequestView get(String id) {
		
		String sql = "SELECT * FROM ESTIMATE_REQUEST WHERE ID=?"; //이걸 하기위해 밑에있는것들을 한다.
		
		Estimate_Request estimate_request = null; //반환할 내용이므로 변수선언을 try 위에서 함 // 왜 NULL을 줬지?

		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//연결 생성하기
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			//문장 실행하기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			
			//사용하기
			ResultSet rs = st.executeQuery();
			
			
			if(rs.next()){
				estimate_request = new Estimate_RequestView(
							rs.getString("ID"),
							rs.getString("TITLE"),
							rs.getString("ADDRESS"),
							rs.getString("DESIRED_DATE01"),
							rs.getString("DESIRED_DATE02"),
							rs.getString("ETC_REQUEST"),
							rs.getDate("REGDATE"),
							rs.getString("MEMBER_ID"),
							rs.getString("PRODUCT_ID"),
							rs.getString("CONSTRUCTION_ID"),
							rs.getString("BUILDING_TYPE_ID"),
							rs.getString("CONSTRUCTION_POSITION_ID")
						);		
			}
		
			//출력
			//System.out.printf("name : %s, id : %s\n", name, id);
		
			
			//닫아 주기
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
		return answeris;
	}

	@Override
	public Estimate_RequestDao getEstimate_RequestDao(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estimate_RequestDao getPrev(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estimate_RequestDao getNext(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
