public class FinalDemo1 {
	public static void main(String[] args) {
		final int x = 10;

		System.out.println("x값 : " + x);

		//x = 20;	//final로 정의한 변수는 값을 변경할 수 없다.
		//System.out.println("변경된 x값 : " + x);
	}
}