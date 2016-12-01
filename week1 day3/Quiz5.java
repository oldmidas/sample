import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// 국어 영어 수학 점수를 받아서
		// 총점, 평균, 학점을출력하기
		// 90-A 80-B 70-C 60-D 그외-F
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;
		String grade;

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";		
		}

		System.out.println("총점: " + total + "\n평균: " + avg + "\n학점: " + grade);
	}
}