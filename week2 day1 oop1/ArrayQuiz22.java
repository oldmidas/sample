//�迭�� ���ڸ� ���޹޾Ƽ� �� �迭�� �� ���ڰ� ���ԵǾ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�

public class ArrayQuiz22 {
	public void includeCheck(int[] numbers, int number) {
		boolean checks = false;
		for (int i = 0; i < numbers.length; i++) {
			if (number == numbers[i]) {
				checks = true;
				break;
			} else {
				checks = false;
			}
		}
		if (checks) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
	}
}