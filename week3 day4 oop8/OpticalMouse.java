// 인터페이스를 상속받을때는 implements를 사용한다.
public class OpticalMouse implements Mouse, Lightable {

	// Mouse 인터페이스에 정의된 추상메소드 구현
	public void wheel() {
		System.out.println("빛을 번쩍이며 빙글.. 빙글..");
	}

	public void click() {
		System.out.println("빛을 번쩍이며 클릭.. 클릭..");
	}

	public void move() {
		System.out.println("빛을 번쩍이며 움직.. 움직..");
	}

	public void light() {
		System.out.println("반짝~~ 반짝~~");
	}


	
}