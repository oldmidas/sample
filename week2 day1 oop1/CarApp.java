public class CarApp { //App를 붙히면 main을 가지고 있는 파일임
	public static void main(String[] args) {
		/*
			Car c
				Car라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수 c를 만든다.
				Car타입(클래스타입, 참조타입)의 변수 c(참조변수)를 만든다.

			new Car();
				Car설계도를 로드해서 객체를 생성하고,
				생성된 객체를 참조할 수 있는 주소값을 반환하는 코드이다.
			
			Car c = new Car();
				Car설계도를 로드해서 객체를 생성하고,
				생성된 객체를 참조할 수 있는 주소값을 Car타입의 변수 c에 저장해라.
		*/


		Car c = new Car();
		System.out.println(c); //Car@15db9742 -> 15db9742 == hash code

		Car c2 = new Car();
		System.out.println(c2); // Car c와는 다른 hash code가 생성된다

		// 생성된 객체의 필드, 생성된 객체의 메소드를 사용하기
		System.out.println(c.speed);	// c가 참조하는 객체의 speed 속성값 조회. 현재속도 0
		c.speed = 10;					// c가 참조하는 객체의 speed의 속성값 변경. 현재속도 10
		c.speedUp();					// c가 참조하는 객체에 포함된 speedUp() 기능 실행하기. 현재속도 20

	}
}