public class Demo4 {
	public static void main(String[] args) {
		// "��Ʈ �� ������"
		// ��Ʈ�� ��ȯ ��, 
		// & = �Ѵ� 1�� ��� 1�� ǥ��,  | = �� �� �ϳ��� 1�� ��� 1�� ǥ��, ^ �ΰ��� ���� �ٸ���� 1�� ǥ���Ѵ�.
		// ~ �� ��Ʈ�� ��ȯ �� ����(0�� 1��, 1�� 0����)�Ѵ�.
		int a = 3;
		int b = 5;

		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);

		// "��Ʈ �̵� ������"
		// ��Ʈ�� ��ȯ��,
		// <<�� �������� �̵�
		// >>�� ���������� �̵�(��ĭ�� ��ȣ��Ʈ�� ���� ������ ä������, -�ǰ�� 1��/ +�� ���� 0����)
		// >>>�� ���������� �̵�(��ȣ��Ʈ�� ������� 0���� ä������)
		int c = -4;

		System.out.println(c << 2);
		System.out.println(c >> 2);	
		System.out.println(c >>> 2);

	}
}


