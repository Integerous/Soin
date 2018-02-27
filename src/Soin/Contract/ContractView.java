package Soin.Contract;

import java.sql.Date;

public class ContractView extends Contract {
	
	private int commentCount;
	private int likeCount;
	
	//뷰는 insert update 안함? 생성자를 통해서 값을 가져오는 일이 잘없음? 나중에 필요하면 생성자는 그때추가?
	
	
	public ContractView(String string, String string2, Date date, String string3, String string4, Date date2,
			String string5, String string6, String string7, String string8, String string9, String string10,
			String string11) {
	
		this.string11 = string11;
		this.string10 = string10;
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