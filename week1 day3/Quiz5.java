import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		// ���� ���� ���� ������ �޾Ƽ�
		// ����, ���, ����������ϱ�
		// 90-A 80-B 70-C 60-D �׿�-F
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ������ �Է��ϼ���.");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
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

		System.out.println("����: " + total + "\n���: " + avg + "\n����: " + grade);
	}
}