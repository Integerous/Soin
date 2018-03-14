package Soin.portfolio;

public class PortfolioView extends Portfolio {

	private int reviewCount;//후기 수.
	
	
	public PortfolioView() {
		
	}
 

	
	/*public PortfolioView(String id,
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
*/

	public PortfolioView(String id, String location, String content, String period, int hit, int like, String memberId,
			String productId, String constructionTypeId, String buildingTypeId, String constructionPositionId,
			String title, String attachedFile, String category) {
		super(id, location, content, period, hit, like, memberId, productId, constructionTypeId, buildingTypeId,
				constructionPositionId, title, attachedFile, category);
		// TODO Auto-generated constructor stub
	}




/*

	public int getReviewCount() {
		return reviewCount;
	}


	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}


*/
	

	
}
