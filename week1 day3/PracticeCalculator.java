import java.util.Scanner;

public class PracticeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ���ڸ� �Է��ϼ���.");
		long a = scanner.nextLong();

		System.out.println("�� ���ڸ� �Է��ϼ���.");
		long b = scanner.nextLong();

		System.out.println("1:���ϱ�  2:����  3:���ϱ�  4:������");
		int choice = scanner.nextInt();
		
	
		if (choice == 1) {
			long c = a + b;	
			System.out.println(a + "+" + b + "��(��)" + c + "�Դϴ�");
		} else if (choice == 2) {
			long c = a - b;
			System.out.println(a + "-" + b + "��(��)" + c + "�Դϴ�");
		} else if (choice == 3) {
			long c = a * b;
			System.out.println(a + "*" + b + "��(��)" + c + "�Դϴ�");
		} else if (choice == 4) {
			if (b == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} else {
				double c = (double)a / (double)b;
				System.out.println(a + "/" + b + "��(��)" + c + "�Դϴ�");
			}
		} 

		System.out.println("���⸦ �����մϴ�.");


	}
}