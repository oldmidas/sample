import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ���.");
		int age = scanner.nextInt();

		String calling = (age > 19) ? "�����Դϴ�." : "�л��Դϴ�.";
		System.out.println(calling);

	}
}