import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Student a = new Student(1, "ȫ�浿", 90, 100, 90);


		int total1 = a.total();
		double avg1 = a.avg();

		System.out.println(a.name + "�� ���� : " + total1);
		System.out.println(a.name + "�� ��� : " + avg1);

		a.info();


		Student b = new Student();
		
		b.no = 10;
		b.name = "������";
		b.kor = 90;
		b.eng = 90;
		b.math = 95;

		int total2 = b.total();
		double avg2 = b.avg();

		System.out.println(b.name + "�� ���� : " + total2);
		System.out.println(b.name + "�� ��� : " + avg2);

		b.info();

		Student c = new Student();
		Scanner sc = new Scanner(System.in);

		c.name = "�ֿ�";
		System.out.println("�й��� �Է��ϼ���.");
		c.no = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		c.kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		c.eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		c.math = sc.nextInt();
		
		int total3 = c.total();
		double avg3 = c.avg();

		System.out.println(c.name + "�� ���� : " + total3);
		System.out.println(c.name + "�� ��� : " + avg3);

		c.info();

		
	}
}