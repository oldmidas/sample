import java.util.Scanner;

public class ContactApp22 {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		ContactMgr mgr = new ContactMgr();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1:등록	2:조회	0:종료");
			System.out.print("메뉴 번호를 입력하세요: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				// mgr의 addContact(Contact contact) 메소드에 등록할 Contact 객체 전달
				// 연락처 정보 입력받기
				System.out.print("번호을 입력하세요: ");
				int no = sc.nextInt();

				System.out.print("이름을 입력하세요: ");
				String name = sc.next();

				System.out.print("전화번호를 입력하세요: ");
				String phone = sc.next();

				System.out.print("이메일을 입력하세요: ");
				String email = sc.next();
				
				//Contact 객체 생성하고,값을 담기
				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);
				
				mgr.addContact(contact);

			} else if (menuNo == 2) {
				// mgr의 displayContact()를 실행시키기
				mgr.displayContact();
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}