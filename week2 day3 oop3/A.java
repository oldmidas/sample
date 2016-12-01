public class A {
	String number = "객체 변수";

	public void m() {
		String number = "메소드 변수";

		System.out.println("메소드 m의 변수 number == " + number);
		System.out.println("객체 m의 변수 number == " + this.number);
	}
}