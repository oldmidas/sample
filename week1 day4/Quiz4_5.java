import java.util.Scanner;
import java.util.Random;

public class Quiz4_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		boolean island = false; //0�̸� ����, 1�̸� ���ε�
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
				System.out.println("\n\n(" + dice1 + ", " + dice2 + ")");


				if ((!island) && ((dice1 + dice2)!= 7)) {
					move += (dice1 + dice2);
					if (move >= 100) {
						System.out.println("# # # G  A  M  E      C  L  E  A  R # # #");
						break;
					}

						
				} else if ((!island) && ((dice1 + dice2) == 7)) {
					island = true;

				} else if ((island) && ((dice1 == dice2))) {
					island = false;
					count = 3;

				} else if ((island) && (dice1 != dice2)) {
						if (count == 3) {
							count--;

						} else if (count == 2) {
							count--;

						} else if (count == 1){
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