public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void m2() {
		//System.out.println(x); // static method는 object를 생성하지 않고도 사용이 가능하기 때문에 객체가 꼭 필요한 x variable를 담은 static method를 만들 수 없다. 그러므로 error.
		// this.variable_name 형식도 사용이 불가능하다
		System.out.println(y);	// 반면 object가 필요없는 static variable인 y는 static method에서 사용이 가능하다.
	}

	public void m3() {
		m1();
		m2();
	}

	public static void m4() {
		//m1(); // m1()은 Object의 member variable이기 때문에, Object가 생성할때만 사용이 가능하므로, static method인 m4()에서 사용 할 수 없다. 그러므로 error.
		m2(); // 반면 m2() method는 static 이므로, 객체가 없어도 사용이 가능하기 때문에 error가 나지 않는다
	}

}  