package Soin.review;

import java.util.Date;

public class Review {
	private String id;
	private String title;
	private Date regdate;
	private int hit;
	private int gradePoint;
	private String content;
	private String memberId;
	private String productId;
	private String constructionTypeId;
	private String buildingTypeId;
	private String constructionPositionId;

	
	public Review() {
		
	}

	public Review(String id, String title, Date regdate, int hit, int gradePoint, String content, String memberId,
			String productId, String constructionTypeId, String buildingTypeId, String constructionPositionId) {
		super();
		this.id = id;
		this.title = title;
		this.regdate = regdate;
		this.hit = hit;
		this.gradePoint = gradePoint;
		this.content = content;
		this.memberId = memberId;
		this.productId = productId;
		this.constructionTypeId = constructionTypeId;
		this.buildingTypeId = buildingTypeId;
		this.constructionPositionId = constructionPositionId;
;
	}
	
	// insert시에 필요없는 항목을 제외
	public Review(String title, int gradePoint, String content, String memberId, String productId,
			String constructionTypeId, String buildingTypeId, String constructionPositionId) {
		
		this.title = title;
		this.gradePoint = gradePoint;
		this.content = content;
		this.memberId = memberId;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(int gradePoint) {
		this.gradePoint = gradePoint;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	
	
}
