package Soin.jspweb.entity;

import java.util.Date;

public class Estimate_Request {

	private String id;
	private String title;
	private String address;
	private Date desired_date01;
	private Date desired_date02;
	private String etc_request;
	private Date regDate;
	private String member_id;
	private String product_id;
	private String construction_id;
	private String building_type_id;
	private String construction_position_id;
	
	public Estimate_Request() {
		// TODO Auto-generated constructor stub
	}

	
	public Estimate_Request(String id, String title, String address, Date desired_date01, Date desired_date02,
			String etc_request, Date regDate, String member_id, String product_id, String construction_id,
			String building_type_id, String construction_position_id) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.desired_date01 = desired_date01;
		this.desired_date02 = desired_date02;
		this.etc_request = etc_request;
		this.regDate = regDate;
		this.member_id = member_id;
		this.product_id = product_id;
		this.construction_id = construction_id;
		this.building_type_id = building_type_id;
		this.construction_position_id = construction_position_id;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDesired_date01() {
		return desired_date01;
	}


	public void setDesired_date01(Date desired_date01) {
		this.desired_date01 = desired_date01;
	}


	public Date getDesired_date02() {
		return desired_date02;
	}


	public void setDesired_date02(Date desired_date02) {
		this.desired_date02 = desired_date02;
	}


	public String getEtc_request() {
		return etc_request;
	}


	public void setEtc_request(String etc_request) {
		this.etc_request = etc_request;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getConstruction_id() {
		return construction_id;
	}


	public void setConstruction_id(String construction_id) {
		this.construction_id = construction_id;
	}


	public String getBuilding_type_id() {
		return building_type_id;
	}


	public void setBuilding_type_id(String building_type_id) {
		this.building_type_id = building_type_id;
	}


	public String getConstruction_position_id() {
		return construction_position_id;
	}


	public void setConstruction_position_id(String construction_position_id) {
		this.construction_position_id = construction_position_id;
	}
	
	
	
	
}
