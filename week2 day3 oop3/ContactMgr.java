import java.util.Scanner;

public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact 객체를 전달받아서 배열에 저장하기
	public void addContact(Contact contact) {
		Scanner sc = new Scanner(System.in);
		contacts[currentPosition] = new Contact();

		System.out.print("번호을 입력하세요: ");
		contacts[currentPosition].setNo(sc.nextInt());

		System.out.print("이름을 입력하세요: ");
		contacts[currentPosition].setName(sc.next());

		System.out.print("전화번호를 입력하세요: ");
		contacts[currentPosition].setPhone(sc.next());

		System.out.print("이메일을 입력하세요: ");
		contacts[currentPosition].setEmail(sc.next());

		currentPosition++;
	}

	// contacts의 배열에 저장된 모든 연락처정보 표시하기
	public void displayContact() {
		for (int i = 0; i < currentPosition; i++) {
			System.out.println(contacts[i].getNo() + "  " + contacts[i].getName() + "  " + contacts[i].getPhone() + "  " + contacts[i].getEmail());
				}
	}
}