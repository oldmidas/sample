public class ScoreApp {
	public static void main(String[] args) {
		Score s = new Score();

		s.name = "ȫ�浿";
		s.kor = 100;
		s.eng = 90;
		s.math = 70;

		int total = s.total();
		double avg = s.average();

		System.out.println("��  �� : " + s.name);
		System.out.println("��  �� : " + total);
		System.out.println("��  �� : " + avg);

	}
}