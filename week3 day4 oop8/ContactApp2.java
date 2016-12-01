import java.util.Scanner;
public class ContactApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address address = new Address();


		for(;;) {
			System.out.println("1.이름등록/수정 2.전화번호등록 3.주소등록/수정 4.조회 0.종료");
			System.out.print("메뉴를 선택하세요: ");
			int no = sc.nextInt();
			if (no == 1) {
				System.out.print("이름을 입력하세요: ");
				// 이름을 입력받아서 Contact에 저장합니다.
				contact.setName(sc.next());
				System.out.println();

			} else if (no == 2) {
				// 전화번호 정보를 입력받아서 Contact에 저장합니다.
					Tel tel = new Tel();
					System.out.print("타입을 입력하세요: ");
					tel.setType(sc.next());
					System.out.print("번호를 입력하세요: ");
					tel.setNumber(sc.next());
					System.out.println();

				// Tel객체를 생성 -> 값 입력받아서 채우고 -> Contact의 addTel(Tel tel)에게 Tel 객체 전달해서 배열에 담기
					contact.addTel(tel);

			} else if (no == 3) {
				// 주소 정보를 입력받아서 Contact에 저장합니다.
				System.out.print("우편번호를 입력하세요: ");
				address.setZipcode(sc.next());
				System.out.print("시/도를 입력하세요: ");
				address.setSido(sc.next());
				System.out.print("구/군을 입력하세요: ");
				address.setGugun(sc.next());
				System.out.print("나머지 주소를 입력하세요: ");
				address.setDetail(sc.next());
				// Address 객체생성 -> 값 입력받아서 채우고 -> Contact의 setter이용해서 저장
				contact.setAddress(address);
				System.out.println();
			} else if (no == 4) {
				// 연락처 정보를 화면에 표시합니다.
				Tel[] temp = new Tel[50];
				temp = contact.getTels();
				System.out.println("이    름: " + contact.getName());
				System.out.println();
				System.out.println("===연 락 처===");	
				for (int i = 0; i < contact.getTelIndex(); i++) {
					System.out.println("타    입: " + temp[i].getType());
					System.out.println("연 락 처: " + temp[i].getNumber());
					System.out.println();
				}

				System.out.println("====주 소====");
				System.out.println("우편번호: " + address.getZipcode());
				System.out.println("시/도: " + address.getSido());
				System.out.println("구/군: " + address.getGugun());
				System.out.println("나머지주소: " + address.getDetail());
				System.out.println();
			} else if (no == 0) {
				// 프로그램을 종료합니다.
				System.out.println("프로램을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 잘못 선택하셨습니다.");
				System.out.println();
			}
		}
		
		
	}
} 

/*
Database를 대상으로 하는 작업
	Create		- 새 데이터 저장
	Retrieve	- 데이터 조회
	Update		- 데이터 수정
	Delete		- 데이터 삭제

*/