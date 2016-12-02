import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		// 과목명을 저장하는 ArrayList만들기
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("자바");
		subjects.add("자바스크립트");
		subjects.add("SQL");
		subjects.add("SQL");
		subjects.add("하둡");
		subjects.add("SQL");

		subjects.remove("SQL");
		subjects.remove("SQL");
		subjects.remove("SQL"); // 3개를 add했기때문에 3번 지워야한다.


		subjects.add("SQL");
		subjects.remove(3);


		System.out.println(subjects);

	}
}