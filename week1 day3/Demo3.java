public class Demo3 {
	public static void main(String[] args) {
		// ���� ������
		// ���ǽ� ? A : B
		// ���ǽ� ?  ���϶� ������ ����� Ȥ�� �� : �����϶� ������ ����� Ȥ�� �� 
		
		// ������ 60�� �̻��̸� "�հ�", �̸��̸� "���հ�"���� �����Ѵ�.
		int score = 57;
		String result1 = (score >= 60 ? "\"�հ�\"" : "\"���հ�\"");
		System.out.println("������� :  " + result1);

		// ���űݾ��� 50000�� �̻��̸� ��ۺ� ����, �̸��̸� 2500�� ��ۺ� ��������.
		int price = 25000;
		int creditPrice = (price >= 50000 ? price : price + 2500);
		System.out.println("�����ݾ�: " + creditPrice);
	}
}