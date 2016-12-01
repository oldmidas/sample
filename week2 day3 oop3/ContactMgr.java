import java.util.Scanner;

public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact ��ü�� ���޹޾Ƽ� �迭�� �����ϱ�
	public void addContact(Contact contact) {
		Scanner sc = new Scanner(System.in);
		contacts[currentPosition] = new Contact();

		System.out.print("��ȣ�� �Է��ϼ���: ");
		contacts[currentPosition].setNo(sc.nextInt());

		System.out.print("�̸��� �Է��ϼ���: ");
		contacts[currentPosition].setName(sc.next());

		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		contacts[currentPosition].setPhone(sc.next());

		System.out.print("�̸����� �Է��ϼ���: ");
		contacts[currentPosition].setEmail(sc.next());

		currentPosition++;
	}

	// contacts�� �迭�� ����� ��� ����ó���� ǥ���ϱ�
	public void displayContact() {
		for (int i = 0; i < currentPosition; i++) {
			System.out.println(contacts[i].getNo() + "  " + contacts[i].getName() + "  " + contacts[i].getPhone() + "  " + contacts[i].getEmail());
				}
	}
}