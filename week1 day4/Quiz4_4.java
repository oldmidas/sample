import java.util.Scanner;
import java.util.Random;

public class Quiz4_4 {
	public static void main(String[] args) {
		
		//1. �� �ֻ����� ���� 7�� �Ǹ� ���ε���.
		//2. ���ε��� ���� ���, ���� ���� ������ ���� ���ε����� Ż��
		//3. ���ε��� ���� ���, �ֻ����� 3�� ���ȴٸ� ���ε� ���� Ż��
		//4. ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		boolean island = false; //0�̸� ����, 1�̸� ���ε�
		int count = 3;
		int move = 0;
		int many = 0;

		
		for (;;) {
			System.out.println("------------------------");
			System.out.println("1.�ֻ��� ������ | 0.����");
			System.out.println("------------------------");
			System.out.println("�����ϼ���> ");
			int select = sc.nextInt();


			if (select == 1) {
				int dice1 = random.nextInt(6)+1;
				int dice2 = random.nextInt(6)+1;
				System.out.println("\n\n    (" + dice1 + ", " + dice2 + ")");


				if ((!island) && ((dice1 + dice2)!= 7)) {
					System.out.println((dice1 + dice2) + "ĭ �̵��մϴ�.\n");
					move += (dice1 + dice2);
					many++;
					System.out.println("����: " + move +"/100\n�ֻ��� ���� Ƚ��: " + many + "\n\n");
					if (move >= 100) {
						System.out.println("# # # G  A  M  E      C  L  E  A  R # # #");
						break;
					}

						
				} else if ((!island) && ((dice1 + dice2) == 7)) {
					System.out.println("���ε��� ���������ϴ�.\n\n");
					island = true;
					many++;
					System.out.println("����: " + move +"/100\n�ֻ��� ���� Ƚ��: " + many + "\n\n");


				} else if ((island) && ((dice1 == dice2))) {
					island = false;
					System.out.println("\n\n���� ���� ���� ���ε��� Ż���մϴ�.\n\n");
					count = 3;
					many++;
					System.out.println("����: " + move +"/100\n�ֻ��� ���� Ƚ��: " + many + "\n\n");


				} else if ((island) && (dice1 != dice2)) {
						if (count == 3) {
							System.out.println("���ε� Ż�����. ���� �� : 2��");
							count--;
							many++;
							System.out.println("����: " + move +"/100\n�ֻ��� ���� Ƚ��: " + many + "\n\n");

						} else if (count == 2) {
							System.out.println("���ε� Ż�����. ���� �� : 1��");
							count--;
							many++;
							System.out.println("����: " + move +"/100\n�ֻ��� ���� Ƚ��: " + many + "\n\n");

						} else if (count == 1){
							System.out.println("���ε��� Ż���մϴ�.");
							many++;
							System.out.println("����: " + move +"/100\n�ֻ��� ���� Ƚ��: " + many + "\n\n");	
							island = false;
							count = 3;
						}

							
				} else if (select == 0) {
					System.out.println("������ �����մϴ�." + "\n\n");
					break;
				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���." + "\n\n");
				}

			}
			
		}

	}

}