package Soin.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import Soin.jspweb.dao.Estimate_RequestDao;
import Soin.jspweb.entity.Estimate_RequestView;

public class jdbcEstimate_RequestDao implements Estimate_RequestDao {

	@Override
	public int insert(Estimate_RequestDao estimate_request) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Estimate_RequestDao estimate_request) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Estimate_RequestDao> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estimate_RequestView get(String id) {
		

		String sql = "SELECT * FROM MEMBER WHERE PWD='122'"; //이걸 하기위해 밑에있는것들을 한다.
		
		
		//드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//연결 생성하기
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//문장 실행하기
		Statement st = con.createStatement();
		
		//사용하기
		ResultSet rs = st.executeQuery(sql);
		
		if(!con.isClosed())
		System.out.println("connected");
		
		
		String name;
		String id;
		
		
		//가져오기
		while(rs.next()) {
		id = rs.getString("MID");
		name = rs.getString("NAME");

		//출력
		System.out.printf("name : %s, id : %s\n", name, id);
		}
		
		
		
		//닫아 주기
		rs.close();
		st.close();
		con.close();
		
		return null;
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
