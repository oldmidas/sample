public class Product {
	//	속성
	//	상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부
	int modelNum;
	String modelName;
	String manufacturer;
	int price;
	double saleRate;
	boolean available;

	//	생성자
	//	기본생성자, 매개변수 있는 생성자
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

	//	기능
	//	할인된 가격을 반환하는 메소드
	public int salePrice() {
		int salePrice = 0;
		salePrice = price * (int)saleRate;
		return salePrice;
	}

	public String truefalse() {
		if (available) {
			return "판 매 중";
		} else {
			return "판매중지";
		}
	}

	//	상품정보를 모두 출력하는 메소드(할인가 포함)
	public void info() {

		System.out.println("상품번호: " + modelNum);
		System.out.println("상 품 명: " + modelName);
		System.out.println("제 조 사: " + manufacturer);
		System.out.println("정    가: " + price + "원");
		System.out.println("세    일: " + (int)(saleRate*100) + "%");
		System.out.println("할 인 가: " + salePrice() + "원");
		System.out.println("판매여부: " + truefalse());

	}

}