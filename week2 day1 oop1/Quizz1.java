public class Quizz1 {
	//�迭�� ���޹޾Ƽ� �迭�� �ִ밪�� ��ȯ�ϴ� �޼ҵ�
	public static int max (int[] numbers) {
		/*
		int max = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		*/

		int maxNumber = 0;
		for (int num : numbers) {
			if (num > maxNumber) {
				maxNumber = num;
			}
		}
		return maxNumber;
	}

	//�迭�� ���ڸ� ���� �޾Ƽ� ���ڰ� �迭�� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public static boolean contains(int[] numbers, int num) {
		/*
		boolean contains = false;
		for (int i = 0; i < numbers.length; i++) {
			if (num == numbers[i]) {
				contains = true;
				break;
			}	
		}
		*/

		boolean contains = false;

		for (int contain : numbers) {
			if (num == contain) {
				contains = true;
				break;
			}
		}

		return contains;
	}
	
	public static void main(String[] args) {

		int[] arr1 = {1, 4, 2, 56, 7, 23, 9};
		int max = max(arr1);

		int[] arr2 = {-1, -4, -2, -56, -7, -23, -9, 0, -5};
		boolean contain = contains(arr2, -5);


		System.out.println("�ִ� �� : " + max);
		System.out.println("�����ϰ� �ִ°�? " + contain);
	}

}