import java.util.Scanner;
import java.util.Random;

public class Quiz4_2 {
	public static void main(String[] args) {
		
		//1. �� �ֻ����� ���� 7�� �Ǹ� ���ε���.
		//2. ���ε��� ���� ���, ���� ���� ������ ���� ���ε����� Ż��
		//3. ���ε��� ���� ���, �ֻ����� 3�� ���ȴٸ� ���ε� ���� Ż��
		//4. ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int island = 0; //0�̸� ����, 1�̸� ���ε�
		int count = 3;
		int move = 0;


				
		for (;;) {
			System.out.println("------------------------");
			System.out.println("1.�ֻ��� ������ | 0.����");
			System.out.println("------------------------");
			System.out.println("�����ϼ���> ");

			int select = sc.nextInt();

			if (select == 1) {
				int dice1 = random.nextInt(6)+1;
				int dice2 = random.nextInt(6)+1;
				System.out.println("(" + dice1 + ", " + dice2 + ")");

				if ((island == 0) && ((dice1 + dice2)!= 7)) {
					System.out.println((dice1 + dice2) + "ĭ �̵��մϴ�.");
					move += (dice1 + dice2);
					System.out.println(move +"/50");
					if (move >= 50) {
						System.out.println("������ �������ϴ�. �� �̵��Ÿ�: " + move + "ĭ");
						break;
					}
						
				} else if ((island == 0) && ((dice1 + dice2) == 7)) {
					System.out.println("���ε��� ���������ϴ�.");
					island = 1;

				} else if ((island == 1) && ((dice1 == dice2))) {
					island = 0;
					System.out.println("���ε��� Ż���մϴ�.");
					count = 3;

				} else if ((island == 1) && (dice1 != dice2)) {
						if (count == 3) {
							System.out.println("���ε� Ż�����. ���� �� : 2��");
							count--;
						} else if (count == 2) {
							System.out.println("���ε� Ż�����. ���� �� : 1��");
							count--;
						} else if (count == 1){
							System.out.println("���ε��� Ż���մϴ�.");
							island = 0;
						}

							
				} else if (select == 0) {
					System.out.println("������ �����մϴ�.");
					break;
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				}

			}
			
		}






	}

}