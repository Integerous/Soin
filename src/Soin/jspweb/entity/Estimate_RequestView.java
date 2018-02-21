package Soin.jspweb.entity;

import java.util.Date;

public class Estimate_RequestView extends Estimate_Request {

	//기본 생성자
	public Estimate_RequestView() {
	
	}

	
	public Estimate_RequestView(
			String id, 
			String title, 
			String address, 
			Date desired_date01, 
			Date desired_date02,
			String etc_request, 
			Date regDate, 
			String member_id, 
			String product_id, 
			String construction_id,
			String building_type_id, 
			String construction_position_id) {
		
		super(id, title, address, desired_date01, desired_date02, etc_request, regDate, member_id, product_id, construction_id,
				building_type_id, construction_position_id);
	
	}
	
		

	
	
}
