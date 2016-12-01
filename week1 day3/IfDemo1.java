public class IfDemo1 {
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		int score = 87;
		int x = 0;

		if (score >= 60) {
			x = 10;
			System.out.println("합격입니다.");
		}

		System.out.println("프로그램을 종료합니다.");
		System.out.println(x);
	}
}