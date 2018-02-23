package Soin.inquiry;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcInquiryDao implements InquiryDao{

	@Override
	public int insert(Inquiry inquiry) {
		String sql = "INSERT INTO inquiry("+
				"id,"+
				"title,"+
				"content,"+
				"type,"+
				"attachment,"+
				"regdate,"+
				"answer_check,"+
				"member_id"+") VALUES ("
				+"(SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 AS ID FROM ANSWERIS_VIEW)"
				+",?,?,?,?,?,?,?,?)";
		
		int result = 0;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
        Connection con = DriverManager.getConnection(url, "c##soin", "dclass");
        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
        
        result = st.executeUpdate();
        st.close();
        con.close();
        
       
        
     } catch (ClassNotFoundException e) {
        e.printStackTrace();
     } catch (SQLException e) {
        e.printStackTrace();
     }
	return result;
	}
	

	@Override
	public int delete(String id) {
		String sql = "DELETE inquiry WHERE ID=?";
		
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "dclass");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	        
	        result = st.executeUpdate();
	        st.close();
	        con.close();
	        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public InquiryView get(String id) {
		String sql = "SELECT * FROM INQUIRY_VIEW WHERE ID=?";
		InquiryView inquiry = null;
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "dclass");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	        st.setString(1, id); //자료형에 따라서 문자형인지 다른 것인지가 결정되니까 중요함
	        
	        ResultSet rs = st.executeQuery(); //위에 sql이 들어가기 때문에 또 넣으면 안됨!
	        
	        
	        
	        if(rs.next()) {
	        	inquiry = new InquiryView(
	        			rs.getString("ID"),
	        			rs.getString("TITLE"),
	        			rs.getString("CONTENT"),
	        			rs.getString("TYPE"),
	        			rs.getString("ATTACHMENT"),
	        			rs.getDate("REGDATE"),
	        			rs.getString("ANSWER_CHECK"),
	        			rs.getString("MEMBER_ID")      
	        		);
	        }
	    	        
	        rs.close();
	        st.close();
	        con.close();
	        
	       
	        
	     } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	     } catch (SQLException e) {
	        e.printStackTrace();
	     }
		return inquiry;
	}
	
	@Override
	public List<InquiryView> getList() {
		String sql = "SELECT * FROM INQUIRY_VIEW ORDER BY REG_DATE DESC";
		List<InquiryView> list = new ArrayList<>();
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "dclass");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	       
	        ResultSet rs = st.executeQuery(); //위에 sql이 들어가기 때문에 또 넣으면 안됨!
	        
	        InquiryView inquiry = null;	        
	        while(rs.next()) {
	        	inquiry = new InquiryView(
	        			rs.getString("ID"),
	        			rs.getString("TITLE"),
	        			rs.getString("CONTENT"),
	        			rs.getString("TYPE"),
	        			rs.getString("ATTACHMENT"),
	        			rs.getDate("REGDATE"),
	        			rs.getString("ANSWER_CHECK"),
	        			rs.getString("MEMBER_ID")      
	        		);
	        	list.add(inquiry);
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

}
