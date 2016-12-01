public class Samyukgu {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if ((i%10 == 3) || (i%10 == 6) || (i%10 == 9)) {
					if (((i/10)%10 == 3) || ((i/10)%10 == 6) || ((i/10)%10 == 9)) {
						System.out.println("clap clap");
						continue;
					}				
				System.out.println("clap");
				continue;
			}
			if (((i/10)%10 == 3) || ((i/10)%10 == 6) || ((i/10)%10 == 9)) {
				System.out.println("clap");
				continue;
			}
			System.out.println(i);

		}
	}
}