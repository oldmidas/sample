public class ProductApp {
	public static void main(String[] args) {
		
		// ��ǰ�� 5�� ��� �迭�� �����ϱ�
		Product[] products = new Product[5];

		// �迭�� ��ǰ 5�� �����ϱ� //��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���
		products[0] = new Product(1, "�̰��� �ڹٴ�", "�Ѻ��̵��", 30000, 0.3, true);
		products[1] = new Product(5, "�ﱹ��", "��Ǫ��", 20000, 0.2, true);
		products[2] = new Product(10, "��Ÿũ����Ʈ", "���ڵ�", 8000, 0.5, false);
		products[3] = new Product(24, "�߾�", "HTA", 7500, 0.6, true);
		products[4] = new Product(48, "�ظ�����", "���м�ø", 18000, 0.1, true);

		// �迭�� ����� ��ǰ�߿��� �Ǹ����� ��ǰ�� ǥ���ϱ�
		for (Product a : products) {
			if (a.available) {
				System.out.println(a.modelName);
			}
		}

		// �迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�

		for (Product a : products) {
			if (a.price > 10000) {
				System.out.println(a.modelName);
			}
		}

		// �迭�� ����� ��ǰ�� ��ü ������ ���� ǥ���ϱ�
		int total = 0;
		for (Product a : products) {
			total += a.price;
		}
		System.out.println(total);

		products[0].info();
	}
}