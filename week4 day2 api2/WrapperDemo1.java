public class WrapperDemo1 {
	public static void main(String[] args) {

		// ���� 23�� ������ �ִ� Integer��ü �������� a
		Integer a = new Integer(12345);	// <--- �ڽ�(Boxing)
		// Integer��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ� : int intValue();
		int x = a.intValue();			// <--- ��ڽ�(unBoxing)
		double y = a.doubleValue();

		System.out.println("x :" + x);
		System.out.println("y :" + y);

		// ���� 23�� �����ϰ� �ִ� ���� b
		int b = 12345;
	}

}