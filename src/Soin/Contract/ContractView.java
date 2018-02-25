package Soin.Contract;

public class ContractView extends Contract {
	
	private int commentCount;
	private int likeCount;
	
	//뷰는 insert update 안함? 생성자를 통해서 값을 가져오는 일이 잘없음? 나중에 필요하면 생성자는 그때추가?
	
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