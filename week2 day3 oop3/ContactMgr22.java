import java.util.Scanner;

public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact 객체를 전달받아서 배열에 저장하기
	public void addContact(Contact contact) {
		contacts[currentPosition] = contact;
		currentPosition++;
	}

	// contacts의 배열에 저장된 모든 연락처정보 표시하기
	public void displayContact() {
		for (int i = 0; i < currentPosition; i++) {
			System.out.println(contacts[i].getNo() + "  " + contacts[i].getName() + "  " + contacts[i].getPhone() + "  " + contacts[i].getEmail());
				}
	}
}