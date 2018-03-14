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
				"    construction_position_id,"+"title,"+"attached_file,"+"category)" + 
				" VALUES (" +"(SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM PORTFOLIO)"+",?,?,?,?,?,?,?,?,?,?,?)";
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			
			
			Connection con = DriverManager.getConnection(url,"c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			//ResultSet rs = st.executeQuery(sql);//실행해서 결과넣기.
			
			st.setString(1, portfolio.getLocation());
			st.setString(2, portfolio.getContent());
			st.setString(3, portfolio.getPeriod());
			st.setString(4, portfolio.getMemberId());
			st.setString(5, portfolio.getProductId());
			st.setString(6, portfolio.getConstructionTypeId());
			st.setString(7, portfolio.getBuildingTypeId());
			st.setString(8, portfolio.getConstructionPositionId());
			st.setString(9, portfolio.getTitle());
			st.setString(10, portfolio.getAttachedFile());
			st.setString(11, portfolio.getCategory());
			
			
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
				"    content =?" + 
				"    period =?" + 
				"    hit =?" + 
				"    LIKE =?" + 
				"    member_id =?" + 
				"    product_id =?" + 
				"    construction_type_id =?" + 
				"    building_type_id =?" + 
				"    construction_position_id =?" +
				" 	 title =?"+
				"	 attached_file=?"+
				"	 category=?";
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			//ResultSet rs = st.executeQuery(sql);
			
			
			st.setString(1, portfolio.getLocation());
			st.setString(2, portfolio.getContent());
			st.setString(3, portfolio.getPeriod());
			st.setInt(4, portfolio.getHit());
			st.setInt(5, portfolio.getLike());
			st.setString(6, portfolio.getMemberId());
			st.setString(7, portfolio.getProductId());
			st.setString(8, portfolio.getConstructionTypeId());
			st.setString(9, portfolio.getBuildingTypeId());
			st.setString(10, portfolio.getConstructionPositionId());
			st.setString(11, portfolio.getTitle());
			st.setString(12, portfolio.getAttachedFile());
			st.setString(13, portfolio.getCategory());
			
			
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
	public List<PortfolioView> getList(int page) {
		String sql = "SELECT * FROM PORTFOLIO ORDER BY REG_DATE DESC";

		
		List<PortfolioView> list = new ArrayList<>();
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
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
						rs.getString("CONSTRUCTION_POSITION_ID"),
						rs.getString("TITLE"),
						rs.getString("ATTACHED_FILE"),
						rs.getString("CATEGORY")
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
						rs.getString("CONSTRUCTION_POSITION_ID"),
						rs.getString("TITLE"),
						rs.getString("ATTACHED_FILE"),
						rs.getString("CATEGORY")
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


	@Override
	public int getCount() {
		String sql = "SELECT COUNT(ID) COUNT FROM PORTFOLIO ";

		int count = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			Statement st = con.createStatement();//아이디에 물음표라서 prepare
			
			
			ResultSet rs = st.executeQuery(sql);//결과집합을 가져올수있는 공간.
  
			
			if(rs.next()) {//결과집합을 가져오는 메서드.
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
	public String getTitle() {
		String sql = "SELECT * FROM PORTFOLIO order by id desc";
		String title = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			Statement st = con.createStatement();//아이디에 물음표라서 prepare
			
			
			ResultSet rs = st.executeQuery(sql);//결과집합을 가져올수있는 공간.
  
			
			if(rs.next()) {//결과집합을 가져오는 메서드.
				title = rs.getString("title");
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
		
		
		return title;
	}


	@Override
	public String getCategory() {
		
		String sql = "select title from portfolio ";
		String category = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			Statement st = con.createStatement();//아이디에 물음표라서 prepare
			
			
			ResultSet rs = st.executeQuery(sql);//결과집합을 가져올수있는 공간.
  
			
			if(rs.next()) {//결과집합을 가져오는 메서드.
				category = rs.getString("category");
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
		
		return category;
	}


	@Override
	public List<Portfolio>  getList2() {
		
		
String sql = "SELECT * FROM PORTFOLIO ORDER BY ID desc";
		
		
		List<Portfolio> list2 = new ArrayList<>();
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			Statement st = con.createStatement();//아이디에 물음표라서 prepare
			/*PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, start);
			st.setInt(2, end);*/
			
			ResultSet rs = st.executeQuery(sql);//결과집합을 가져올수있는 공간.

			Portfolio portfolio = null;//자료형을 맞춰주기.
			
			while(rs.next()) {//결과집합을 가져오는 메서드.
				portfolio = new Portfolio(//반복할때마다 새로 객체가 만들어짐.
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
						rs.getString("CONSTRUCTION_POSITION_ID"),
						rs.getString("TITLE"),
						rs.getString("ATTACHED_FILE"),
						rs.getString("CATEGORY")
						);
			list2.add(portfolio);//담고보내야한다.!!
			
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
			
		return list2;
	}


	@Override
	public int getTCount(String memberId) {
		
		
		String sql = "SELECT MEMBER_ID, COUNT(ID) PCOUNT  FROM PORTFOLIO_VIEW GROUP BY MEMBER_ID HAVING MEMBER_ID=?";
		int pcount = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
			
			
			PreparedStatement st = con.prepareStatement(sql);//아이디에 물음표라서 prepare
			st.setString(1, memberId);
			
			ResultSet rs = st.executeQuery();//결과집합을 가져올수있는 공간.
  
			
			if(rs.next()) {//결과집합을 가져오는 메서드.
				pcount = rs.getInt("PCOUNT");
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
		
		
		
		return pcount;
	}


	
	}





	







