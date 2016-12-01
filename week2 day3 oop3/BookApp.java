public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];
		bookCart[0] = new Book(1, "�̰��� �ڹٴ�", "�̼���", "�Ѻ��̵��", 35000, "2015-10-10");
		bookCart[1] = new Book(2, "�ڹ� �� �׼�", "������", "�Ѻ��̵��", 33000, "2016-05-10");
		bookCart[2] = new Book(3, "������ �����ӿ�ũ", "��ù�", "�Ѻ��̵��", 27000, "2013-01-10");
		bookCart[3] = new Book(4, "������ ��ť��Ƽ", "����", "�Ѻ��̵��", 26000, "2014-04-10");
		bookCart[4] = new Book(7, "�ڹ� �� ���α׷���", "�����", "�Ѻ��̵��", 30000, "2015-11-23");

		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for (Book a : bookCart) {
			System.out.println(a.getTitle());
		}

		// īƮ�� �����å���� ���� ������ ǥ���ϱ�
		int total = 0;
		for (Book a : bookCart) {
			total += a.getPrice();
		}
		System.out.println(total);

		// īƮ�� ����� å�߿��� ���� ��� ������ å ����� ������ ǥ���ϱ�
		int maxPrice = 0;
		String maxTitle = null;
		for (Book a : bookCart) {
			if (maxPrice < a.getPrice()) {
				maxPrice = a.getPrice();
				maxTitle = a.getTitle();
			}
		}
		System.out.println(maxPrice);
		System.out.println(maxTitle);



	}
}