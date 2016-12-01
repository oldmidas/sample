public class Aapp {
	public static void main(String[] args) {

		// System.out.println(A.x);  // 에러이다, x는 static 변수가 아니기 때문에 객체(A A = new A();)를 불러와야만 사용할 수 있다.


		System.out.println(A.y); //static 멤버는 클래스명.변수 클래스명.메소드() 형식으로 사용. 바로 사용 가능하다.

		// 정적(static) 변수 y에 값 할당하기
		// A클래스를 사용해서 만든 모든 객체는 정적변수 y값을 공유한다.
		A.y = 0;

		


		// A를 사용해 만들어진 a1,a2,a3 객체들은 정적(static)변수인 y의 값을 공유! 하지만 x는 객체마다 다른 값을 가지고 있다.
		// y값이 출력되기는 하지만, y값을 멤버변수로 오해할 수 있다. 그래서 a1.y같은 방식으로는 적지 않는 것이 좋다. 그냥 A.y의 형식으로 적자.
		A a1 = new A();
		//a1.x = 10;
		System.out.println("\n객체 a1의 y값 : " + a1.y + "\t\t객체 a1의 x값 : " + a1.x); 

		A a2 = new A();
		//a2.x = 20;
		System.out.println("\n객체 a2의 y값 : " + a2.y + "\t\t객체 a2의 x값 : " + a2.x); 

		A a3 = new A();
		//a3.x = 30;
		System.out.println("\n객체 a3의 y값 : " + a3.y + "\t\t객체 a3의 x값 : " + a3.x); 
	}
}