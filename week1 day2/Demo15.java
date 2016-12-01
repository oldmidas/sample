public class Demo15 {
	public static void main(String[] args) {
		// 비교 연산자
		// 비교 연산자의 연산결과는 항상 true, false 값 중에 하나이다.
		int x = 30;
		int y = 29;

		boolean z = (x > y);
		System.out.println("z의 값은 " + z);

		z = (x == y);
		System.out.println("z의 값은 " + z);

		z = (x != y);
		System.out.println("z의 값은 " + z);

	}
}