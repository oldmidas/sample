public class SmartPhone extends Phone {

	private String ip;

	public SmartPhone () {
		super();
	}

	public SmartPhone(String telNumber, String company, String ip) {
		super(telNumber, company);	// �θ��� ������ ȣ���ϱ� [Phone(String, String)������]
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public void displayInfo() {
		//System.out.println("��ȭ��ȣ: " + getTelNumber());
		//System.out.println("�� �� ��: " + getCompany());		
		super.displayInfo();
		System.out.println("�� �� ��: " + ip);		
	}

}