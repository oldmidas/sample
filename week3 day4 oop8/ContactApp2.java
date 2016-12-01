import java.util.Scanner;
public class ContactApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address address = new Address();


		for(;;) {
			System.out.println("1.�̸����/���� 2.��ȭ��ȣ��� 3.�ּҵ��/���� 4.��ȸ 0.����");
			System.out.print("�޴��� �����ϼ���: ");
			int no = sc.nextInt();
			if (no == 1) {
				System.out.print("�̸��� �Է��ϼ���: ");
				// �̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
				contact.setName(sc.next());
				System.out.println();

			} else if (no == 2) {
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
					Tel tel = new Tel();
					System.out.print("Ÿ���� �Է��ϼ���: ");
					tel.setType(sc.next());
					System.out.print("��ȣ�� �Է��ϼ���: ");
					tel.setNumber(sc.next());
					System.out.println();

				// Tel��ü�� ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� addTel(Tel tel)���� Tel ��ü �����ؼ� �迭�� ���
					contact.addTel(tel);

			} else if (no == 3) {
				// �ּ� ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				System.out.print("�����ȣ�� �Է��ϼ���: ");
				address.setZipcode(sc.next());
				System.out.print("��/���� �Է��ϼ���: ");
				address.setSido(sc.next());
				System.out.print("��/���� �Է��ϼ���: ");
				address.setGugun(sc.next());
				System.out.print("������ �ּҸ� �Է��ϼ���: ");
				address.setDetail(sc.next());
				// Address ��ü���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� setter�̿��ؼ� ����
				contact.setAddress(address);
				System.out.println();
			} else if (no == 4) {
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
				Tel[] temp = new Tel[50];
				temp = contact.getTels();
				System.out.println("��    ��: " + contact.getName());
				System.out.println();
				System.out.println("===�� �� ó===");	
				for (int i = 0; i < contact.getTelIndex(); i++) {
					System.out.println("Ÿ    ��: " + temp[i].getType());
					System.out.println("�� �� ó: " + temp[i].getNumber());
					System.out.println();
				}

				System.out.println("====�� ��====");
				System.out.println("�����ȣ: " + address.getZipcode());
				System.out.println("��/��: " + address.getSido());
				System.out.println("��/��: " + address.getGugun());
				System.out.println("�������ּ�: " + address.getDetail());
				System.out.println();
			} else if (no == 0) {
				// ���α׷��� �����մϴ�.
				System.out.println("���η��� �����մϴ�.");
				break;
			} else {
				System.out.println("��ȣ�� �߸� �����ϼ̽��ϴ�.");
				System.out.println();
			}
		}
		
		
	}
} 

/*
Database�� ������� �ϴ� �۾�
	Create		- �� ������ ����
	Retrieve	- ������ ��ȸ
	Update		- ������ ����
	Delete		- ������ ����

*/