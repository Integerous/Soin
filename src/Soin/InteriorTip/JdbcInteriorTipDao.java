package Soin.InteriorTip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcInteriorTipDao implements InteriorTipDao{

	@Override
	public int insert(InteriorTip interiorTip) {
		String sql = "INSERT INTO interior_tip (" + 
				"    id," + 
				"    title," + 
				"    content," + 
				"    hit," + 
				"    regdate," + 
				"    member_id," + 
				"    product_id," + 
				"    construction_type_id," + 
				"    building_type_id," + 
				"    construction_position_id" + 
				") VALUES ((SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM INTERIOR_TIP)"
				+ ",?,?,?,?,?,?,?,?,?,?)";
		
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, interiorTip.getTitle());
			st.setString(2, interiorTip.getContent());
			st.setString(3, interiorTip.getMemberId());
			st.setString(4, interiorTip.getProductId());
			st.setString(5, interiorTip.getConstructionTypeId());
			st.setString(6, interiorTip.getBuildingTypeId());
			st.setString(7, interiorTip.getConstructionPositionId());
			
			result = st.executeUpdate();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int update(InteriorTip interiorTip) {
		
		String sql = "UPDATE INTERIOR_TIP SET title =?," + 
				"    content =?," + 
				"    hit =?," +   
				"    product_id =?," + 
				"    construction_type_id =?," + 
				"    building_type_id =?," + 
				"    construction_position_id =? WHERE ID =?";
		
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, interiorTip.getTitle());
			st.setString(2, interiorTip.getContent());
			st.setInt(3, interiorTip.getHit());
			st.setString(4, interiorTip.getProductId());
			st.setString(5, interiorTip.getConstructionTypeId());
			st.setString(6, interiorTip.getBuildingTypeId());
			st.setString(7, interiorTip.getConstructionPositionId());
			st.setString(8, interiorTip.getId());
			
			result = st.executeUpdate();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(String id) {
		String sql = "DELETE INTERIOR_TIP WHERE ID =?";
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, id);
			
			result = st.executeUpdate();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<InteriorTipView> getList(int page) {
		
		int start = 1+(page-1)*15;
		int end = page*15;
		
		/*String sql = "SELECT * FROM INTERIOR_TIP_VIEW ORDER BY REGDATE DESC";*/
		String sql = "SELECT * FROM INTERIOR_TIP_VIEW WHERE NUM BETWEEN ? AND ?";
		
		List<InteriorTipView> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, start);
			st.setInt(2, end);
			
			ResultSet rs = st.executeQuery();

			InteriorTipView interiorTip = null;
			
			while(rs.next()) {
				interiorTip = new InteriorTipView(
						rs.getString("ID"),
						rs.getString("TITLE"),
						rs.getString("CONTENT"),
						rs.getInt("HIT"),
						rs.getDate("REGDATE"),
						rs.getString("MEMBER_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_TYPE_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID"),
						rs.getString("ATTACHED_FILE"),
						rs.getInt("COMMENT_COUNT"),
						rs.getInt("LIKE_COUNT")
						);
				list.add(interiorTip);
			}
			
			rs.close();
			st.close();
			con.close(); 
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//list에 반환
		return list;
	}

	@Override
	public InteriorTipView get(String id) {
		String sql = "SELECT * FROM INTERIOR_TIP_VIEW WHERE ID =?";
		InteriorTipView interiorTip = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				interiorTip = new InteriorTipView(
						rs.getString("ID"),
						rs.getString("TITLE"),
						rs.getString("CONTENT"),
						rs.getInt("HIT"),
						rs.getDate("REGDATE"),
						rs.getString("MEMBER_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_TYPE_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID"),
						rs.getString("ATTACHED_FILE"),
						rs.getInt("COMMENT_COUNT"),
						rs.getInt("LIKE_COUNT")
						);
			}
				
				
				rs.close();
				st.close();
				con.close(); 
				
			} catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		
		return interiorTip;
	}

	@Override
	public int getCount() {
			String sql = "SELECT * FROM INTERIOR_TIP_VIEW WHERE ID =?";
			int count = 0;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				
				if(rs.next()) {
					count = rs.getInt("count");
				}
					
					
					rs.close();
					st.close();
					con.close(); 
					
				} catch (ClassNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
			
			return count;
	}
}