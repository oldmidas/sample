public class ForDemo6 {	
	public static void main (String[] args) {
		// 1~100������ ���� ����ϱ�
		// ��, �հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���
	int total = 0;
	int number = 0;
	for (int a = 0; a <= 100; a++) {
		number = a;
		total += a;
		if (total >= 3000) {
			System.out.println(number);
			System.out.println(total);
			break;
		}
	}
	
	}
}