public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account();
		a.owner = "ȫ�浿";
		a.accountNumber = "111-111-111";
		a.password = 2124;
		a.balance = 1000000;

		System.out.println(a.balance); // �ܾ�Ȯ��
		System.out.println();
		System.out.println();

		a.withdraw(100000, 2124); // ���
		System.out.println();
		System.out.println();

		a.withdraw(100000, 2123); // ���, ���Ʋ��
		System.out.println(a.balance);
		System.out.println();
		System.out.println();

		a.withdraw(10000000, 2124); // ���, �ܾ��ʰ�
		System.out.println();
		System.out.println();

		a.withdraw(10000000, 2123); // ���, ���Ʋ��, �ܾ��ʰ�
		System.out.println(a.balance);
		System.out.println();
		System.out.println();

		a.deposit(1100000);

		a.balance();
	}
}