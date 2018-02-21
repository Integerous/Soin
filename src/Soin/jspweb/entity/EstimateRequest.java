package Soin.jspweb.entity;

import java.util.Date;

public class EstimateRequest {
	
	private String id;
	private String title;
	private String address;
	private Date desiredDate1;
	private Date desiredDate2;
	private String etcRequest;
	private Date regDate;
	private String memberId;
	private String productId;
	private String constructionId;
	private String bulingTypeId;
	private String constructionPositionId;
	
	public EstimateRequest() {
		
	}

	public EstimateRequest(String id, String title, String address, Date desiredDate1, Date desiredDate2,
			String etcRequest, Date regDate, String memberId, String productId, String constructionId,
			String bulingTypeId, String constructionPositionId) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.desiredDate1 = desiredDate1;
		this.desiredDate2 = desiredDate2;
		this.etcRequest = etcRequest;
		this.regDate = regDate;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionId = constructionId;
		this.bulingTypeId = bulingTypeId;
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

	public Date getDesiredDate1() {
		return desiredDate1;
	}

	public void setDesiredDate1(Date desiredDate1) {
		this.desiredDate1 = desiredDate1;
	}

	public Date getDesiredDate2() {
		return desiredDate2;
	}

	public void setDesiredDate2(Date desiredDate2) {
		this.desiredDate2 = desiredDate2;
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

	public String getBulingTypeId() {
		return bulingTypeId;
	}

	public void setBulingTypeId(String bulingTypeId) {
		this.bulingTypeId = bulingTypeId;
	}

	public String getConstructionPositionId() {
		return constructionPositionId;
	}

	public void setConstructionPositionId(String constructionPositionId) {
		this.constructionPositionId = constructionPositionId;
	}
	
	

}
