public class Product {
	//	�Ӽ�
	//	��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���
	int modelNum;
	String modelName;
	String manufacturer;
	int price;
	double saleRate;
	boolean available;

	//	������
	//	�⺻������, �Ű����� �ִ� ������
	public Product () {
	}

	public Product (int a, String b, String c, int d, double e, boolean f) {
		modelNum = a;
		modelName = b;
		manufacturer = c;
		price = d;
		saleRate = e;
		available = f;
	}

	//	���
	//	���ε� ������ ��ȯ�ϴ� �޼ҵ�
	public int salePrice() {
		int salePrice = 0;
		salePrice = price * (int)saleRate;
		return salePrice;
	}

	public String truefalse() {
		if (available) {
			return "�� �� ��";
		} else {
			return "�Ǹ�����";
		}
	}

	//	��ǰ������ ��� ����ϴ� �޼ҵ�(���ΰ� ����)
	public void info() {

		System.out.println("��ǰ��ȣ: " + modelNum);
		System.out.println("�� ǰ ��: " + modelName);
		System.out.println("�� �� ��: " + manufacturer);
		System.out.println("��    ��: " + price + "��");
		System.out.println("��    ��: " + (int)(saleRate*100) + "%");
		System.out.println("�� �� ��: " + salePrice() + "��");
		System.out.println("�Ǹſ���: " + truefalse());

	}

}