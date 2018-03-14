package Soin.EstimateRequest;

import java.util.Date;

public class EstimateRequestView extends EstimateRequest {

	//기본 생성자
	public EstimateRequestView() {
	
	}

	
	public EstimateRequestView(
			String id, 
			String title, 
			String address, 
			Date desiredDate01, 
			Date desiredDate02,
			String etcRequest, 
			Date regDate, 
			String memberId, 
			String productId, 
			String constructionId,
			String buildingTypeId, 
			String constructionPositionId,
			String attachedFile,
			String detailCategory) {
		
		super(id, title, address, desiredDate01, desiredDate02, etcRequest, regDate, memberId, productId, constructionId,
				buildingTypeId, constructionPositionId, attachedFile, detailCategory);
	
	}
	
		

	
	
}
