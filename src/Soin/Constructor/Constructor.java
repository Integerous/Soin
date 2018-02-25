package Soin.Constructor;

public class Constructor {

	private String member_id;
	private String name;
	private String corporateRegistrationNumber; 
	private String ceoName;
	private String mainImage;
	private String address;
	private String homepageAddress;
	private String introduction;
	private int gpa;
	private String speciality1;
	private String speciality2;
	private String speciality3;
	private String speciality4;
	
	public Constructor(){
		
	}
	
	//가입
	public Constructor(String member_id, String name, String corporateRegistrationNumber, String ceoName, String mainImage,
			String homepageAddress, String introduction, String speciality1, String speciality2,
			String speciality3, String speciality4) 
	{
		this.member_id = member_id;
		this.name = name;
		this.corporateRegistrationNumber = corporateRegistrationNumber;
		this.ceoName = ceoName;
		this.mainImage = mainImage;
		this.homepageAddress = homepageAddress;
		this.introduction = introduction;
		this.speciality1 = speciality1;
		this.speciality2 = speciality2;
		this.speciality3 = speciality3;
		this.speciality4 = speciality4;
	}
	
	//수정
	public Constructor(String name, String ceoName, String mainImage,
			String homepageAddress, String introduction, String speciality1, String speciality2,
			String speciality3, String speciality4) 
	{
		this.name = name;
		this.ceoName = ceoName;
		this.mainImage = mainImage;
		this.homepageAddress = homepageAddress;
		this.introduction = introduction;
		this.speciality1 = speciality1;
		this.speciality2 = speciality2;
		this.speciality3 = speciality3;
		this.speciality4 = speciality4;
	}



	public Constructor(String member_id, String name, String corporateRegistrationNumber, String ceoName,
			String mainImage, String address, String homepageAddress, String introduction, int gpa, String speciality1,
			String speciality2, String speciality3, String speciality4) {
		super();
		this.member_id = member_id;
		this.name = name;
		this.corporateRegistrationNumber = corporateRegistrationNumber;
		this.ceoName = ceoName;
		this.mainImage = mainImage;
		this.address = address;
		this.homepageAddress = homepageAddress;
		this.introduction = introduction;
		this.gpa = gpa;
		this.speciality1 = speciality1;
		this.speciality2 = speciality2;
		this.speciality3 = speciality3;
		this.speciality4 = speciality4;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorporateRegistrationNumber() {
		return corporateRegistrationNumber;
	}

	public void setCorporateRegistrationNumber(String corporateRegistrationNumber) {
		this.corporateRegistrationNumber = corporateRegistrationNumber;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getMainImage() {
		return mainImage;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomepageAddress() {
		return homepageAddress;
	}

	public void setHomepageAddress(String homepageAddress) {
		this.homepageAddress = homepageAddress;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public String getSpeciality1() {
		return speciality1;
	}

	public void setSpeciality1(String speciality1) {
		this.speciality1 = speciality1;
	}

	public String getSpeciality2() {
		return speciality2;
	}

	public void setSpeciality2(String speciality2) {
		this.speciality2 = speciality2;
	}

	public String getSpeciality3() {
		return speciality3;
	}

	public void setSpeciality3(String speciality3) {
		this.speciality3 = speciality3;
	}

	public String getSpeciality4() {
		return speciality4;
	}

	public void setSpeciality4(String speciality4) {
		this.speciality4 = speciality4;
	}
	
	
	
}
