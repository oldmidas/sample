//배열을 전달받아서 그 배열에서 가장 큰 값을 반환하는 메소드


public class ArrayQuiz1 {

	public static void array(int[] max) {
		int[] array = max;
		int maximum = 0;
		for (int i = 0; i < max.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}
		System.out.println("최대값은 : " + maximum);
	}


	
	public static void main(String[] args) {
		int[] example1 = {61, 31, 25, 1, 100, 561, 50, 0, 3};
		array(example1);

	}
}