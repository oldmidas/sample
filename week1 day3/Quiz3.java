import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// ������ ���ڸ� �޾Ƽ�
		// Ȧ�� ¦�� �ǰ����ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");		
		int num = sc.nextInt();
		int oddEven = num % 2;
		if (num == 0) {
			System.out.println("0�� ������ ���ڸ� �Է��Ͻÿ�");		
		} else {
		String result1 = (oddEven == 0) ? "¦��" : "Ȧ��";
		System.out.println(result1);
		}

	}
}