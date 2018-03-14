package Soin.review;

import java.util.Date;

public class ReviewView extends Review{
	private int commentCount;
	private int likeCount;

	
	public ReviewView() {
		// TODO Auto-generated constructor stub
	}
	
	public ReviewView(String id, String title, Date regdate, int hit, String gradePoint, String content,
			String memberId, String productId, String constructionTypeId, String buildingTypeId,
			String constructionPositionId, String attachedFile, int commentCount, int likeCount) {
		super(id, title, regdate, hit, gradePoint, content, memberId, 
				productId, constructionTypeId, buildingTypeId, constructionPositionId, attachedFile);
		this.commentCount = commentCount;
		this.likeCount = likeCount;	
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



		
}
