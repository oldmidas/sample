import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("1:등록	2:조회	0:종료");
			System.out.print("메뉴 번호를 입력하세요: ");
			int menuNo = sc.nextInt();

				// 배열에 등록하기 				// 배열에 currentPosition이 가르키는 위치에 Contact를 저장하고, currentPosition의 값을 1증가시킨다.
			if (menuNo == 1) {
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

				// 배열에 저장된 모든 연락처 정보 표시하기 <--enhanced for문 사용하지 말고 구현 				// 배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복하면 된다.
			} else if (menuNo == 2) {

				for (int i = 0; i < currentPosition; i++) {
					System.out.println(contacts[i].getNo() + "  " + contacts[i].getName() + "  " + contacts[i].getPhone() + "  " + contacts[i].getEmail());
				}


			} else if (menuNo == 0) {
				break;
			}
		}
	}
}