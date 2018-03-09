package Soin.review;

import java.util.Date;

public class ReviewView extends Review{
	private int commentCount;
	private int likeCount;
	private String attachedFile;
	
	public ReviewView() {
		// TODO Auto-generated constructor stub
	}
	
	public ReviewView(String id, String title, Date regdate, int hit, int gradePoint, String content,
			String memberId, String productId, String constructionTypeId, String buildingTypeId,
			String constructionPositionId, int commentCount, int likeCount, String attachedFile) {
		super(id, title, regdate, hit, gradePoint, content, memberId, 
				productId, constructionTypeId, buildingTypeId, constructionPositionId);
		this.commentCount = commentCount;
		this.likeCount = likeCount;	
		this.attachedFile = attachedFile;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
	}


		
}
