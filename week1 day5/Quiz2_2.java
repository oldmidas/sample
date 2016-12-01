import java.util.Scanner;

public class Quiz2_2 {
	public static void main(String[] args) {
		// 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수 만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
		// 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("국어시험을 본 학생들의 수를 입력하세요: ");
		int size = sc.nextInt();

		int[] kor = new int[size];
		int total = 0; 
		double avg = 0; 

		for (int i=0 ; i < size; i++) {
			System.out.println("점수를 입력하세요.");
			int scores = sc.nextInt();
			kor[i] = scores; 
			total += kor[i]; 
		}

		avg = total / (double)size;

		System.out.println("총점은: " + total + "\t평균은: " + avg);

	}
}