import java.util.*;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();

		if (age < 20) {
			System.out.println("�̼������Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}
}