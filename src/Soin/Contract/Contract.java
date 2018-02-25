package Soin.Contract;

import java.util.Date;

public class Contract {
	private String id;
	private String address;
	private Date regdate;
	private String content;
	private String etcRequest;
	private Date constructionDate;
	private String positionSize;
	private String clientId;
	private String constructorId;
	private String productId;
	private String constructionTypeId;
	private String buildingTypeId;
	private String constructionPositionId;
	
	public Contract() {
		
	}

	public Contract(String id, String address, Date regdate, String content, String etcRequest, Date constructionDate,
			String positionSize, String clientId, String constructorId, String productId, String constructionTypeId,
			String buildingTypeId, String constructionPositionId) {
		super();
		this.id = id;
		this.address = address;
		this.regdate = regdate;
		this.content = content;
		this.etcRequest = etcRequest;
		this.constructionDate = constructionDate;
		this.positionSize = positionSize;
		this.clientId = clientId;
		this.constructorId = constructorId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
	}
	
	//INSERT용(필요없는 항목은 삭제할수 있다. 일단은 id지움)
	public Contract(String address, Date regdate, String content, String etcRequest, Date constructionDate,
			String positionSize, String clientId, String constructorId, String productId, String constructionTypeId,
			String buildingTypeId, String constructionPositionId) {
		
		//this.id = id;
		this.address = address;
		this.regdate = regdate;
		this.content = content;
		this.etcRequest = etcRequest;
		this.constructionDate = constructionDate;
		this.positionSize = positionSize;
		this.clientId = clientId;
		this.constructorId = constructorId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEtcRequest() {
		return etcRequest;
	}

	public void setEtcRequest(String etcRequest) {
		this.etcRequest = etcRequest;
	}

	public Date getConstructionDate() {
		return constructionDate;
	}

	public void setConstructionDate(Date constructionDate) {
		this.constructionDate = constructionDate;
	}

	public String getPositionSize() {
		return positionSize;
	}

	public void setPositionSize(String positionSize) {
		this.positionSize = positionSize;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getConstructorId() {
		return constructorId;
	}

	public void setConstructorId(String constructorId) {
		this.constructorId = constructorId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getConstructionTypeId() {
		return constructionTypeId;
	}

	public void setConstructionTypeId(String constructionTypeId) {
		this.constructionTypeId = constructionTypeId;
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