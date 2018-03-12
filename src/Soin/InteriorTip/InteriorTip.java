package Soin.InteriorTip;

import java.util.Date;

public class InteriorTip {
	private String id;
	private String title;
	private String content;
	private int hit;
	private Date regdate;
	private String memberId;
	private String productId;
	private String constructionTypeId;
	private String buildingTypeId;
	private String constructionPositionId;
	private String attachedFile;
	
	public InteriorTip() {
		
	}
	
	public InteriorTip(String id, String title, String content, int hit, Date regdate,
			 String memberId, String productId, String constructionTypeId, String buildingTypeId,
			 String constructionPositionId, String attachedFile){
		
		this.id = id;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regdate = regdate;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
		this.attachedFile = attachedFile;
	}
	
// INSERT시 필요없는 항목 삭제
	public InteriorTip(String title, String content, String memberId, String productId, String constructionTypeId, String buildingTypeId,
			 String constructionPositionId, String attachedFile){
		
		this.title = title;
		this.content = content;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
		this.attachedFile = attachedFile;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
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

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
	}
	
	
}
