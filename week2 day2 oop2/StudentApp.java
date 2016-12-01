import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Student a = new Student(1, "홍길동", 90, 100, 90);


		int total1 = a.total();
		double avg1 = a.avg();

		System.out.println(a.name + "의 총점 : " + total1);
		System.out.println(a.name + "의 평균 : " + avg1);

		a.info();


		Student b = new Student();
		
		b.no = 10;
		b.name = "김유신";
		b.kor = 90;
		b.eng = 90;
		b.math = 95;

		int total2 = b.total();
		double avg2 = b.avg();

		System.out.println(b.name + "의 총점 : " + total2);
		System.out.println(b.name + "의 평균 : " + avg2);

		b.info();

		Student c = new Student();
		Scanner sc = new Scanner(System.in);

		c.name = "최영";
		System.out.println("학번을 입력하세요.");
		c.no = sc.nextInt();
		System.out.println("국어점수를 입력하세요.");
		c.kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		c.eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		c.math = sc.nextInt();
		
		int total3 = c.total();
		double avg3 = c.avg();

		System.out.println(c.name + "의 총점 : " + total3);
		System.out.println(c.name + "의 평균 : " + avg3);

		c.info();

		
	}
}