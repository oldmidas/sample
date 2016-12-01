public class C {

	int x;
	static int y;

	// static initialization block
	// 정적변수의 초기화 작업에 필요한 수행문(running command line)을 적는다
	// 주로 프로그램 실행에 사용되는 외부 리소스 연결작업을 구현한다.
	static {
		System.out.println("초기화 블록이 실행됨");
		// static variables & static methods are usable.
	}

	public C() {
		System.out.println("생성자가 실행됨");		
	}

}