public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


	// 배열 이동시키기
	// arr1배열에서 지정된 번호를 찾아서 맨 뒤로 보내기
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
	
	// 배열 복사하기
	// arr2배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
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
	
	// 배열 잘라내기 arr3
	// arr3배열을 지정된 위치부터 위치까지 복사한 배열을 반환하기
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