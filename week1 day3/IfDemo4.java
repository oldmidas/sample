import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��) 2:�����꽺(2000��) 3:�̿�����(1000��)");
		int coffee = 1500;
		int juice = 2000;
		int drink = 1000;

		System.out.println("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();

		System.out.println("���Ḧ ������:");
		int number = sc.nextInt();
		int change = 0;
		

		if (number == 1) {
			change = (money - coffee);
			if (change >= 0) {
				System.out.println("Ŀ�Ǹ� �޾ư�����.");
			} 
				else {
				System.out.println("���� �����մϴ�.");
			}
		} 
		
		if (number == 2) {
			change = (money - juice);
			if (change >= 0) {
				System.out.println("�꽺 �޾ư�����.");
			} else {
				System.out.println("���� �����մϴ�.");
			}			
		} 
		
		if (number == 3) {
				change = (money - drink);
				if (change >= 0) {
					System.out.println("�̿����Ḧ �޾ư�����.");
				} else {
					System.out.println("���� �����մϴ�.");
				}
			}
		System.out.println("�Ž����� : " + change);

		int thousand = change / 1000;
		System.out.println("õ��:" + thousand);

		int fiveHundred = (change - (thousand*1000) )/500;
		System.out.println("�����:" + fiveHundred);

		int hundred = (change - (thousand*1000) - (fiveHundred*500) )/100;
		System.out.println("���:" + hundred);

		int fifty = (change - (thousand*1000) - (fiveHundred*500) - (hundred*100) )/50;
		System.out.println("���ʿ�:" + fifty);
	
		int ten = (change - (thousand*1000) - (fiveHundred*500) - (hundred*100) - (fifty*50) )/10;
		System.out.println("�ʿ�:" + ten);
	}
}