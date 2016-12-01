public class Phone {
	private String telNumber;
	private String company;
	
	public Phone() {}

	public Phone(String telNumber, String company) {
		this.telNumber = telNumber;
		this.company = company;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public void displayInfo() {
		System.out.println("전화번호: " + telNumber);
		System.out.println("통 신 사: " + company);
	}
}