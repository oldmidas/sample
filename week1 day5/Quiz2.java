import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수 만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
		// 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.println("----------- 총점 & 평균 -----------");
		System.out.print("시험을 본 학생들의 수를 입력하세요: ");
		int size = sc.nextInt(); // 학생수 == 배열의 크기
		int[] kor = new int[size]; // 배열만들기 kor이라는 배열에 size만큼의 배열숫자를 만든다
		int total = 0; //합계 변수생성
		double avg = 0; // 평균 변수생성

		for (int i=0 ; i < size; i++) {
			System.out.println("점수를 입력하세요.");
			System.out.print(size + "명 중 " + (i+1) + "번째 학생의 점수 >");
			int scores = sc.nextInt(); //점수 받아오기
			kor[i] = scores; // 이제부터 받아오는 점수는 (kor[i번째])에 배열에 입력된다.(i = 0일때는 kor[0]번째에 점수로 입력된다.)
			total += kor[i]; // total에 kor배열의 0번째부터 size만큼의 점수를 계속 더한다(위에 입력받은 kor[i]번째의 값을 total에 쌓는다.)
		}

		avg = total / (double)size; // 총점을 처음 입력한 학생수(size)로 나눈다

		System.out.println("\n\n총점은: " + total + "\n평균은: " + avg + "\n\n");

	}
}