import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		ContactMgr contact = new ContactMgr();
		Contact originalContact = new Contact();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1:���	2:��ȸ	0:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// mgr�� addContact(Contact contact) �޼ҵ忡 ����� Contact ��ü ����
				contact.addContact(originalContact);
				

			} else if (menuNo == 2) {
				// mgr�� displayContact()�� �����Ű��
				contact.displayContact();
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}