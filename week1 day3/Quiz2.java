import java.util.*;

public class Quiz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ�
		// 100�� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();
		
		int hundred = number / 100;
		int tenth = (number %= 100) / 10;
		int one = (number %= 10);
		
		// int hundred = number / 100;
		// int tenth = (number - 100*hundred)/10;
		// int one = number - 100*hundred - 10*tenth;

		System.out.println("100�� �ڸ���" + hundred + "\n10�� �ڸ���" + tenth + "\n1�� �ڸ���" + one);

	}
}