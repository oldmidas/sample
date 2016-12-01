public class Pyramid2{
	public static void main (String[] args) {
		int pyramid = 11;
		for (int i = 1; i < pyramid; i++) {
			for (int j = 1; j < pyramid - i; j++ ) {
			System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}
}