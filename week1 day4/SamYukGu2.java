public class SamYukGu2 {
	public static void main(String[] args) {
		
		for (int a = 0; a < 10; a ++) {
			for (int b = 1; b < 10; b ++) {

				if (a == 0 && !(b%3 == 0)) {
					System.out.print(a);
					System.out.println(b);
				} else if (a == 0 && b%3 == 0) {
					System.out.println("clap!");
				} else if (a%3 == 0){
					System.out.println("clap!");
				} else if (b%3 == 0) {
					System.out.println("clap!");
				} else if (a%3 == 0 && b%3 == 0) {
					System.out.println("clap, clap!");
				} else {
					System.out.print(a);
					System.out.println(b);
				}
				
			}
			
		}
	}
}