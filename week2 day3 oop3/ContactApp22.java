import java.util.Scanner;

public class ContactApp22 {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		ContactMgr mgr = new ContactMgr();
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1:���	2:��ȸ	0:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// �迭�� ����ϱ�
				// mgr�� addContact(Contact contact) �޼ҵ忡 ����� Contact ��ü ����
				// ����ó ���� �Է¹ޱ�
				System.out.print("��ȣ�� �Է��ϼ���: ");
				int no = sc.nextInt();

				System.out.print("�̸��� �Է��ϼ���: ");
				String name = sc.next();

				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				String phone = sc.next();

				System.out.print("�̸����� �Է��ϼ���: ");
				String email = sc.next();
				
				//Contact ��ü �����ϰ�,���� ���
				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);
				
				mgr.addContact(contact);

			} else if (menuNo == 2) {
				// mgr�� displayContact()�� �����Ű��
				mgr.displayContact();
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}