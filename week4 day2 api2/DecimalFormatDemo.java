import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		int number = 123456789;

		// 3번째 숫자마다 쉼표찍기
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);

		String text = df.format(number);
		System.out.println(text);

		double rate = 12.345;
		// 소수점 두자리까지 표현, 소수점 3자리에서 반올림된다.
		String pattern2 = "#.##";
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);


		double rate2 = 1125122.345;
		// 3번째 숫자마다 쉼표찍고 소수점 두자리까지 표현, 소수점 3자리에서 반올림된다.
		String pattern3 = "#,###.####";	//빈자리를 채우지 않는다
		String pattern4 = "0,000.0000"; //빈자리를 0으로 채운다
		DecimalFormat df3 = new DecimalFormat(pattern3);
		DecimalFormat df4 = new DecimalFormat(pattern4);
		String text3 = df3.format(rate2);
		String text4 = df4.format(rate2);

		System.out.println(text3);
		System.out.println(text4);
	}
}