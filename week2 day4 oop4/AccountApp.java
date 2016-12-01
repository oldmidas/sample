import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

		for ( ; ; ) {

			System.out.println("1.등록 2.조회 3.비밀번호 변경 4.입금 5.출금 0.종료");
			System.out.println("메뉴를 선택하세요 > ");

			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.println("이름을 입력하세요> ");
				String name = sc.next();
				ac.setName(name);

				System.out.println("비밀번호를 입력하세요> ");
				int password = sc.nextInt();
				ac.setPassword(password);

				System.out.println("입금액을 입력하세요> ");
				int money = sc.nextInt();
				
				if (money < 0) {
					System.out.println("최소 입금액은 0원 입니다. ");
				} else {
					ac.setBalance(money);
				}
				
				ac.setAccountNo("111-22-3333");
				System.out.println("계좌가 생성되었습니다. 새 계좌번호 : " + ac.getAccountNo());

			} else if (menuNo == 2) {
				System.out.printf("%s %s %d\n", ac.getName(), ac.getAccountNo(), ac.getBalance());
			
			} else if (menuNo == 3) {
				System.out.println("현재 비밀번호를 입력하세요> ");
				int password = sc.nextInt();
				if (ac.getPassword() != password) {
					System.out.println("비밀번호가 틀렸습니다.");
				} else {
					System.out.println("변경할 비밀번호를 입력하세요> ");
					int newPassword = sc.nextInt();
					ac.setPassword(newPassword);
					System.out.println("비밀번호가 변경되었습니다.");
				}
			
			} else if (menuNo == 4) {
				System.out.println("입금할 금액을 입력하세요.");
				int money = sc.nextInt();
				
				if (money < 0) {
					System.out.println("최소 입금액은 0원 입니다. ");				
				} else {
					ac.setBalance(ac.getBalance() + money);
					System.out.println(money + "원 입금되었습니다. ");				
				}
					
			} else if (menuNo == 5) {
				System.out.println("출금할 금액을 입력하세요.");
				int money = sc.nextInt();
				
				if (money > ac.getBalance()) {
					System.out.println("잔액이 부족합니다.");
				} else {
					ac.setBalance(ac.getBalance() - money);
					System.out.println(money + "원 출급되었습니다.\n잔액: " + ac.getBalance());
				}
			
			} else if (menuNo == 0) {
				break;
			
			} else {
				System.out.println("번호를 잘못 입력했습니다.");
			}

			
		}
	}
	
}