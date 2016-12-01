//배열과 숫자를 전달받아서 그 배열에 그 숫자가 포함되어 있는지 여부를 반환하는 메소드

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
			System.out.println("포함");
		} else {
			System.out.println("미포함");
		}
	}
}