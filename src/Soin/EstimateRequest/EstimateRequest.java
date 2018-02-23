package Soin.EstimateRequest;

import java.util.Date;

public class EstimateRequest {

	private String id;
	private String title;
	private String address;
	private Date desiredDate01;
	private Date desiredDate02;
	private String etcRequest;
	private Date regDate;
	private String memberId;
	private String productId;
	private String constructionId;
	private String buildingTypeId;
	private String constructionPositionId;
	
	public EstimateRequest() {
		// TODO Auto-generated constructor stub
	}

	public EstimateRequest(String id, String title, String address, Date desiredDate01, Date desiredDate02,
			String etcRequest, Date regDate, String memberId, String productId, String constructionId,
			String buildingTypeId, String constructionPositionId) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.desiredDate01 = desiredDate01;
		this.desiredDate02 = desiredDate02;
		this.etcRequest = etcRequest;
		this.regDate = regDate;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionId = constructionId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
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

	public Date getDesiredDate01() {
		return desiredDate01;
	}

	public void setDesiredDate01(Date desiredDate01) {
		this.desiredDate01 = desiredDate01;
	}

	public Date getDesiredDate02() {
		return desiredDate02;
	}

	public void setDesiredDate02(Date desiredDate02) {
		this.desiredDate02 = desiredDate02;
	}

	public String getEtcRequest() {
		return etcRequest;
	}

	public void setEtcRequest(String etcRequest) {
		this.etcRequest = etcRequest;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getConstructionId() {
		return constructionId;
	}

	public void setConstructionId(String constructionId) {
		this.constructionId = constructionId;
	}

	public String getBuildingTypeId() {
		return buildingTypeId;
	}

	public void setBuildingTypeId(String buildingTypeId) {
		this.buildingTypeId = buildingTypeId;
	}

	public String getConstructionPositionId() {
		return constructionPositionId;
	}

	public void setConstructionPositionId(String constructionPositionId) {
		this.constructionPositionId = constructionPositionId;
	}

	
}
