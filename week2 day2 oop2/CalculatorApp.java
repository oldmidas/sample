public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		int result1 = c.plus(2, 5);
		System.out.println(result1);

		System.out.println(c.plus(3, 5));
		System.out.println(c.plus(3.2, 5.2));
		System.out.println(c.plus(3, 5, 1));
		System.out.println(c.plus(3.2, 5.2, 1.4));
	}
}