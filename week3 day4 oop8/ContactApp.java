public class ContactApp {
	public static void main(String[] args) {

		//주소록정보(이름, 여러개의 전화번호, 주소)를 저장하는 객체 생성
		Contact contact = new Contact();
		
		// 이름 정보 저장
		String name = "홍길동";
		contact.setName(name);

		// 전화번호 정보 저장
		Tel[] phones = new Tel[10];
		
		Tel tel1 = new Tel();
		tel1.setType("폰");
		tel1.setNumber("010-1111-1111");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel1.setType("직장");
		tel1.setNumber("02-1234-5678");
		phones[1] = tel2;

		contact.setTels(phones);

		//주소정보 저장
		Address address = new Address("11364", "Seoul", "Gangdong", "1-1");
		contact.setAddress(address);

	}
}