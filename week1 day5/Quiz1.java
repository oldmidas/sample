public class Quiz1 {
	public static void main(String[] args) {
		//�迭���� ���� ū ���� ã��
		
		int max = 0;
		int[] numbers = {1, 5, 3, 8, 2};

		for (int num : numbers) {
				if (num > max) {
					max = num;
				}
		}
		System.out.println("max: " + max);
	}
}