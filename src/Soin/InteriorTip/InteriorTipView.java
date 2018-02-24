package Soin.InteriorTip;

import java.util.Date;

public class InteriorTipView extends InteriorTip{

	private int commentCount;
	private int likeCount;
	
	public InteriorTipView() {
		
	}
	
	public InteriorTipView(String id, String title, String content, int hit, Date regdate,
			 String memberId, String productId, String constructionTypeId, String buildingTypeId,
			 String constructionPositionId, int commentCount, int likeCount) {
		
		super(id, title, content, hit, regdate, memberId, productId,
				constructionTypeId, buildingTypeId, constructionPositionId);
		
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
