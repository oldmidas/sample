import java.util.Scanner;

public class Book3 {
	public static void main(String[] args) {

		
		// 1. 입금 | 2. 출금 | 3. 조회 | 4. 종료
		// 1. 잔액을 증가시킨다.
		// 2. 잔액을 감소시킨다.
		// 3. 잔액을 표시한다.
		// 4. 프로그램을 종료한다.


		Scanner sc = new Scanner(System.in);

		int balance = 0;

		for ( ; ; ) {
			System.out.println("-------------------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 조회 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("예금액> ");
				int deposit = sc.nextInt();
				balance = balance + deposit;

			} else if (choice == 2) {
				System.out.println("출금액> ");
				int withrawl = sc.nextInt();

				if (withrawl > balance) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance = balance - withrawl;
				}

			} else if (choice == 3) {
				System.out.println("잔고액> " + balance);

			} else if (choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			}
		}
	}
}