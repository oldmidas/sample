import java.util.Scanner;

public class IfDemo43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원)");
		int coffee = 1500;
		int juice = 2000;
		int drink = 1000;
		

		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();

		System.out.println("음료를 고르세요:");
		int number = sc.nextInt();
		int change = 0;


		if (number == 1) {
			change = (money - coffee);
			if (change >= 0) {
				System.out.println("커피를 받아가세요.");		
			} else {
				System.out.println("돈이 부족합니다.");		
			}
		} else if (number == 2) {
			change = (money - juice);
			if (change >= 0) {
				System.out.println("쥬스 받아가세요.");
			} else {
				System.out.println("돈이 부족합니다.");		
			}
		} else if (number == 3) {
			change = (money - drink);
			if (change >= 0) {
				System.out.println("이온음료를 받아가세요.");
			} else {
				System.out.println("돈이 부족합니다.");		
			}
		}  else {
			change = money;
			System.out.println("없는 메뉴입니다.");
			}


		//거스름돈 값
		System.out.println("거스름돈 : " + change + "원");

		//거스름돈 나오게 하기
		int thousand = change / 1000;
		System.out.println("천원:" + thousand);

		int fiveHundred = (change - (thousand*1000) )/500;
		System.out.println("오백원:" + fiveHundred);

		int hundred = (change - (thousand*1000) - (fiveHundred*500) )/100;
		System.out.println("백원:" + hundred);

		int fifty = (change - (thousand*1000) - (fiveHundred*500) - (hundred*100) )/50;
		System.out.println("오십원:" + fifty);
	
		int ten = (change - (thousand*1000) - (fiveHundred*500) - (hundred*100) - (fifty*50) )/10;
		System.out.println("십원:" + ten);
	}
}