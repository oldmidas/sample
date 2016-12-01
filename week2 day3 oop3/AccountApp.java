public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("ȫ�浿", "111-22-3333", 1324, 1000000);
		//System.out.println("������: " + a.owner); //private ������ owner�� ���� �� �� �����Ƿ� error.
		a.info(); // public method()������ error�� �ƴϴ�.
		//a.info2(); // private method()������ error.

		Account[] arr = new Account[5];

		arr[0] = new Account("ȫ�浿", "111-22-3333", 1325, 100);
		arr[1] = new Account("������", "121-22-3233", 1320, 5000);
		arr[2] = new Account("���", "131-24-3353", 1321, 5000);
		arr[3] = new Account("��â", "141-23-3363", 1327, 300);
		arr[4] = new Account("�̼���", "151-21-6333", 1225, 500);

		for (Account b : arr) {
			System.out.println(b.getOwner());
			System.out.println(b.getAccountNumber());
		}
	}
}