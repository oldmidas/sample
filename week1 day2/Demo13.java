public class Demo13 {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		// 0으로 나누는 나눗셈을 하면 오류가 발생한다.
		// 아래의 코드는 컴파일은 되지만, 실행시 오류가 발생한다.
		int z = x / y;
		System.out.println("z의 값:" + z); 
	}
}