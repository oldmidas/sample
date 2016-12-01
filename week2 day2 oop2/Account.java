/*
	은행계좌를 표현하는 클래스
	- 속성
		예금주
		계좌번호
		비밀번호
		잔액

	- 기능
		출금기능 - 금액과 비밀번호를 전달받아서
				   비밀번호가 개설시 입력한 비밀번호와 일치하면
				   금액만큼을 장낵에서 감소시키고
				   금액만큼 돈을 반환한다.

		입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시키고
				   화면에 현재 잔액을 표시한다.

		조회기능 - 화면에 예금주, 계좌번호, 잔액을 표시한다.

*/

public class Account {

	String owner;
	String accountNumber;
	int password;
	int balance;

	//출금기능
	/*
	public int withdraw(int amount, int pwd) {
		if (pwd == password) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println(amount + "원 출금합니다.");
				System.out.println("현재잔액 : " + amount + "원");
				return amount;
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재잔액 : " + amount + "원");
				return 0;
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		}

	}
	*/
	public int withdraw(int amount, int pwd) {
		int money = 0;
		if (pwd == password) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println(amount + "원 출금합니다.");
				System.out.println("현재잔액 : " + balance + "원");
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재잔액 : " + balance + "원");
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		return money;

	}


	public int withdraw(int amount, int pwd) {
		if (pwd != password) {
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		} 
		if (balance < account) {
			System.out.println("잔액이 부족합니다.");
		}

		if ((balance - account) >= 100000) {
			System.out.println("최소 예금액이 부족합니다.");
		}
		balance += amount;
		return amount
			


	}

	
	
	
	//입금기능
	public void deposit(int amount) {
		balance += amount;
		System.out.println("현재잔액 : " + balance + "원");
		
	}

	//조회기능
	public void balance() {
		System.out.println("========================");
		System.out.println("예 금 주 : " + owner);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔    액 : " + balance);
		System.out.println("========================");
	}

}