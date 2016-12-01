public class Car {
	// 속성(필드, field) 정의하기
	int speed;

	// 기능(메소드, method) 정의하기
	public void speedUp() { // 필드, 멤버변수, 프로퍼트, 인스턴스 변수
		speed += 10;
		System.out.println("현재 속도: " + speed + "km"); 
	}
	
	public void speedDown() {
		speed -= 10;
		System.out.println("현재속도: " + speed + "km");
	}

}