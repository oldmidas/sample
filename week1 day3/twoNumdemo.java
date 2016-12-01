import java.util.Scanner;

public class twoNumdemo {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		String[] names = {"", "일","이","삼","사","오","육","칠","팔","구"};
		
		Scanner sc = new Scanner(System.in);


		System.out.println("두자리 숫자를 입력하시오");		
		int num = sc.nextInt();
		int sip = num / 10;
		int il = num % 10;

		String hangul = names[sip] + "십" + names[il];
		System.out.println(hangul);		
	}
}