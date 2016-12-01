public class Account {
	// 속성을 은닉화 시키기
	private String owner;
	private String accountNumber;
	private int password;
	private int balance;

	public Account(String owner, String accountNumber, int password, int balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}
	
	// 기능을 공개하기
	public void info() {
		System.out.printf("%s %s %d %d\n", owner, accountNumber, password, balance);

	}

	private void info2() {
		System.out.printf("%s %s %d %d\n", owner, accountNumber, password, balance);

	}

	public String getOwner() {
		return owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


}