public class Demo1 {
	public static void main(String[] args) {
		//���� Ÿ��
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128;			 byte �ڷ����� ����(-128 ~ 127)�� ��� ���� ������ �߻���Ų��.

		int a1 = 128;
		int a2 = -128;
		int a3 = 10000;

		long c1 = 10000;
		// ������ ������ int�� ������ ����� ���� ���, �ݵ�� ���ڳ��� L�� ǥ���ؾ� �Ѵ�.
		long c2 = 100000000000L;
		
		int m1 = 10;  //10����
		int m2 = 012; //�� ���� 0���� �����ϴ� ���ڴ� 8����
		int m3 = 0xA; //�� ���� 0x�� �����ϴ� ���ڴ� 2����

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// java7���� ���ڸ� ���� �� �ڸ����� ǥ���ϱ� ���ؼ� _(�����) ����� �����ϴ�.
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4 * m5);

	}
}