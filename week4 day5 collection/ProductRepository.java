import java.util.ArrayList;

public class ProductRepository {
	ArrayList<Product> db = new ArrayList<Product>();

	// 새로운 상품객체를 전달받아서 미리 생성한 ArrayList에 저장하는 메소드
	public void addProduct(Product item) {
		db.add(item);
	}

	// 상품이름을 전달받아서 ArrayList에서 그 상품이름에 해당하는 상품을 찾아서 반환하는 메소드
	public Product findProduct(String name) throws ProductException {
		Product result = null;
		for (Product p : db) {
			if(p.getName().equals(name)) {
				result = p;
			} else {
				throw new ProductException("오류발생 입니다");
			}
		}
		return result;
	}

	// ArrayList에 저장된 모든 상품정보를 출력하는 메소드
	public void displayProducts() throws ProductException {
		for (Product p : db) {
			if (db.isEmpty()) {
				throw new ProductException("오류발생 입니다");
			} else { 
				System.out.printf("%d %s\n", p.getNo(), p.getName());
			}
		}
		
		
	}
}