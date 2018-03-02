package Soin.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Soin.review.ReviewView;

public class JdbcReviewDao implements ReviewDao {

	@Override
	public int insert(Review review) {
		String sql = "INSERT INTO REVIEW("+
						"id,"+
						"title,"+
						"grade_point,"+
						"content,"+
						"member_id,"+
						"product_id,"+
						"construction_type_id,"+
						"bulding_type_id,"+
						"construction_position_id,"+
						")VALUES ("
						+ "(SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 AS ID FROM REVIEW)"
				   		+ ",?,?,?,?,?,?,?,?)";
		
		int result = 0;
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	        
	      	        
	        // st.setString("ID");
			st.setString(1, review.getTitle());
			//st.setDate("REGDATE");
			//st.setInt("HIT");
			st.setInt(2, review.getGradePoint());	        			
			st.setString(3, review.getContent());
			st.setString(4, review.getMemberId());
			st.setString(5, review.getProductId());
			st.setString(6, review.getConstructionTypeId());
			st.setString(7, review.getBuildingTypeId());
			st.setString(8, review.getConstructionPositionId()); 
	        
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
	public int update(Review review) {
		String sql = "UPDATE REVIEW"
				+ "SET" 
				+ "title=?"
				+ "grade_point=?,"
				+ "content=?,"
				+ "member_id=?,"
				+ "product_id=?,"
				+ "construction_type_id=?,"
				+ "bulding_type_id=?,"
				+ "construction_position_id=?,"
				+ "hit=hit+1"
				+ "WHERE id =?";

		int result = 0;
		try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    
		    String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		    Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
		    PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
		    
		  	        
		    // st.setString("ID");
			st.setString(1, review.getTitle());
			//st.setDate("REGDATE");
			//st.setInt("HIT");
			st.setInt(2, review.getGradePoint());	        			
			st.setString(3, review.getContent());
			st.setString(4, review.getMemberId());
			st.setString(5, review.getProductId());
			st.setString(6, review.getConstructionTypeId());
			st.setString(7, review.getBuildingTypeId());
			st.setString(8, review.getConstructionPositionId()); 
			st.setInt(9, review.getHit()); 
			st.setString(10, review.getId()); 
			
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
	public int delete(String id) {
		String sql = "DELETE REVIEW WHERE ID=? ";
		
		int result = 0;
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	        
	        st.setString(1,id);
	        
	        result = st.executeUpdate(); //영향을 받은 놈이 있니?
	    	
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
	public List<ReviewView> getList(int page) {
		String sql = "SELECT * FROM REVIEW_VIEW ORDER BY REGDATE DESC"; 
		List<ReviewView> list = new ArrayList<>();
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
	        
	        PreparedStatement st = con.prepareStatement(sql); 
	      	        
	        ResultSet rs = st.executeQuery(sql); 
	        	       
	        ReviewView review = null;
	        while(rs.next()) {
	        	review = new ReviewView(	        			
	        			rs.getString("ID"),
	        			rs.getString("TITLE"),
	        			rs.getDate("REGDATE"),
	        			rs.getInt("HIT"),
	        			rs.getInt("GRADE_POINT"),	        			
	        			rs.getString("CONTENT"),
	        			rs.getString("MEMBER_ID"),
	        			rs.getString("PRODUCT_ID"),
	        			rs.getString("CONSTRUCTION_TYPE_ID"),
	        			rs.getString("BUILDING_TYPE_ID"),
	        			rs.getString("CONSTRUCTION_POSITION_ID"),
	        			rs.getInt("COMMENT_COUNT")   
	        		);
	        	list.add(review);
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
	public ReviewView get(String id) {
		String sql = "SELECT * FROM REVIEW_VIEW WHERE ID=?"; 
		ReviewView review = null;
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
	        PreparedStatement st = con.prepareStatement(sql);
	        
	        st.setString(1, id);
	        
	        ResultSet rs = st.executeQuery(); 
	        
	       
	        
	        if(rs.next()) {
	        	review = new ReviewView(	        			
	        			rs.getString("ID"),
	        			rs.getString("TITLE"),
	        			rs.getDate("REGDATE"),
	        			rs.getInt("HIT"),
	        			rs.getInt("GRADE_POINT"),	        			
	        			rs.getString("CONTENT"),
	        			rs.getString("MEMBER_ID"),
	        			rs.getString("PRODUCT_ID"),
	        			rs.getString("CONSTRUCTION_TYPE_ID"),
	        			rs.getString("BUILDING_TYPE_ID"),
	        			rs.getString("CONSTRUCTION_POSITION_ID"),
	        			rs.getInt("COMMENT_COUNT")   
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
	     
	     return review;
	}

	
	
}
