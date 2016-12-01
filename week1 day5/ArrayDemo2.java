public class ArrayDemo2 {
	public static void main(String[] args) {
		//배열 생성하기
		// int[] arr1 = {1, 3, 6};	  <-- 값을 가지고 있는 배열 생성
		// int[] arr2 = new int[3];	  <-- 값을 3개 담을 수 있는 배열 생성, 정수형 배열의 기본값인 '0'으로 채워져 있다.

		// #빈 배열의 경우(heap 영역),
		// ________________________________________________________________________________________
		// |정수형은 0 | 실수형은 0.0 | 문자형(char)은 \u0000 | boolean형은 false | 참조형은 null |
		// ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣
		// 으로 각 각 채워진다.
		int[] integers = new int[3];
		System.out.println("정수값: " + integers[0]);
		System.out.println("정수값: " + integers[1]);
		System.out.println("정수값: " + integers[2]);
		System.out.println(integers);
		

		String[] strings = new String[3];
		System.out.println("참조값: " + strings[0]);
		System.out.println("참조값: " + strings[1]);
		System.out.println("참조값: " + strings[2]);
		System.out.println(strings);
		

		double[] doubles = new double[3];
		System.out.println("실수값: " + doubles[0]);
		System.out.println("실수값: " + doubles[1]);
		System.out.println("실수값: " + doubles[2]);


		boolean[] booleans = new boolean[3];
		System.out.println("불린값: " + booleans[0]);
		System.out.println("불린값: " + booleans[1]);
		System.out.println("불린값: " + booleans[2]);


		char[] characters = new char[3];
		System.out.println("문자값: " + characters[0]);
		System.out.println("문자값: " + characters[1]);
		System.out.println("문자값: " + characters[2]);

		

	}
}