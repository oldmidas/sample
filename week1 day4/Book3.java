import java.util.Scanner;

public class Book3 {
	public static void main(String[] args) {

		
		// 1. �Ա� | 2. ��� | 3. ��ȸ | 4. ����
		// 1. �ܾ��� ������Ų��.
		// 2. �ܾ��� ���ҽ�Ų��.
		// 3. �ܾ��� ǥ���Ѵ�.
		// 4. ���α׷��� �����Ѵ�.


		Scanner sc = new Scanner(System.in);

		int balance = 0;

		for ( ; ; ) {
			System.out.println("-------------------------------------");
			System.out.println("1. �Ա� | 2. ��� | 3. ��ȸ | 4. ����");
			System.out.println("-------------------------------------");
			System.out.println("����> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("���ݾ�> ");
				int deposit = sc.nextInt();
				balance = balance + deposit;

			} else if (choice == 2) {
				System.out.println("��ݾ�> ");
				int withrawl = sc.nextInt();

				if (withrawl > balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else {
					balance = balance - withrawl;
				}

			} else if (choice == 3) {
				System.out.println("�ܰ��> " + balance);

			} else if (choice == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;

			} else {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �����ϼ���.");
			}
		}
	}
}