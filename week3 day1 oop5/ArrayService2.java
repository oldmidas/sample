public class ArrayService2 {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// �迭 �̵���Ű��
	// arr1�迭���� ������ ��ȣ�� ã�Ƽ� �� �ڷ� ������
	public int[] move(int no) {
		//������ ���ڸ� �̸� �����س���.
		int[] result = new int[arr1.length];
		for (int i = 0; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		int number = arr1[no-1];

		for(int i = no; i<arr1.length; i++) {
			result[i-1] = arr1[i];
		}
		result[result.length-1] = number;

		return result;
	}

	/*
	// arr4
	public int[] shift(int begin, int length) {
		int step = begin - length;
		int move = 0;
		if (step >= 0) {
			move = step;
			for (int i = 0; i < arr4.length; i++) {
				arr4[i] = 
			}
		} else if ( step <= 0) {
			move = (step%-10) + 10;
		}

		int[] result = new int[arr4.length];
		


		return result;
	}
	*/

	// �迭 �����ϱ�
	// arr2�迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
		int[] result = new int[arr2.length - begin];

		for (int i = begin; i<arr2.length; i++) {
			result[i-begin] = arr2[i];
		}
		return result;
	}

	// �迭 �߶󳻱� arr3
	// arr3�迭�� ������ ��ġ���� ��ġ���� ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin, int end) {
		int[] result = new int[end - begin];

		for (int i = begin; i<end; i++) {
			result[i-begin] = arr3[i];
		}
		return result;
	}

}