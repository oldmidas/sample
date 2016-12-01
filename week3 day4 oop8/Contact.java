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
		// tels�迭�� ������ ��ġ�� ���
		if (telIndex < 50) {
			tels[telIndex] = tel;
			telIndex++;
		} else {
			System.out.println("50�� �̻��� ����ó�� ������ �� �����ϴ�.");
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