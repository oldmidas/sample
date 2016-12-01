public class Product {

	int no;
	String name;
	String maker;
	int price;
	double discountRate;

	public Product() {}

	/*
	public Product(int a, String b, String c, int d, double e) {
		no = a;
		name = b;
		maker = c;
		price = d;
		discountRate = e;
	}
	*/
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getMaker() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public int getDiscountPrice() {
		return (int) (price * (1-discountRate));
	}



	public Product(int no, String name, String maker, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void info() {
		System.out.printf("%d %s %s %d %2.2f\n",
							no, name, maker, price, discountRate);
	}

}