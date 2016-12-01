import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 입력받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);

		System.out.println("두자리 숫자를 입력하시오");		
		int twoNum = sc.nextInt();
		int tenth = twoNum / 10;
		int oneth = twoNum % 10;

		if (twoNum > 99) {
			System.out.println("두자리 숫자를 입력하지 않았습니다.");		
		} else if (twoNum < 10) {
			System.out.println("두자리 숫자를 입력하지 않았습니다.");
		} else if (tenth == 0) {
			System.out.print("");
		} else if (tenth == 1) {
			System.out.print("십");
		} else if (tenth == 2) {
			System.out.print("이십");
		} else if (tenth == 3) {
			System.out.print("삼십");
		} else if (tenth == 4) {
			System.out.print("사십");
		} else if (tenth == 5) {
			System.out.print("오십");
		} else if (tenth == 6) {
			System.out.print("육십");
		} else if (tenth == 7) {
			System.out.print("칠십");
		} else if (tenth == 8) {
			System.out.print("팔십");
		} else if (tenth == 9) {
			System.out.print("구십");
		}

		if (twoNum > 99) {
			System.out.println("");		
		} else if (twoNum < 10) {
			System.out.println("");
		} else if (oneth == 0) {
			System.out.println("");
		} else if (oneth == 1) {
			System.out.println("일");
		} else if (oneth == 2) {
			System.out.println("이");
		} else if (oneth == 3) {
			System.out.println("삼");
		} else if (oneth == 4) {
			System.out.println("사");
		} else if (oneth == 5) {
			System.out.println("오");
		} else if (oneth == 6) {
			System.out.println("육");
		} else if (oneth == 7) {
			System.out.println("칠");
		} else if (oneth == 8) {
			System.out.println("팔");
		} else if (oneth == 9) {
			System.out.println("구");
		}
		

	}
}