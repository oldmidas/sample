import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		// ������� �����ϴ� ArrayList�����
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("�ڹ�");
		subjects.add("�ڹٽ�ũ��Ʈ");
		subjects.add("SQL");
		subjects.add("SQL");
		subjects.add("�ϵ�");
		subjects.add("SQL");

		subjects.remove("SQL");
		subjects.remove("SQL");
		subjects.remove("SQL"); // 3���� add�߱⶧���� 3�� �������Ѵ�.


		subjects.add("SQL");
		subjects.remove(3);


		System.out.println(subjects);

	}
}