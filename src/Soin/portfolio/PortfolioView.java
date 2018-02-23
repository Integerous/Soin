package Soin.portfolio;

public class PortfolioView extends Portfolio {

	private int commentCount;//후기 수.
	
	
	public PortfolioView() {
		
	}


	public PortfolioView(String id,
						 String location, 
						 String content, 
						 String period, 
						 int hit, 
						 int like,
						 String memberId, 
						 String productId,
						 String constructionTypeId, 
						 String buildingTypeId,
						 String constructionPositionId) {
		super(id, location, content, period, hit, like, memberId, productId, constructionTypeId, buildingTypeId,
				constructionPositionId);
		// TODO Auto-generated constructor stub
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	
}
