import java.io.*;

/*
score.txt ������ �о ���������� ȭ�鿡 ����ϴ� ���α׷�
	1. �л������� ��� Student Ŭ���� �����ϱ�
	2. StudentApp �����ϱ�
		- FileReader�� BufferedReader�� ����ؼ� ������ ���� �о����
		- �о�� ������ ,�� �������� �ڸ���
		- �߶� ������ Student��ü�� �����ؼ� ������
		  (������ ���ڷ� ��ȯ�ϱ�: int Integer.parseInt(����);)
		- Student��ü�� ����� ������ ȭ�鿡 ǥ���ϱ�
*/

public class StudentApp {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("Score.txt"));
		String text = reader.readLine();
		String[] arr = text.split(",");
		int kor = Integer.parseInt(arr[2]);
		int eng = Integer.parseInt(arr[3]);
		int math = Integer.parseInt(arr[4]);

		Student student = new Student(arr[0], arr[1], kor, eng, math);

		String name = student.getName();
		String grade = student.getGrade();
		kor = student.getKor();
		eng = student.getEng();
		math = student.getMath();

		System.out.printf("�̸� : %s | �г� : %s | ���� : %d | ���� : %d | ���� : %d", name, grade, kor, eng, math);
	}
}