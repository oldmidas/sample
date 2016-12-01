public class ForDemo3 {
	public static void main(String[] args) {
		// 1 ~ 10까지의 합을 계산하기
		int total = 0;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {		
			total = i + total;
			sum = total - i;
			System.out.println(sum + " + " + i + " = " + total);
		}

		System.out.println(sum);
	}

}