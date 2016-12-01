public class Pyramid2 {
	public static void main(String[] args) {
		int pyramid = 10;
		for (int i = 1; i < pyramid; i++) {
			for (int j = 1; j < pyramid - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i*2) - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		
		for (int i = 1; i < pyramid; i++) {
			for (int j = 1; j < i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (pyramid*2) - ((i*2)+1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
	}
}