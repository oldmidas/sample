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

				// �迭�� ����� ��� ����ó ���� ǥ���ϱ� <--enhanced for�� ������� ���� ���� 				// �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ϸ� �ȴ�.
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