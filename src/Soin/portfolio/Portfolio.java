package Soin.portfolio;

import java.util.Date;

public class Portfolio {

	private String id;
	private String location;
	private String content;
	private String period;
	private int hit;
	private int like;
	private String memberId;
	private String productId;
	private String constructionTypeId;
	private String buildingTypeId;
	private String constructionPositionId;
	private String title;
	private String attachedFile;
	
	
	public Portfolio() {
	
	}

	//insert
	public Portfolio(String id, String location, String content, String period, int hit, int like, String memberId,
			String productId, String constructionTypeId, String buildingTypeId, String constructionPositionId, String title, String attachedFile) {
		
		this.id = id;
		this.location = location;
		this.content = content;
		this.period = period;
		this.hit = hit;
		this.like = like;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
		this.title =title;
		this.attachedFile=attachedFile;
	}

	public Portfolio(String location, String content, String period, String memberId,
			String productId, String constructionTypeId, String buildingTypeId, String constructionPositionId, String title, String attachedFile) {
		
		//this.id = id;
		this.location = location;
		this.content = content;
		this.period = period;
		//this.hit = hit;
		//this.like = like;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
		this.title =title;
		this.attachedFile=attachedFile;
	}


	

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
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

	public String getcontent() {
		return content;
	}

	public void setcontent(String content) {
		this.content = content;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
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

	
	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	
}
