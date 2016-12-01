public class Demo4 {
	public static void main(String[] args) {
		// 문자 타입 - 한 글자를 저장하는 자료형
		
		char c1 = 'A';
		char c2 = 65;			//유니코드 숫자
		char c3 = '\u0041';		//유니코드 16진수

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// 한 글자가 넘어서 에러
		// char c4 = 'AB'; 글자 두개를 저장할 수 없다.
	}
}