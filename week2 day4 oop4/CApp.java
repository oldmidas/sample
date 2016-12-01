public class CApp{
	public static void main(String[] args) throws Exception {
		// Class.forName("전체 클래스이름")
		// 해당 클래스를 찾아서, 클래스(설계도)를 메모리에 로딩시켜주는 실행문
		Class.forName("C");	// ----> 초기화 블록이 실행됨.

		C c1 = new C();
		C c2 = new C();
		C c3 = new C();


	} 
}