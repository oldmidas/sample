public class Demo3 {
	public static void main (String[] args) {
		//논리 자료형 - Boolean 값을 담는 데이터 타입
		boolean b1 = true;
		boolean b2 = false;

		boolean b3 = 5 > 3;
		boolean b4 = 5 < 3;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		//오류
		boolean b5 = "true";	//"true"라는 글자(텍스트)를 담을 수는 없다.

	}
}