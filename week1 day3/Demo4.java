public class Demo4 {
	public static void main(String[] args) {
		// "비트 논리 연산자"
		// 비트로 변환 후, 
		// & = 둘다 1일 경우 1을 표시,  | = 둘 중 하나라도 1일 경우 1을 표시, ^ 두개의 값이 다를경우 1을 표시한다.
		// ~ 은 비트로 변환 후 보수(0을 1로, 1을 0으로)한다.
		int a = 3;
		int b = 5;

		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);

		// "비트 이동 연산자"
		// 비트로 변환후,
		// <<는 왼쪽으로 이동
		// >>는 오른쪽으로 이동(빈칸은 부호비트와 같은 값으로 채워진다, -의경우 1로/ +의 경우는 0으로)
		// >>>는 오른쪽으로 이동(부호비트와 상관없이 0으로 채워진다)
		int c = -4;

		System.out.println(c << 2);
		System.out.println(c >> 2);	
		System.out.println(c >>> 2);

	}
}


