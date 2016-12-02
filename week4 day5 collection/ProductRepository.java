import java.util.ArrayList;

public class ProductRepository {
	ArrayList<Product> db = new ArrayList<Product>();

	// ���ο� ��ǰ��ü�� ���޹޾Ƽ� �̸� ������ ArrayList�� �����ϴ� �޼ҵ�
	public void addProduct(Product item) {
		db.add(item);
	}

	// ��ǰ�̸��� ���޹޾Ƽ� ArrayList���� �� ��ǰ�̸��� �ش��ϴ� ��ǰ�� ã�Ƽ� ��ȯ�ϴ� �޼ҵ�
	public Product findProduct(String name) throws ProductException {
		Product result = null;
		for (Product p : db) {
			if(p.getName().equals(name)) {
				result = p;
			} else {
				throw new ProductException("�����߻� �Դϴ�");
			}
		}
		return result;
	}

	// ArrayList�� ����� ��� ��ǰ������ ����ϴ� �޼ҵ�
	public void displayProducts() throws ProductException {
		for (Product p : db) {
			if (db.isEmpty()) {
				throw new ProductException("�����߻� �Դϴ�");
			} else { 
				System.out.printf("%d %s\n", p.getNo(), p.getName());
			}
		}
		
		
	}
}