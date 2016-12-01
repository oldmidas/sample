import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		// ������� �Է��� �о���� Scanner ��ü �����ϱ�
		Scanner sc = new Scanner(System.in);
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for (;;) {
			System.out.println("1:���	2:��ȸ	0:����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
			int menuNo = sc.nextInt();

				// �迭�� ����ϱ� 				// �迭�� currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�, currentPosition�� ���� 1������Ų��.
			if (menuNo == 1) {
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
				
				// �迭�� �����ϱ�
				contacts[currentPosition] = contact;
				currentPosition++;

				// �迭�� ����� ��� ����ó ���� ǥ���ϱ� <--enhanced for�� ������� ���� ���� 				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ϸ� �ȴ�.
			} else if (menuNo == 2) {

				for (int i = 0; i < currentPosition; i++) {
					Contact c = contacts[i];

					System.out.println(c.getNo() + " " +  c.getName() + " " +  c.getPhone() + " " +  c.getEmail());
				}


			} else if (menuNo == 0) {
				break;
			}
		}
	}
}