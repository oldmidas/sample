//배열과 숫자를 전달받아서 평균내기

public class Average {
	public double averageCal(int[] array) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		avg = (double)sum / (double)array.length;
		return avg;
	}
}