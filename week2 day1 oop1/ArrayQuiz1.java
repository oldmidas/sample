//�迭�� ���޹޾Ƽ� �� �迭���� ���� ū ���� ��ȯ�ϴ� �޼ҵ�


public class ArrayQuiz1 {

	public static void array(int[] max) {
		int[] array = max;
		int maximum = 0;
		for (int i = 0; i < max.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}
		System.out.println("�ִ밪�� : " + maximum);
	}


	
	public static void main(String[] args) {
		int[] example1 = {61, 31, 25, 1, 100, 561, 50, 0, 3};
		array(example1);

	}
}