import java.util.Scanner;
import java.util.Random;

public class Quiz4_teacher {
	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		boolean island = false; //0�̸� ����, 1�̸� ���ε�
		int count = 3;
		int distance = 0;
		int many = 0;
		
		for (;;) {
			System.out.println("------------------------");
			System.out.println("1.�ֻ��� ������ | 0.����");
			System.out.println("------------------------");
			System.out.println("�����ϼ���> ");
			int select = sc.nextInt();


			if (!island) {
				if (dice1+dice2 == 7) {
					island = true;
					count = 3;
				} else {
					distance += (dice1 + dice2);
					if (distance > 100) {
						System.out.println("### ������ ���� ###");
						break;
					}
				} 
			} else { 
				if (first == second) {
					island = false;
				} 
				else {
					count--;
						if (count == 0) {
							island = false;
							}
					}
			}
	}
}
}