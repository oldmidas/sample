public class ScoreApp3 {
	public static void main(String[] args) {
		Score s = new Score("±Ë¿ØΩ≈", 40, 50, 60);

		int total = s.total();
		double avg = s.average();

		System.out.println("¿Ã    ∏ß : " + s.name);
		System.out.println("∆Ú    ±’ : " + avg);
		System.out.println("√—    ¡° : " + total);

	}
}