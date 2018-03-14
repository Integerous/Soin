package Soin.Constructor;

public class ConstructorView extends Constructor{
	
	private String address;
	private String role;
	
	public ConstructorView() {
		
	}
	

	public ConstructorView(
			String member_id, 
			String name, 
			String corporateRegistrationNumber, 
			String ceoName,
			String mainImage, 
			String address,
			String role,
			float gpa, 
			String introduction, 
			String homepageAddress, 
			String speciality1,
			String speciality2,
			String speciality3, 
			String speciality4) {
		super(member_id, name, corporateRegistrationNumber, ceoName, mainImage, homepageAddress, introduction, gpa,
				speciality1, speciality2, speciality3, speciality4);

		this.address = address;
		this.role = role;
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
