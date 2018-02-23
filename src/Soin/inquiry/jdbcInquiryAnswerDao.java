package Soin.inquiry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcInquiryAnswerDao implements InquiryAnswerDao{

	@Override
	public int insert(InquiryAnswer inquiryAnswer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String inquiryId, String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String inquiryId, String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InquiryAnswerView get(String inquiryId, String memberId) {
		String sql = "SELECT * FROM INQUIRY_ANSWER_VIEW WHERE INQUIRY_ID=? AND MEMBER_ID=?";
		InquiryAnswerView inquiryAnswer = null;
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "dclass");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	        st.setString(1, inquiryId); //자료형에 따라서 문자형인지 다른 것인지가 결정되니까 중요함
	        st.setString(1, memberId);
	        
	        ResultSet rs = st.executeQuery(); //위에 sql이 들어가기 때문에 또 넣으면 안됨!
	        
	        
	        if(rs.next()) {
	        	inquiryAnswer = new InquiryAnswerView(
	        			rs.getString("INQUIRY_ID"),
	        			rs.getString("MEMBER_ID"),
	        			rs.getString("TITLE"),
	        			rs.getString("CONTENT"),
	        			rs.getDate("ANSWER_DATE")
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
		return inquiryAnswer;
	}
	
	@Override
	public List<InquiryAnswerView> getList() {
		String sql = "SELECT * FROM INQUIRY_ANSWER_VIEW ORDER BY ANSWER_DATE DESC";
		List<InquiryAnswerView> list = new ArrayList<>();
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	        Connection con = DriverManager.getConnection(url, "c##soin", "dclass");
	        PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
	       	        
	        ResultSet rs = st.executeQuery(); //위에 sql이 들어가기 때문에 또 넣으면 안됨!
	        
	        InquiryAnswerView inquiryAnswer = null;
	        while(rs.next()) {
	        	inquiryAnswer = new InquiryAnswerView(
	        			rs.getString("INQUIRY_ID"),
	        			rs.getString("MEMBER_ID"),
	        			rs.getString("TITLE"),
	        			rs.getString("CONTENT"),
	        			rs.getDate("ANSWER_DATE")
	        		);
	        	list.add(inquiryAnswer);
	        }
	    	        
	        rs.close();
	        st.close();
	        con.close();
	        
	        
	     } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	     } catch (SQLException e) {
	        e.printStackTrace();
	     }
		return list;
	}
}
