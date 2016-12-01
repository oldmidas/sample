public class Quizz1 {
	//배열을 전달받아서 배열의 최대값을 반환하는 메소드
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

	//배열과 숫자를 전달 받아서 숫자가 배열에 포함되어 있는지 여부를 반환하는 메소드
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


		System.out.println("최대 값 : " + max);
		System.out.println("포함하고 있는가? " + contain);
	}

}