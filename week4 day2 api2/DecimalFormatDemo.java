import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		int number = 123456789;

		// 3��° ���ڸ��� ��ǥ���
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);

		String text = df.format(number);
		System.out.println(text);

		double rate = 12.345;
		// �Ҽ��� ���ڸ����� ǥ��, �Ҽ��� 3�ڸ����� �ݿø��ȴ�.
		String pattern2 = "#.##";
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);


		double rate2 = 1125122.345;
		// 3��° ���ڸ��� ��ǥ��� �Ҽ��� ���ڸ����� ǥ��, �Ҽ��� 3�ڸ����� �ݿø��ȴ�.
		String pattern3 = "#,###.####";	//���ڸ��� ä���� �ʴ´�
		String pattern4 = "0,000.0000"; //���ڸ��� 0���� ä���
		DecimalFormat df3 = new DecimalFormat(pattern3);
		DecimalFormat df4 = new DecimalFormat(pattern4);
		String text3 = df3.format(rate2);
		String text4 = df4.format(rate2);

		System.out.println(text3);
		System.out.println(text4);
	}
}