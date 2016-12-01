import java.util.Scanner;

public class ForDemo2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		for (int a = 2; a <= 9; a++) {
			for (int b = 1; b<=9; b++) {
				int c = a*b;
				System.out.println(a + " * " + b + " = " + c);
			}
		}
	}
}