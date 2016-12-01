import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 국어, 영어, 수학점수를 입력받아서
		// 총합과 평균을 계산하기
		System.out.print("국어점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요:");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요:");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;
		System.out.println("총합 : " + total + "\n평균 : " + avg);

	}
}