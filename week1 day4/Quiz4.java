import java.util.Scanner;
import java.util.Random;

public class Quiz4 {
	public static void main(String[] args) {
		
		//1. 두 주사위의 합이 7이 되면 무인도행.
		//2. 무인도에 갇힌 경우, 같은 숫자 조합일 때만 무인도에서 탈출
		//3. 무인도에 갇힌 경우, 주사위를 3번 굴렸다면 무인도 에서 탈출
		//4. 무인도에 갇히지 않은 경우에는 주사위의 합만큼 칸을 이동
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int island = 0; //0이면 자유, 1이면 무인도
		int count = 3;
		int move = 0;


				
		for (;;) {
			System.out.println("------------------------");
			System.out.println("1.주사위 굴리기 | 0.종료");
			System.out.println("------------------------");
			System.out.println("선택하세요> ");

			int select = sc.nextInt();

				if (select == 1) {
					int dice1 = random.nextInt(6)+1;
					int dice2 = random.nextInt(6)+1;
					System.out.println("(" + dice1 + ", " + dice2 + ")");

					if ((island == 0) && ((dice1 + dice2)!= 7)) {
						System.out.println((dice1 + dice2) + "칸 이동합니다.");
						move += (dice1 + dice2);
						System.out.println(move +"/50");
						
					} else if ((island == 0) && ((dice1 + dice2) == 7)) {
						System.out.println("무인도에 떨어졌습니다.");
						island = 1;

					} else if ((island == 1) && ((dice1 == dice2))) {
						island = 0;
						System.out.println("무인도를 탈출합니다.");
						count = 3;

					} else if ((island == 1) && (dice1 != dice2)) {
							if (count == 3) {
								System.out.println("무인도 탈출실패. 남은 턴 : 2번");
								count--;
							} else if (count == 2) {
								System.out.println("무인도 탈출실패. 남은 턴 : 1번");
								count--;
							} else if (count == 1){
								System.out.println("무인도를 탈출합니다.");
								island = 0;
							}

							
					} else if (select == 0) {
						System.out.println("게임을 종료합니다.");
						break;
					} else {
						System.out.println("잘못된 입력입니다. 다시 입력하세요.");
					}

				}

		}

	}
}