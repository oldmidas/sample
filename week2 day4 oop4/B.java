public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void m2() {
		//System.out.println(x); // static method�� object�� �������� �ʰ� ����� �����ϱ� ������ ��ü�� �� �ʿ��� x variable�� ���� static method�� ���� �� ����. �׷��Ƿ� error.
		// this.variable_name ���ĵ� ����� �Ұ����ϴ�
		System.out.println(y);	// �ݸ� object�� �ʿ���� static variable�� y�� static method���� ����� �����ϴ�.
	}

	public void m3() {
		m1();
		m2();
	}

	public static void m4() {
		//m1(); // m1()�� Object�� member variable�̱� ������, Object�� �����Ҷ��� ����� �����ϹǷ�, static method�� m4()���� ��� �� �� ����. �׷��Ƿ� error.
		m2(); // �ݸ� m2() method�� static �̹Ƿ�, ��ü�� ��� ����� �����ϱ� ������ error�� ���� �ʴ´�
	}

}  