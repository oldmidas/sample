//�迭�� ���ڸ� ���޹޾Ƽ� �� �迭�� �� ���ڰ� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�

public class ArrayQuiz2 {

	public static void example (int[] numberGroup, int includedNum) {
		int[] array = numberGroup;
		int number = includedNum;
		boolean include = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				include = true;
				break;
			} else {
				include = false;
			}
		}
		if (include) {
				System.out.println("����");
		} else {
				System.out.println("������");		
		}
	}


	
	public static void main(String[] args) {
		int[] example1 = {10, 4, 6, 8};
		int example2 = 4;
		example(example1, example2);

	}
}