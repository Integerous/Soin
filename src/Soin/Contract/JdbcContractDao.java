package Soin.Contract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Soin.InteriorTip.InteriorTipView;

public class JdbcContractDao implements ContractDao {

	@Override
	public int insert(Contract contract) {
		String sql = "INSERT INTO contract (" + 
				"    id," + 
				"    address," + 
				"    regdate," + 
				"    content," + 
				"    etc_request," + 
				"    construction_date," + 
				"    position_size," + 
				"    client_id," + 
				"    constructor_id," + 
				"    product_id," +
				"    construction_type_id," +
				"    building_type_id," +
				"    construction_position_id," +
				") VALUES ((SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM CONTRACT)"
				+ ",?,?,?,?,?,?,?,?,?,?.?.?,?)";
		
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, contract.getId());
			st.setString(2, contract.getAddress());
			st.setDate(3,  contract.getRegdate());
			st.setString(4, contract.getContent());
			st.setString(5, contract.getEtcRequest());
			st.setDate(6, contract.getConstructionDate());
			st.setString(7, contract.getPositionSize());
			st.setString(8, contract.getClientId());
			st.setString(9, contract.getConstructorId());
			st.setString(10, contract.getProductId());
			st.setString(11, contract.getConstructionTypeId());
			st.setString(12, contract.getBuildingTypeId());
			st.setString(13, contract.getConstructionPositionId());
			
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
	public int update(Contract contract) {
		String sql = "UPDATE Contract SET title =?," + 
				"    id =?," + 
				"    address =?," +   
				"    regdate =?," + 
				"    content =?," + 
				"    etc_request =?," +
				"    construction_date =?," + 
				"    position_size =?," + 
				"    client_id =?," + 
				"    constructor_id =?," + 
				"    etc_request =?," + 
				"    product_id =?," + 
				"    construction_type_id =?," +
				"    building_type_id =?," + 
				"    construction_type_id =?," + 
				"    construction_position_id =? WHERE ID =?";
		
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, contract.getId());
			st.setString(2, contract.getAddress());
			st.setDate(3,  contract.getRegdate());
			st.setString(4, contract.getContent());
			st.setString(5, contract.getEtcRequest());
			st.setDate(6, contract.getConstructionDate());
			st.setString(7, contract.getPositionSize());
			st.setString(8, contract.getClientId());
			st.setString(9, contract.getConstructorId());
			st.setString(10, contract.getProductId());
			st.setString(11, contract.getConstructionTypeId());
			st.setString(12, contract.getBuildingTypeId());
			st.setString(13, contract.getConstructionPositionId());
			
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
		String sql = "DELETE CONTRACT WHERE ID =?";
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
		
		return result;	}

	@Override
	public List<ContractView> getList() {
		String sql = "SELECT * FROM CONTRACT_VIEW ORDER BY REGDATE DESC";
		
		List<ContractView> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			ContractView contract = null;
			
			while(rs.next()) {
				contract = new ContractView(
						rs.getString("ID"),
						rs.getString("ADDRESS"),
						rs.getDate("REGDATE"),
						rs.getString("CONTENT"),
						rs.getString("ETC_REQUEST"),
						rs.getDate("CONSTRUCTION_DATE"),
						rs.getString("POSITION_SIZE"),
						rs.getString("CLIENT_ID"),
						rs.getString("CONSTRUCTOR_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_TYPE_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID")
						);
				list.add(contract);
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
	public ContractView get(String id) {
		String sql = "SELECT * FROM INTERIOR_TIP_VIEW WHERE ID =?";
		InteriorTipView interiorTip = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##soin","soin1218");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				contract = new ContractView(
						rs.getString("ID"),
						rs.getString("ADDRESS"),
						rs.getDate("REGDATE"),
						rs.getString("CONTENT"),
						rs.getString("ETC_REQUEST"),
						rs.getDate("CONSTRUCTION_DATE"),
						rs.getString("POSITION_SIZE"),
						rs.getString("CLIENT_ID"),
						rs.getString("CONSTRUCTOR_ID"),
						rs.getString("PRODUCT_ID"),
						rs.getString("CONSTRUCTION_TYPE_ID"),
						rs.getString("BUILDING_TYPE_ID"),
						rs.getString("CONSTRUCTION_POSITION_ID")
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
			
			
		
		return contract;
	}

}
