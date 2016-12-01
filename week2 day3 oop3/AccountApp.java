public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("홍길동", "111-22-3333", 1324, 1000000);
		//System.out.println("예금주: " + a.owner); //private 변수인 owner에 접근 할 수 없으므로 error.
		a.info(); // public method()임으로 error가 아니다.
		//a.info2(); // private method()임으로 error.

		Account[] arr = new Account[5];

		arr[0] = new Account("홍길동", "111-22-3333", 1325, 100);
		arr[1] = new Account("김유신", "121-22-3233", 1320, 5000);
		arr[2] = new Account("계백", "131-24-3353", 1321, 5000);
		arr[3] = new Account("관창", "141-23-3363", 1327, 300);
		arr[4] = new Account("이순신", "151-21-6333", 1225, 500);

		for (Account b : arr) {
			System.out.println(b.getOwner());
			System.out.println(b.getAccountNumber());
		}
	}
}