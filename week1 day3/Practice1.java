import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("나이를 입력하세요.");
		int age = scanner.nextInt();

		String calling = (age > 19) ? "성인입니다." : "학생입니다.";
		System.out.println(calling);

	}
}