public class ArrayDemo2 {
	public static void main(String[] args) {
		//�迭 �����ϱ�
		// int[] arr1 = {1, 3, 6};	  <-- ���� ������ �ִ� �迭 ����
		// int[] arr2 = new int[3];	  <-- ���� 3�� ���� �� �ִ� �迭 ����, ������ �迭�� �⺻���� '0'���� ä���� �ִ�.

		// #�� �迭�� ���(heap ����),
		// ________________________________________________________________________________________
		// |�������� 0 | �Ǽ����� 0.0 | ������(char)�� \u0000 | boolean���� false | �������� null |
		// ����������������������������������������������������������������������������������������
		// ���� �� �� ä������.
		int[] integers = new int[3];
		System.out.println("������: " + integers[0]);
		System.out.println("������: " + integers[1]);
		System.out.println("������: " + integers[2]);
		System.out.println(integers);
		

		String[] strings = new String[3];
		System.out.println("������: " + strings[0]);
		System.out.println("������: " + strings[1]);
		System.out.println("������: " + strings[2]);
		System.out.println(strings);
		

		double[] doubles = new double[3];
		System.out.println("�Ǽ���: " + doubles[0]);
		System.out.println("�Ǽ���: " + doubles[1]);
		System.out.println("�Ǽ���: " + doubles[2]);


		boolean[] booleans = new boolean[3];
		System.out.println("�Ҹ���: " + booleans[0]);
		System.out.println("�Ҹ���: " + booleans[1]);
		System.out.println("�Ҹ���: " + booleans[2]);


		char[] characters = new char[3];
		System.out.println("���ڰ�: " + characters[0]);
		System.out.println("���ڰ�: " + characters[1]);
		System.out.println("���ڰ�: " + characters[2]);

		

	}
}