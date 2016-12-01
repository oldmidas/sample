public class Book2 {
	public static void main(String[] args) {


		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y<=10; y++) {

				if ((4*x) + (5*y) == 60) {
					//System.out.println("(" + x + ", " + y +")");
					System.out.printf("(%d, %d)\n", x, y);
					//System.out.printf("(%2d, %2d)\n", x, y); // 두 칸을 차지해서 글자를 적어라, 오른쪽부터 나열
					//System.out.printf("(%-2d, %-2d)\n", x, y); // 왼쪽부터 나열, 괄호모양은 변경가능(@,1,가나다 등등)
				}
			}
		}


			
	}
}