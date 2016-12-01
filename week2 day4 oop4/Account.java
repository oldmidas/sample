//banking program
//1. 계좌등록 기능
	// 이름, 비밀번호, 최초 입금액을 입력받아서 계좌를 생성한다.
//2. 조회 기능
	// 이름, 계좌번호, 잔액을 표시한다. 
//3. 비밀번호 변경기능
	//예전 비밀번호와 새 비밀번호를 입력받아서 비밀번호를 변경한다.
//4. 입금기능
	//입금액을 입력받아서 잔액을 증가시킨다.
//5. 출금기능
	// 출금액과 비밀번호를 입력받아서 잔액을 감소시킨다.
//6. 종료
	// 프로그램을 종료한다.

public class Account{
	// 이름 계좌번호 비밀번호 잔액
	// 속성 정의
	private String name;
	private String accountNo;
	private int password;
	private int balance;

	//기본 생성자 정의
	public Account () {}

	//getter / setter 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}