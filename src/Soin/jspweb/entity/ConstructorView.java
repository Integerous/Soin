package Soin.jspweb.entity;

public class ConstructorView extends Constructor{
	
	private int commentCount;
	
	public ConstructorView() {
		// TODO Auto-generated constructor stub
	}

	public ConstructorView(
			String member_id, 
			String name, 
			String corporateRegistrationNumber, 
			String ceoName,
			String mainImage, 
			String address, 
			String homepageAddress, 
			String introduction, 
			int gpa, 
			String speciality1,
			String speciality2, 
			String speciality3, 
			String speciality4
		) {
		super(member_id, name, corporateRegistrationNumber, ceoName, mainImage, address, homepageAddress, introduction, gpa,
				speciality1, speciality2, speciality3, speciality4);
		
		this.commentCount = commentCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

}
