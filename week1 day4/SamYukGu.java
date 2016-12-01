public class SamYukGu {
	public static void main(String[] args) {
		
		for (int a = 0; a < 10; a ++) {
			for (int b = 1; b < 10; b ++) {
				int clap1 = (a*10)%3;
				int clap2 = (b*10)%3;

				if (clap1 == 0) {
					System.out.println("clap");
				} else if (clap2 == 0) {
					System.out.println("clap");
				} else if (clap1 == 0 && clap2 == 0) {
					System.out.println("clap");
				} else {
					System.out.print(a);
					System.out.println(b);
				}
			
			}
		}
	}
}
