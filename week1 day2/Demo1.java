public class Demo1 {
	public static void main(String[] args) {
		//정수 타입
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128;			 byte 자료형의 범위(-128 ~ 127)를 벗어난 값은 오류를 발생시킨다.

		int a1 = 128;
		int a2 = -128;
		int a3 = 10000;

		long c1 = 10000;
		// 숫자의 범위가 int의 범위를 벗어나는 값일 경우, 반드시 숫자끝에 L을 표시해야 한다.
		long c2 = 100000000000L;
		
		int m1 = 10;  //10진수
		int m2 = 012; //맨 앞이 0으로 시작하는 숫자는 8진수
		int m3 = 0xA; //맨 앞이 0x로 시작하는 숫자는 2진수

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// java7부터 숫자를 적을 때 자릿수를 표현하기 위해서 _(언더바) 사용이 가능하다.
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4 * m5);

	}
}