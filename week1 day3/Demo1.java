public class Demo1 {
	public static void main(String[] args) {
		//�� ������
		int x = 10;
		int y = 10;

		boolean result1 = false && x++ > 10; // &&�� ����߱� ������, �տ��� false�� �� x++�� ������ ���� �ʾҴ�.
		boolean result2 = false &  y++ > 10; // &�� ����߱� ������, �տ��� false���� �� x++�� ������ �غ���.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x:" + x); // ��� 10
		System.out.println("y:" + y); // ��� 11
	}
}