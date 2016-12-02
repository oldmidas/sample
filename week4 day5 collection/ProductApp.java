import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductRepository repo = new ProductRepository();
		while (true) {
			// �Է°��� �о����
			System.out.println("��ǰ��ȣ�� �Է��ϼ���.");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("��ǰ���� �Է��ϼ���.");
			String name = sc.nextLine();
		
		}
		try {
			// �Է°��� ���� ��ü �����
			Product p = new Product();

			// ������ ��ü�� �Է°� ���
			p.setNo(no);
			p.setName(name);

			// db�� ���� �������ִ� �޼ҵ忡 ���� ��� �ִ� ��ü�� �����ϱ�
			repo.addProduct(p);

			repo.displayProducts();
		} catch (ProductException e) {
			System.out.println("����" + e.getMessage());
		} catch (Exception e) {
			System.out.println("����" + e.getMessage());
		}

	}
}