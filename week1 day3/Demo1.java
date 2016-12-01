public class Demo1 {
	public static void main(String[] args) {
		//논리 연산자
		int x = 10;
		int y = 10;

		boolean result1 = false && x++ > 10; // &&를 사용했기 때문에, 앞에가 false라서 뒤 x++이 실행이 되지 않았다.
		boolean result2 = false &  y++ > 10; // &를 사용했기 때문에, 앞에가 false지만 뒤 x++도 실행을 해본다.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x:" + x); // 결과 10
		System.out.println("y:" + y); // 결과 11
	}
}