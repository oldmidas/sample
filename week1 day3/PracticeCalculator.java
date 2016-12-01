import java.util.Scanner;

public class PracticeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("앞 숫자를 입력하세요.");
		long a = scanner.nextLong();

		System.out.println("뒷 숫자를 입력하세요.");
		long b = scanner.nextLong();

		System.out.println("1:더하기  2:빼기  3:곱하기  4:나누기");
		int choice = scanner.nextInt();
		
	
		if (choice == 1) {
			long c = a + b;	
			System.out.println(a + "+" + b + "은(는)" + c + "입니다");
		} else if (choice == 2) {
			long c = a - b;
			System.out.println(a + "-" + b + "은(는)" + c + "입니다");
		} else if (choice == 3) {
			long c = a * b;
			System.out.println(a + "*" + b + "은(는)" + c + "입니다");
		} else if (choice == 4) {
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				double c = (double)a / (double)b;
				System.out.println(a + "/" + b + "은(는)" + c + "입니다");
			}
		} 

		System.out.println("계산기를 종료합니다.");


	}
}