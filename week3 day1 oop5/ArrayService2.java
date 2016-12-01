public class ArrayService2 {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// 배열 이동시키기
	// arr1배열에서 지정된 번호를 찾아서 맨 뒤로 보내기
	public int[] move(int no) {
		//지정된 숫자를 미리 보관해놓자.
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

	// 배열 복사하기
	// arr2배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
	public int[] copy(int begin) {
		int[] result = new int[arr2.length - begin];

		for (int i = begin; i<arr2.length; i++) {
			result[i-begin] = arr2[i];
		}
		return result;
	}

	// 배열 잘라내기 arr3
	// arr3배열을 지정된 위치부터 위치까지 복사한 배열을 반환하기
	public int[] copy(int begin, int end) {
		int[] result = new int[end - begin];

		for (int i = begin; i<end; i++) {
			result[i-begin] = arr3[i];
		}
		return result;
	}

}