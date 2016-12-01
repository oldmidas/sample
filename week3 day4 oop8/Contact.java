public class Contact {

	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;
	private int telIndex = 0;


	public Contact() {}
	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	public int getTelIndex() {
		return telIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tel[] getTels() {
		return tels;
	}

	public void addTel(Tel tel) {
		// tels배열의 적절한 위치에 담기
		if (telIndex < 50) {
			tels[telIndex] = tel;
			telIndex++;
		} else {
			System.out.println("50개 이상의 연락처를 저장할 수 없습니다.");
		}
		
	}

	public void setTels(Tel[] tels) {
		this.tels = tels;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}