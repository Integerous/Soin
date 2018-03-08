package Soin.EstimateRequest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class JdbcEstimateRequestDao implements EstimateRequestDao {

	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public int insert(EstimateRequest estimateRequest) {
		String sql = "INSERT INTO estimateRequest " + 
				"    title," + 
				"    address," + 
				"    desired_date01," + 
				"    desired_date02," + 
				"    etc_request," + 
				"    regdate," + 
				"    member_id" + 
				"    product_id," + 
				"    construction_id," + 
				"    building_type_id," + 
				"    construction_position_id," + 
				"    id," + 
				") VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			
		int result = 0;

		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//연결 생성하기
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			//문장 실행하기
			PreparedStatement st = con.prepareStatement(sql); //prepared가 무슨의미였지?
			//st.setString(1, id);

			//st.setString(1, answeris.getId());
			st.setString(1, estimateRequest.getTitle()); //위의 물음표에 
			st.setString(2, estimateRequest.getAddress());
			st.setDate(3, (Date) estimateRequest.getDesiredDate01());
			st.setDate(4, (Date) estimateRequest.getDesiredDate02());
			st.setString(5, estimateRequest.getEtcRequest());
			st.setDate(6,  (Date) estimateRequest.getRegDate());
			st.setString(7, estimateRequest.getProductId());
			st.setString(8, estimateRequest.getConstructionId());
			st.setString(9, estimateRequest.getBuildingTypeId());
			st.setString(10, estimateRequest.getConstructionPositionId());
			st.setString(11, estimateRequest.getId());
			
			
			result = st.executeUpdate();
			
		// insert는 결과집합이 없으니까 결과집합을 가져오는 도구는 필요없음
			
			st.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public int update(EstimateRequest estimateRequest) {
		String sql = "UPDATE estimateRequest SET" + 
				"    TITLE =?," + 
				"    ADDRESS =?, " + 
				"    DESIRED_DATE01 =?, " + 
				"    DESIRED_DATE02 =?," + 
				"    ETC_REQUEST =?, " + 
				"    REGDATE =?," + 
				"    PRODUCT_ID =?, " + 
				"    CONSTRUCTION_ID =?, " + 
				"    BUILDING_TYPE_ID =?, " + 
				"    CONSTRUCTION_POSITION_ID=?" + 
				"WHERE ID =?";
		
		int result = 0;

		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//연결 생성하기
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			//문장 실행하기
			PreparedStatement st = con.prepareStatement(sql); //prepared가 무슨의미였지?
			//st.setString(1, id);
			
			st.setString(1, estimateRequest.getTitle()); //위의 물음표에 
			st.setString(2, estimateRequest.getAddress());
			st.setDate(3, (Date) estimateRequest.getDesiredDate01());
			st.setDate(4, (Date) estimateRequest.getDesiredDate02());
			st.setString(5, estimateRequest.getEtcRequest());
			st.setDate(6, (Date) estimateRequest.getRegDate());
			st.setString(7, estimateRequest.getProductId());
			st.setString(8, estimateRequest.getConstructionId());
			st.setString(9, estimateRequest.getBuildingTypeId());
			st.setString(10, estimateRequest.getConstructionPositionId());
			st.setString(11, estimateRequest.getId());
			
			
			
			result = st.executeUpdate();
			
		// insert는 결과집합이 없으니까 결과집합을 가져오는 도구는 필요없음
			
			st.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public int delete(String id) {
String sql = "DELETE estimateRequest WHERE ID=?";
		
		int result = 0;

		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//연결 생성하기
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			//문장 실행하기
			PreparedStatement st = con.prepareStatement(sql); //prepared가 무슨의미였지?
			//st.setString(1, id);
			
			st.setString(1, id);
			
			result = st.executeUpdate();
			
		// insert는 결과집합이 없으니까 결과집합을 가져오는 도구는 필요없음
			
			st.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
//////////////////////////////////////////////////////////////////
	@Override
	public List<EstimateRequestView> getList() {
		
		String sql = "SELECT * FROM estimateRequestVIEW ORDER BY REG_DATE DESC";
		
		List<EstimateRequestView> list = new ArrayList<>(); //반환할 내용이므로 변수선언을 try 위에서 함

		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//연결 생성하기
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			//문장 실행하기
			PreparedStatement st = con.prepareStatement(sql);
			//st.setString(1, id);
			
			//사용하기
			ResultSet rs = st.executeQuery();
			
			EstimateRequestView estimateRequest = null;
			
			while(rs.next()){
				estimateRequest = new EstimateRequestView(
						rs.getString("ID"),
						rs.getString("TITLE"),
						rs.getString("ADDRESS"),
						rs.getDate("DESIRED_DATE01"),
						rs.getDate("DESIRED_DATE02"),
						rs.getString("ETC_REQUEST"),
						rs.getDate("REGDATE"),
						rs.getString("MEMBER_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID")
						);
				
				list.add(estimateRequest);
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
		return list;
	}

	
	
//////////////////////////////////////////////////////////////////
	@Override
	public EstimateRequestView get(String id) {
		
		String sql = "SELECT * FROM estimateRequest WHERE ID=?"; //이걸 하기위해 밑에있는것들을 한다.
		
		EstimateRequestView estimateRequest = null; //반환할 내용이므로 변수선언을 try 위에서 함 // 왜 NULL을 줬지?

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
				estimateRequest = new EstimateRequestView(
							rs.getString("ID"),
							rs.getString("TITLE"),
							rs.getString("ADDRESS"),
							rs.getDate("DESIRED_DATE01"),
							rs.getDate("DESIRED_DATE02"),
							rs.getString("ETC_REQUEST"),
							rs.getDate("REGDATE"),
							rs.getString("MEMBER_ID"),
							rs.getString("PRODUCT_ID"),
							rs.getString("CONSTRUCTION_ID"),
							rs.getString("BUILDING_TYPE_ID"),
							rs.getString("CONSTRUCTION_POSITION_ID")
						);		
			}
		
			
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
		return estimateRequest;
	}

	
	
	
	
	
//////////////////////////////////////////////////////////////////////////////	
	@Override
	public EstimateRequestDao getEstimateRequestDao(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstimateRequestDao getPrev(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstimateRequestDao getNext(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
