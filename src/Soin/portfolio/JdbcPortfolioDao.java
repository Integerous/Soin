package Soin.portfolio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JdbcPortfolioDao implements PortfolioDao {

	@Override
	public int insert(Portfolio portfolio) {
		
		String sql = "INSERT INTO PORTFOLIO(" + 
				"    id," + 
				"    location," + 
				"    content," + 
				"    period," + 
				"    member_id," + 
				"    product_id," + 
				"    construction_type_id," + 
				"    building_type_id," + 
				"    construction_position_id)" + 
				" VALUES (" +"(SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM ANSWERIS)"+",?,?,?,?,?,?,?,?)";
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			
			Connection con = DriverManager.getConnection(url,"c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			//ResultSet rs = st.executeQuery(sql);//실행해서 결과넣기.
			
			st.setString(1, portfolio.getLocation());
			st.setString(2, portfolio.getcontent());
			st.setString(3, portfolio.getPeriod());
			st.setString(4, portfolio.getMemberId());
			st.setString(5, portfolio.getProductId());
			st.setString(6, portfolio.getConstructionTypeId());
			st.setString(7, portfolio.getBuildingTypeId());
			st.setString(8, portfolio.getConstructionPositionId());
			
			result = st.executeUpdate();
			
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

		
	@Override
	public int update(Portfolio portfolio) {
		
		String sql = "UPDATE portfolio" + 
				"    SET" + 
				"    " + 
				"    location =?" + 
				"    AND   content =?" + 
				"    AND   period =?" + 
				"    AND   hit =?" + 
				"    AND   LIKE =?" + 
				"    AND   member_id =?" + 
				"    AND   product_id =?" + 
				"    AND   construction_type_id =?" + 
				"    AND   building_type_id =?" + 
				"    AND   construction_position_id =?";
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			//ResultSet rs = st.executeQuery(sql);
			
			
			st.setString(1, portfolio.getLocation());
			st.setString(2, portfolio.getcontent());
			st.setString(3, portfolio.getPeriod());
			st.setInt(4, portfolio.getHit());
			st.setInt(5, portfolio.getLike());
			st.setString(6, portfolio.getMemberId());
			st.setString(7, portfolio.getProductId());
			st.setString(8, portfolio.getConstructionTypeId());
			st.setString(9, portfolio.getBuildingTypeId());
			st.setString(10, portfolio.getConstructionPositionId());
		
			
			result = st.executeUpdate();//실행결과에 대해 몇개됐다고 하는거.

			//rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String id) {
		String sql = "delete PORTFOLIO WHERE ID=?";

		int result = 0;
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			//ResultSet rs = st.executeQuery(sql);
			st.setString(1, id);
		
			result = st.executeUpdate();//실행결과에 대해 몇개됐다고 하는거.

			//rs.close();
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

	@Override
	public List<PortfolioView> getList() {
		String sql = "SELECT * FROM PORTFOLIO_VIEW ORDER BY REG_DATE DESC";

		
		List<PortfolioView> list = new ArrayList<>();
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			PreparedStatement st = con.prepareStatement(sql);//아이디에 물음표라서 prepare
			//st.setString(1,id);
			
			ResultSet rs = st.executeQuery();//결과집합을 가져올수있는 공간.

			PortfolioView portfolio = null;//자료형을 맞춰주기.
			
			while(rs.next()) {//결과집합을 가져오는 메서드.
				portfolio = new PortfolioView(//반복할때마다 새로 객체가 만들어짐.
						rs.getString("ID"),
						rs.getString("LOCATION"),
						rs.getString("CONTENT"),
						rs.getString("PERIOD"),
						rs.getInt("HIT"),
						rs.getInt("LIKE"),
						rs.getString("MEMBER_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_TYPE_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID")
						);
			list.add(portfolio);//담고보내야한다.!!
			
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

	PortfolioView portfolio = null;
	@Override
	public PortfolioView get(String id) {
		String sql = "SELECT * FROM PORTFOLIO_VIEW WHERE ID=?";

		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);//아이디에 물음표라서 prepare
			st.setString(1,id);
			
			ResultSet rs = st.executeQuery();//결과집합을 가져올수있는 공간.
  
			
			if(rs.next()) {//결과집합을 가져오는 메서드.
				portfolio = new PortfolioView(//반복할때마다 새로 객체가 만들어짐.
						rs.getString("ID"),
						rs.getString("LOCATION"),
						rs.getString("CONTENT"),
						rs.getString("PERIOD"),
						rs.getInt("HIT"),
						rs.getInt("LIKE"),
						rs.getString("MEMBER_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_TYPE_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID")
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
		return portfolio;
	}

}
