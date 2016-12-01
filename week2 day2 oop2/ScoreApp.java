public class ScoreApp {
	public static void main(String[] args) {
		Score s = new Score();

		s.name = "È«±æµ¿";
		s.kor = 100;
		s.eng = 90;
		s.math = 70;

		int total = s.total();
		double avg = s.average();

		System.out.println("ÀÌ  ¸§ : " + s.name);
		System.out.println("ÃÑ  Á¡ : " + total);
		System.out.println("Æò  ±Õ : " + avg);

	}
}