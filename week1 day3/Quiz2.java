import java.util.*;

public class Quiz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서
		// 100의 자리 숫자
		// 10의 자리 숫자
		// 1의 자리 숫자를 각각 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = sc.nextInt();
		
		int hundred = number / 100;
		int tenth = (number %= 100) / 10;
		int one = (number %= 10);
		
		// int hundred = number / 100;
		// int tenth = (number - 100*hundred)/10;
		// int one = number - 100*hundred - 10*tenth;

		System.out.println("100의 자리는" + hundred + "\n10의 자리는" + tenth + "\n1의 자리는" + one);

	}
}