import java.util.*;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 임의의 숫자 3개를 저장할 배열
		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10); //10까지의 랜덤의 숫자를 number에 받는다.
			boolean isExist = false;

			for (int i=0; i< position; i++) { //이 for문은 중복을 확인하는 for문이다. position 변수는 현재 0이므로
				if (numbers[i] == number) { // 만약에 랜덤 i번째숫자의 값이 위에서 랜덤으로 받는 수와 같다면
					isExist = true;			// true를 isExist에 입력하고, 그럼 13번줄에 isExist가 true로 바뀌면서 for문이 다시 실행되며, 만약 같지 않다면 
				}
			} 
			
			if (!isExist) {					//여기로 와서 
				numbers[position] = number; //numbers[position] = number에 넣는다
				position++;					//그렇다면 position번째 숫자가 정해졌기때문에 포지션을 1늘립니다.
			} 
			
			if (position == 3) {			//그리고 position이 3이 될때까지 반복합니다.
				break;
			}
		}  
	System.out.println(Arrays.toString(numbers));		// 이건 뭔지 모름
	
	boolean isSuccess = false;
	int[] answer = new int[3];

	for (int i = 0; i <= 10; i++) {
		int strike = 0;
		int ball = 0;


		System.out.println("첫번째 숫자를 입력하세요: ");
		answer[0] = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요: ");
		answer[1] = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요: ");
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
			System.out.println("성공");
		} else {
			System.out.println("멍청이");
		}

	}
}