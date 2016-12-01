//배열을 전달받아서 그 배열에서 가장 작은 값을 반환하는 메소드

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
		System.out.println("최대값은 : " + maximum);
		System.out.println("최소값은 : " + minimum);
		
	}

}