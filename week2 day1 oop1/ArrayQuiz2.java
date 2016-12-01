//배열과 숫자를 전달받아서 그 배열에 그 숫자가 포함되어 있는지 여부를 반환하는 메소드

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
				System.out.println("포함");
		} else {
				System.out.println("미포함");		
		}
	}


	
	public static void main(String[] args) {
		int[] example1 = {10, 4, 6, 8};
		int example2 = 4;
		example(example1, example2);

	}
}