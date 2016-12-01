import java.util.*;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// ������ ���� 3���� ������ �迭
		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10); //10������ ������ ���ڸ� number�� �޴´�.
			boolean isExist = false;

			for (int i=0; i< position; i++) { //�� for���� �ߺ��� Ȯ���ϴ� for���̴�. position ������ ���� 0�̹Ƿ�
				if (numbers[i] == number) { // ���࿡ ���� i��°������ ���� ������ �������� �޴� ���� ���ٸ�
					isExist = true;			// true�� isExist�� �Է��ϰ�, �׷� 13���ٿ� isExist�� true�� �ٲ�鼭 for���� �ٽ� ����Ǹ�, ���� ���� �ʴٸ� 
				}
			} 
			
			if (!isExist) {					//����� �ͼ� 
				numbers[position] = number; //numbers[position] = number�� �ִ´�
				position++;					//�׷��ٸ� position��° ���ڰ� �������⶧���� �������� 1�ø��ϴ�.
			} 
			
			if (position == 3) {			//�׸��� position�� 3�� �ɶ����� �ݺ��մϴ�.
				break;
			}
		}  
	System.out.println(Arrays.toString(numbers));		// �̰� ���� ��
	
	boolean isSuccess = false;
	int[] answer = new int[3];

	for (int i = 0; i <= 10; i++) {
		int strike = 0;
		int ball = 0;


		System.out.println("ù��° ���ڸ� �Է��ϼ���: ");
		answer[0] = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���: ");
		answer[1] = sc.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���: ");
		answer[2] = sc.nextInt();

		for  (int a=0; a<3; a++) {
			for (int b=0; b<3; b++) {
				if (numbers[a] == answer[b]) {
					if (a == b) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		System.out.printf("s:%d b:%d\n", strike, ball);

		if (strike == 3) {
			isSuccess = true;
			break;
		}
	}

		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;


			if (strike == 3) {
				isSuccess = true;
				break;
			}
		}

		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("��û��");
		}

	}
}