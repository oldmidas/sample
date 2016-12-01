import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 임의의 숫자를 받아서
		// 홀수 짝수 판가름하기

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");		
		int num = sc.nextInt();
		int oddEven = num % 2;
		if (num == 0) {
			System.out.println("0을 제외한 숫자를 입력하시오");		
		} else {
		String result1 = (oddEven == 0) ? "짝수" : "홀수";
		System.out.println(result1);
		}

	}
}