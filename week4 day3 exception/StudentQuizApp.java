import java.io.*;

public class StudentQuizApp {
	public static StudentQuiz parseData(String data) {
		String[] arr = data.split(",");
		StudentQuiz student = new StudentQuiz(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));

		return student;
	}

	public static void main(String[] args) throws Exception {
		StudentQuiz[] students = new StudentQuiz[10];
		BufferedReader reader = new BufferedReader(new FileReader("ScoreQuiz.txt"));
		
		for (int i = 0; i < students.length; i++) {
			students[i] = parseData(reader.readLine());
		}

		System.out.println("이름	학년	국어	영어	수학	총점	평균");
		for (StudentQuiz s : students) {
			System.out.printf("%s	%s	%d		%d		%d		%d		%2.2f\n", s.getName(),s.getGrade(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		}

	}
}