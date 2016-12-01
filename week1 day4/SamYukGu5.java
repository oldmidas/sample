public class SamYukGu5 {
	public static void main(String[] args) {
		
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if (a == 0 && b == 0) {
					continue;
					
				}  else if (b != 0 && b%3 == 0) {
					System.out.println("Clap");

				} else if (a != 0 && a%3 == 0) {
					System.out.println("Clap");

				} else if ((a!=0 && a%3 ==0) && (b!=0 && b%3 ==0)) {
					System.out.println("Clap Clap");

				} else {
					System.out.println(a + "" + b);

				}

			}
		}

	}
}