public class ArrayDemo3 {
	public static void main(String[] args) {


		int[] numbers = new int[3];

		//�迭�� ������ ��ġ�� ���� �����ϱ�
		// numbers[�ε���] = ��; 
		numbers[0] = 12;
		numbers[1] = 23;
		numbers[2] = 56;
		// numbers[3] = 100;  <-- ���� �߻� : ArrayIndexOutOfBoundsException, �迭�� ����� �Ѿ��� ����.

		for (int a : numbers ) {
			System.out.println(a);
		}

	}
}