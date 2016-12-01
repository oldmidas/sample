public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account();
		a.owner = "홍길동";
		a.accountNumber = "111-111-111";
		a.password = 2124;
		a.balance = 1000000;

		System.out.println(a.balance); // 잔액확인
		System.out.println();
		System.out.println();

		a.withdraw(100000, 2124); // 출금
		System.out.println();
		System.out.println();

		a.withdraw(100000, 2123); // 출금, 비번틀림
		System.out.println(a.balance);
		System.out.println();
		System.out.println();

		a.withdraw(10000000, 2124); // 출금, 잔액초과
		System.out.println();
		System.out.println();

		a.withdraw(10000000, 2123); // 출금, 비번틀림, 잔액초과
		System.out.println(a.balance);
		System.out.println();
		System.out.println();

		a.deposit(1100000);

		a.balance();
	}
}