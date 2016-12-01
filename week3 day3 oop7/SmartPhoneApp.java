public class SmartPhoneApp {
	public static void main(String[] args) {
		
		SmartPhone smart = new SmartPhone();
		smart.setTelNumber("010-3333-3333");
		smart.setCompany("KT");
		smart.setIp("111.111.111.111");

		smart.displayInfo();

		SmartPhone smart2 = new SmartPhone("010-4444-5555", "LGT", "193.193.193.193");
		smart2.displayInfo();
	}
}