//�迭�� ���޹޾Ƽ� �� �迭���� ���� ���� ���� ��ȯ�ϴ� �޼ҵ�

public class ArrayQuiz11 {

	public void minimum(int[] array) {
		int minimum = 1000;
		int maximum = 0;
		for (int i = 0; i < array.length; i++) {
			if (minimum > array[i]) {
				minimum = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (maximum < array[i]) {
				maximum = array[i];
			}
		}
		System.out.println("�ִ밪�� : " + maximum);
		System.out.println("�ּҰ��� : " + minimum);
		
	}

}