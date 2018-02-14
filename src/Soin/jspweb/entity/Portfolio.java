package Soin.jspweb.entity;

import java.util.Date;

public class Portfolio {

	private String id;
	private String location;
	private String detail_content;
	private Date period;
	private int hit;
	private int like;
	private String member_id;
	private String product_id;
	private String construction_type_id;
	private String building_type_id;
	private String construction_position_id;
	
	public Portfolio() {
	
	}

	public Portfolio(String id, String location, String detail_content, Date period, int hit, int like,
			String member_id, String product_id, String construction_type_id, String building_type_id,
			String construction_position_id) {
		super();
		this.id = id;
		this.location = location;
		this.detail_content = detail_content;
		this.period = period;
		this.hit = hit;
		this.like = like;
		this.member_id = member_id;
		this.product_id = product_id;
		this.construction_type_id = construction_type_id;
		this.building_type_id = building_type_id;
		this.construction_position_id = construction_position_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDetail_content() {
		return detail_content;
	}

	public void setDetail_content(String detail_content) {
		this.detail_content = detail_content;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
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

	public String getConstruction_type_id() {
		return construction_type_id;
	}

	public void setConstruction_type_id(String construction_type_id) {
		this.construction_type_id = construction_type_id;
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
