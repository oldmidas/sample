import java.util.*;

public class Quiz3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

  // ������ ���� 3���� ������ �迭
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

  
			// ����ڰ� �Է��� ���� ������ �迭

		int[] answer = new int[3];
		int count = 0;
		boolean isSuccess = false;


		for (int a=1; a<=10; a++) {
			int strike = 0;
			int ball = 0;
			int outCount = 0;

			System.out.println("ù��° ���ڸ� �Է��ϼ���.(���� 0-9)");
			int firstNum = sc.nextInt();
			   
			System.out.println("�ι�° ���ڸ� �Է��ϼ���.(���� 0-9)");
			int secondNum = sc.nextInt();
			  
			System.out.println("����° ���ڸ� �Է��ϼ���.(���� 0-9)");
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
					System.out.println("�ߺ��� ���ڰ� �ֽ��ϴ�.");
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
					System.out.println("\n�ߺ��� ���ڰ� �ֽ��ϴ�.");
				} else if (thirdNum == numbers[2]) {
					strike++;
				} else if ((thirdNum == numbers[0]) || (thirdNum == numbers[1])) {
					ball++;
				} else {
					outCount++;
				}
			}
				

			if ((firstNum < 0) || (firstNum > 9)) {
				System.out.println("0-9�� ��� ���ڰ� �ֽ��ϴ�.");
			} else if ((secondNum < 0) || (secondNum > 9)) {
				System.out.println("0-9�� ��� ���ڰ� �ֽ��ϴ�.");;
			} else if ((thirdNum < 0) || (thirdNum > 9)) {
				System.out.println("0-9�� ��� ���ڰ� �ֽ��ϴ�.");
			}


			count++;
			System.out.println("\n\n==============================");
			System.out.println("player> " + firstNum + "  " + secondNum + "  "  + thirdNum);
			System.out.println("\n\t" + strike + " strike\n\t" + ball + " ball\n\t" + outCount + " out\n");
			System.out.println("�õ�Ƚ�� : "+ count + "/10");
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
			System.out.println("�� �� �� �� �� ��. ��  ��");
			System.out.println("==============================\n\n");
		} else if (!(isSuccess)) {
			System.out.println("\n\n==============================");
			System.out.println("�� �� �� �� �� ��. ��û��");
			System.out.println("==============================\n\n\n\n\n\n\n");
		}

	}
}