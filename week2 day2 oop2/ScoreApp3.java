public class ScoreApp3 {
	public static void main(String[] args) {
		Score s = new Score("������", 40, 50, 60);

		int total = s.total();
		double avg = s.average();

		System.out.println("��    �� : " + s.name);
		System.out.println("��    �� : " + avg);
		System.out.println("��    �� : " + total);

	}
}