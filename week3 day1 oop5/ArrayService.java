public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


	// �迭 �̵���Ű��
	// arr1�迭���� ������ ��ȣ�� ã�Ƽ� �� �ڷ� ������
	public int[] move(int no) {
		for (int i = no; i < arr1.length; i++) {
			arr1[i-1] = arr1[i];
		}
		arr1[9] = no;

		return arr1;
	}

	/*
	0 1 2 3 4 5 6 7 8 9\

	1 2 3 4 5 6 7 8 9 10

	begin - length
	

	public int[] shift(int begin, int length) {

	}

	*/
	
	// �迭 �����ϱ�
	// arr2�迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
		int[] temp = new int[arr2.length];
		int j = 0;
		for (int i = begin-1; i < arr2.length; i++) {
			temp[j] = arr2[i];
			j++;
		}	

		int[] result = new int[j];
		for (int i = 0 ; i < j ; i++) {
			result[i] = temp[i];
		}
		return result;

	}
	
	// �迭 �߶󳻱� arr3
	// arr3�迭�� ������ ��ġ���� ��ġ���� ������ �迭�� ��ȯ�ϱ�
	public int[] cut(int begin, int end) {
		int [] temp = new int[arr3.length];
		int j = 0;
		for (int i = begin-1; i <= end-1; i++) {
			temp[j] = arr3[i];
			j++;
		}
		
		int[] result = new int[j];
		for (int i = 0; i < j ; i++) {
			result[i] = temp[i];
		}
		return result;

	}
	
}