import java.io.*;

/*
score.txt 파일을 읽어서 성적정보를 화면에 출력하는 프로그램
	1. 학생정보를 담는 Student 클래스 정의하기
	2. StudentApp 정의하기
		- FileReader와 BufferedReader를 사용해서 파일의 내용 읽어오기
		- 읽어온 내용을 ,를 기준으로 자르기
		- 잘라낸 내용을 Student객체를 생성해서 저장하
		  (점수는 숫자로 변환하기: int Integer.parseInt(글자);)
		- Student객체에 저장된 내용을 화면에 표시하기
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

		System.out.printf("이름 : %s | 학년 : %s | 국어 : %d | 영어 : %d | 수학 : %d", name, grade, kor, eng, math);
	}
}