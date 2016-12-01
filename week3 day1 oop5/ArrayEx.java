public class ArrayEx {
	public static void main(String[] args) {
		ArrayService as = new ArrayService();
		int[] answer1 = as.move(8);
		int[] answer2 = as.copy(6);
		int[] answer3 = as.cut(3, 5);

		
		for (int a : answer1) {
			System.out.println(a);
		}
		
		
		for (int a : answer2) {
			System.out.println(a);
		}
		
		for (int a : answer3) {
			System.out.println(a);
		}
	}
}