public class Demo10 {
	public static void main(String[] args) {
		// ����Ŀ����� ����ȯ
		int a = 4;
		int b = 5;
		int c = a/b;
		// ���꿡 ������ ���� �����̱� ������, ������ ��� 0.8�� ���� 0���� ��ȯ�� ������� �������.
		System.out.println(c);

		System.out.println(a/(double)b);

		double d = a/(double)b; // -> 4/5.0 -> 4.0 / 5.0 -> 0.8
		System.out.println(d);
	}
}