public class Demo9 {
	public static void main(String[] args) {
		// 수동(강제) 형변환
		int a = (int)3.14; //자료의 손실이 발생하지만 정수로 변환하라.
		System.out.println(a);

		double b = (double) 10; //자동으로 바뀌지만 직접 적어도 상관없다.
		System.out.println(b);
		
		System.out.println((double) a);
		System.out.println((double) 24);

		System.out.println((char) 65);
		System.out.println((char) 66);

		System.out.println((int) 'A');
		System.out.println((int) 'B');

		// ※오류
		// int x = (int) "123";
	}
}