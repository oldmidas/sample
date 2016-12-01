import java.util.*;

public class Quiz3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

  // 임의의 숫자 3개를 저장할 배열
		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10); 
			boolean isExist = false;

			for (int i=0; i< position; i++) {
				if (numbers[i] == number) {
					isExist = true;  
				}
			}

			if (!isExist) {    
				numbers[position] = number;
				position++;    
			}

			if (position == 3) {  
				break;
			}
		} 

			System.out.println(Arrays.toString(numbers));

  
			// 사용자가 입력한 답을 저장할 배열

		int[] answer = new int[3];
		int count = 0;
		boolean isSuccess = false;


		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;
			int outCount = 0;

			System.out.println("첫번째 숫자를 입력하세요.(숫자 0-9)");
			int firstNum = sc.nextInt();
			   
			System.out.println("두번째 숫자를 입력하세요.(숫자 0-9)");
			int secondNum = sc.nextInt();
			  
			System.out.println("세번째 숫자를 입력하세요.(숫자 0-9)");
			int thirdNum = sc.nextInt();

   
			if ((firstNum >= 0) && (firstNum <= 9)) {
				if (firstNum == numbers[0]) {
					strike++;
				} else if ((firstNum == numbers[1]) || (firstNum == numbers[2])) {
					ball++;
				} else {
					outCount++;
				}   
			}


			if ((secondNum >= 0) && (secondNum <= 9)) {
				if (firstNum == secondNum) {
					System.out.println("중복된 숫자가 있습니다.");
				} else if (secondNum == numbers[1]) {
					strike++;
				} else if ((secondNum == numbers[0]) || (secondNum == numbers[2])) {
					ball++;
				} else {
					outCount++;
				}
			}

				   
			if ((thirdNum >= 0) && (thirdNum <= 9)) {
				if ((firstNum == thirdNum) || (secondNum == thirdNum)) {
					System.out.println("\n중복된 숫자가 있습니다.");
				} else if (thirdNum == numbers[2]) {
					strike++;
				} else if ((thirdNum == numbers[0]) || (thirdNum == numbers[1])) {
					ball++;
				} else {
					outCount++;
				}
			}
				

			if ((firstNum < 0) || (firstNum > 9)) {
				System.out.println("0-9를 벗어난 숫자가 있습니다.");
			} else if ((secondNum < 0) || (secondNum > 9)) {
				System.out.println("0-9를 벗어난 숫자가 있습니다.");;
			} else if ((thirdNum < 0) || (thirdNum > 9)) {
				System.out.println("0-9를 벗어난 숫자가 있습니다.");
			}


			count++;
			System.out.println("\n\n==============================");
			System.out.println("player> " + firstNum + "  " + secondNum + "  "  + thirdNum);
			System.out.println("\n\t" + strike + " strike\n\t" + ball + " ball\n\t" + outCount + " out\n");
			System.out.println("시도횟수 : "+ count + "/10");
			System.out.println("==============================\n\n");

		
			if (strike == 3) {
				isSuccess = true;
				break;
		
			} else if (count > 10) {
				isSuccess = false;
				break;
			}
		}


		if (isSuccess) {
			System.out.println("\n\n==============================");
			System.out.println("성 공 했 습 니 다. 성  공");
			System.out.println("==============================\n\n");
		} else if (!(isSuccess)) {
			System.out.println("\n\n==============================");
			System.out.println("실 패 했 습 니 다. 멍청이");
			System.out.println("==============================\n\n\n\n\n\n\n");
		}

	}
}