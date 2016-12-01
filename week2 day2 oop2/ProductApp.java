public class ProductApp {
	public static void main(String[] args) {
		
		// 상품을 5개 담는 배열을 정의하기
		Product[] products = new Product[5];

		// 배열에 상품 5개 저장하기 //상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부
		products[0] = new Product(1, "이것이 자바다", "한빛미디어", 30000, 0.3, true);
		products[1] = new Product(5, "삼국지", "늘푸른", 20000, 0.2, true);
		products[2] = new Product(10, "스타크래프트", "블리자드", 8000, 0.5, false);
		products[3] = new Product(24, "중앙", "HTA", 7500, 0.6, true);
		products[4] = new Product(48, "해리포터", "문학수첩", 18000, 0.1, true);

		// 배열에 저장된 상품중에서 판매중인 상품만 표시하기
		for (Product a : products) {
			if (a.available) {
				System.out.println(a.modelName);
			}
		}

		// 배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기

		for (Product a : products) {
			if (a.price > 10000) {
				System.out.println(a.modelName);
			}
		}

		// 배열에 저장된 상품의 전체 가격의 합을 표시하기
		int total = 0;
		for (Product a : products) {
			total += a.price;
		}
		System.out.println(total);

		products[0].info();
	}
}