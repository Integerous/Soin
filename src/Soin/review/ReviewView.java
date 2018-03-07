package Soin.review;

import java.util.Date;

public class ReviewView extends Review{
	private int commentCount;
	
	public ReviewView() {
		// TODO Auto-generated constructor stub
	}

	public ReviewView( 
		String id,
		String title,
		Date regDate,
		int hit,
		int gradePoint,
		String content,
		String memberId,
		String productId,
		String constructionTypeId,
		String buildingTypeId,
		String constructionPositionId,
		String attachedFile,
		int commentCount){
		super(id, title, regDate, hit, gradePoint, content, memberId, productId, constructionTypeId,buildingTypeId,constructionPositionId,attachdeFile );
		this.commentCount = commentCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	
	
	
	
}
