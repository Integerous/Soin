package Soin.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Soin.InteriorTip.InteriorTipView;
import Soin.review.ReviewView;

public class JdbcReviewDao implements ReviewDao {

   @Override
   public int insert(Review review) {
      String sql = "INSERT INTO REVIEW(ID, TITLE, GRADE_POINT, CONTENT, MEMBER_ID, PRODUCT_ID, CONSTRUCTION_TYPE_ID, BUILDING_TYPE_ID, CONSTRUCTION_POSITION_ID, ATTACHED_FILE)"
            + "VALUES((SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 AS ID FROM REVIEW),?,?,?,?,?,?,?,?,?)";         
            
      
      int result = 0;
      try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
           String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
           Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
           PreparedStatement st = con.prepareStatement(sql); //값을 ?로 대체해놓으면 Prepared로 해야한다.
           
                    

           //st.setString(1, review.getId());
         st.setString(1, review.getTitle());
         st.setString(2, review.getGradePoint());                    
         st.setString(3, review.getContent());
         st.setString(4, review.getMemberId());
         st.setString(5, review.getProductId());
         st.setString(6, review.getConstructionTypeId());
         st.setString(7, review.getBuildingTypeId());
         st.setString(8, review.getConstructionPositionId()); 
           st.setString(9, review.getAttachedFile());
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
   public int update(Review review) {
      String sql = "UPDATE REVIEW"
            + "SET" 
            + "title=?"
            + "grade_point=?,"
            + "content=?,"
            + "product_id=?,"
            + "construction_type_id=?,"
            + "bulding_type_id=?,"
            + "construction_position_id=?,"
            + "attached_file=?"
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
         st.setString(2, review.getGradePoint());                    
         st.setString(3, review.getContent());   
         st.setString(4, review.getProductId());
         st.setString(5, review.getConstructionTypeId());
         st.setString(6, review.getBuildingTypeId());
         st.setString(7, review.getConstructionPositionId()); 
         st.setInt(8, review.getHit()); 
         st.setString(9, review.getId()); 
         st.setString(10,review.getAttachedFile());
         
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
      //페이지 추가
      int start = 1+(page-1)*6;
      int end = page*6;
      
      
      String sql = "SELECT * FROM REVIEW_VIEW WHERE NUM BETWEEN ? AND ? ORDER BY REGDATE DESC"; 
      
      List<ReviewView> list = new ArrayList<>();
      
      try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
           String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
           Connection con = DriverManager.getConnection(url, "c##soin", "soin1218");
           PreparedStatement st = con.prepareStatement(sql); 
          st.setInt(1, start);
         st.setInt(2, end);
         //Statement st = con.createStatement();
           
           ResultSet rs = st.executeQuery(); 
                     
           ReviewView review = null;
           
           while(rs.next()) {
              review = new ReviewView(                    
                    rs.getString("ID"),
                    rs.getString("TITLE"),
                    rs.getDate("REGDATE"),
                    rs.getInt("HIT"),
                    rs.getString("GRADE_POINT"),                    
                    rs.getString("CONTENT"),
                    rs.getString("MEMBER_ID"),
                    rs.getString("PRODUCT_ID"),
                    rs.getString("CONSTRUCTION_TYPE_ID"),
                    rs.getString("BUILDING_TYPE_ID"),
                    rs.getString("CONSTRUCTION_POSITION_ID"),
                    rs.getString("ATTACHED_FILE"),
                    rs.getInt("LIKE_COUNT"),
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
           st.setString(1, id);   //시퀄에서 첫번째 물음표는 id다!        
           ResultSet rs = st.executeQuery(); 
           
                     
           if(rs.next()) {
              review = new ReviewView(                    
                    rs.getString("ID"),
                    rs.getString("TITLE"),
                    rs.getDate("REGDATE"),
                    rs.getInt("HIT"),
                    rs.getString("GRADE_POINT"),                    
                    rs.getString("CONTENT"),
                    rs.getString("MEMBER_ID"),
                    rs.getString("PRODUCT_ID"),
                    rs.getString("CONSTRUCTION_TYPE_ID"),
                    rs.getString("BUILDING_TYPE_ID"),
                    rs.getString("CONSTRUCTION_POSITION_ID"),
                    rs.getString("ATTACHED_FILE"),
                    rs.getInt("LIKE_COUNT"),
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
   
   public int getCount() {
      String sql = "SELECT COUNT(ID) COUNT FROM REVIEW_VIEW";
      int count = 0;
      Review review = null;
      
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