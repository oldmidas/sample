import java.util.Scanner;

public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact ��ü�� ���޹޾Ƽ� �迭�� �����ϱ�
	public void addContact(Contact contact) {
		contacts[currentPosition] = contact;
		currentPosition++;
	}

	// contacts�� �迭�� ����� ��� ����ó���� ǥ���ϱ�
	public void displayContact() {
		for (int i = 0; i < currentPosition; i++) {
			System.out.println(contacts[i].getNo() + "  " + contacts[i].getName() + "  " + contacts[i].getPhone() + "  " + contacts[i].getEmail());
				}
	}
}