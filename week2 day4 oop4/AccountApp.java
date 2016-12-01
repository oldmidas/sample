import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

		for ( ; ; ) {

			System.out.println("1.��� 2.��ȸ 3.��й�ȣ ���� 4.�Ա� 5.��� 0.����");
			System.out.println("�޴��� �����ϼ��� > ");

			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.println("�̸��� �Է��ϼ���> ");
				String name = sc.next();
				ac.setName(name);

				System.out.println("��й�ȣ�� �Է��ϼ���> ");
				int password = sc.nextInt();
				ac.setPassword(password);

				System.out.println("�Աݾ��� �Է��ϼ���> ");
				int money = sc.nextInt();
				
				if (money < 0) {
					System.out.println("�ּ� �Աݾ��� 0�� �Դϴ�. ");
				} else {
					ac.setBalance(money);
				}
				
				ac.setAccountNo("111-22-3333");
				System.out.println("���°� �����Ǿ����ϴ�. �� ���¹�ȣ : " + ac.getAccountNo());

			} else if (menuNo == 2) {
				System.out.printf("%s %s %d\n", ac.getName(), ac.getAccountNo(), ac.getBalance());
			
			} else if (menuNo == 3) {
				System.out.println("���� ��й�ȣ�� �Է��ϼ���> ");
				int password = sc.nextInt();
				if (ac.getPassword() != password) {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				} else {
					System.out.println("������ ��й�ȣ�� �Է��ϼ���> ");
					int newPassword = sc.nextInt();
					ac.setPassword(newPassword);
					System.out.println("��й�ȣ�� ����Ǿ����ϴ�.");
				}
			
			} else if (menuNo == 4) {
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
				int money = sc.nextInt();
				
				if (money < 0) {
					System.out.println("�ּ� �Աݾ��� 0�� �Դϴ�. ");				
				} else {
					ac.setBalance(ac.getBalance() + money);
					System.out.println(money + "�� �ԱݵǾ����ϴ�. ");				
				}
					
			} else if (menuNo == 5) {
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				int money = sc.nextInt();
				
				if (money > ac.getBalance()) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else {
					ac.setBalance(ac.getBalance() - money);
					System.out.println(money + "�� ��޵Ǿ����ϴ�.\n�ܾ�: " + ac.getBalance());
				}
			
			} else if (menuNo == 0) {
				break;
			
			} else {
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
			}

			
		}
	}
	
}