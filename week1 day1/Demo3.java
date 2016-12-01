public class Demo3 {
	public static void main(String[] args) {

		//정수를 담는 int type 타입의 그릇를 만들고, 30을 대입해라
		int a = 30;
		int b = 40;

		//화면에 a라는 변수(이름을 가진 저장소)에 들어있는 값을 출력해라
		System.out.println(a);
		//화면에 b라는 변수(이름을 가진 저장소)에 들어있는 값을 출력해라
		System.out.println(b);
		
		//화면에 a라는 텍스트(문자열)를 출력해라
		System.out.println("a");
				

		System.out.println(a + b);
		//a라는 값을 30에서 50으로 변경한다
		
		//a저장소에는 정수 외의 값을 담을 수 없다.
		a = 50;

		//a저장소에는 정수 외의 값을 담을 수 없다.
		//아래 코드는 에러다.
		a = "가"


	}
}