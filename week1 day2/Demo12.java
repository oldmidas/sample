public class Demo12 {
	public static void main(String[] args) {
		// 대입 연산자
		// 연산우선 순위가 가장 낮다.
		// 우변의 값을 좌변에 대입한다.

		int a = 20;
		int b = a;
		System.out.println("a의 값:" + a);
		System.out.println("b의 값:" + b);

		// += -= *= /= %=
		int x = 10;
		x = x + 3;	//x에 값에 3을 더한 값을 다시 x에 대입한다.
		x += 3;		// x에 값을 3만큼 증가시킨다.
		System.out.println("x의 값:" + x);
		
		x = 3;		// x의 값을 3으로 변경시킨다.

		x = x - 3;
		x -= 3;
		System.out.println("x의 값:" + x);
	}
}