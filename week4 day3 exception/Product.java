public class Product {
	private String name;
	private String maker;
	private int price;
	private double discount;

	public Product () {}
	public Product (String name, String maker, int price, double discount) {
		this.name=name;
		this.maker=maker;
		this.price=price;
		this.discount=discount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker=maker;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}

	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	
	public String toString() {
		return "제품명:" + name + "가격" + price;
	}
	


}