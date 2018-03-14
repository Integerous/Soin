package Soin.Constructor;

public class ConstructorView extends Constructor{
	
	private String role;
	private String address;
	
	public ConstructorView() {
		
	}
	

	public ConstructorView(
			String member_id, 
			String name, 
			String corporateRegistrationNumber, 
			String ceoName,
			String mainImage, 
			String homepageAddress, 
			String introduction, 
			float gpa, 
			String speciality1,
			String speciality2,
			String speciality3, 
			String speciality4,
			String role,
			String address
			) {
		super(member_id, name, corporateRegistrationNumber, ceoName, mainImage, homepageAddress, introduction, gpa,
				speciality1, speciality2, speciality3, speciality4);

		this.role = role;
		this.address = address;
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
