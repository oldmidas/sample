import java.util.Scanner;
	
public class IfDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��� �Ⱓ�� �Է��ϼ���(��):");
		int year = sc.nextInt();
		System.out.println("����Ÿ��� �Է��ϼ���(km):");
		int distance = sc.nextInt();

		// ��� �Ⱓ�� 5�� �̻��̰ų� ���� �Ÿ��� 100000km �̻��̸�
		// '����������'�̰�, �� ���� ���� '����������'�Դϴ�.

		if (year >= 5 || distance >= 100000) {
			System.out.println("���������� �Դϴ�.");
		} else {
			System.out.println("���������� �Դϴ�.");
			}
	}
}