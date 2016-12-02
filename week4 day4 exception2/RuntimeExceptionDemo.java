public class RuntimeExceptionDemo {
	public static void main(String[] args) {

		//��NullPointerException
		//���������� ��ü�� �ּҰ� ��� null�� ����Ǿ� �ִ� ���¿��� �Ӽ��̳� ����� ����� ��� �߻��Ѵ�.
		
		String str = "abcdefg";
		System.out.println(str.length()); // 3�� ���´�

		String[] names = new String[4];
		names[0] = "ȫ�浿";
		names[1] = "������";
		// �������� �ִ� ���鿡 ���ؼ��� NullPointException�� ����صд�.
		
		for (String name : names) {
		/*
			if (name != null) {
				System.out.println(name + ", " + name.length() + "����");
		*/
			System.out.println(name == null ? "����" : name); //���׿�����
		}


		//��IndexOutOfBoundException
		//�迭�̳� String���� �ε��� ������ ��� ���� ������� �� �߻��Ѵ�.
		String str2 = "ab213214214124124124124124124124c";
		if (str2.length() > 30) {
			System.out.println(str2.substring(0, 30) + "...");
		} else {
			System.out.println(str2);
		}


		//��ArithmeticException
		//���ڸ� 0���� ���� �� �߻��Ѵ�.
		//System.out.println(23/0);

		//��ClassCastException
		//Ŭ���� Ÿ�� ����ȯ �������� ������ �ִ� ��� �߻��Ѵ�.
		Phone p1 = new SmartPhone();
		FeaturePhone p2 = (FeaturePhone) p1;
		p2.flip();

	}
	
	public static class Phone {
	
	}

	public static class SmartPhone extends Phone {
		public void internet() {
			System.out.println("���ͳ� ����...");
		}
	}

	public static class FeaturePhone extends Phone {
		public void flip() {
			System.out.println("������ ����/�ݱ�...");
		}
	}
}