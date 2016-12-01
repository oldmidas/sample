public class ForDemo5 {
	public static void main(String[] args) {
		for (int a = 0; a < 10; a ++) {
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i == 5) {
					break;
				}
			}
		}
	}
}