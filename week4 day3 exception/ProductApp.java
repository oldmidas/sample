import java.io.*;

public class ProductApp {

	// 상품정보 텍스트 한줄을 전달받아서
	// 잘 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseData(String text) {

		String[] arr = text.split(",");
		Product product = new Product(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
		
		return product;
	}

	public static void main(String[] args) throws Exception {
		Product[] products = new Product[4];
		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));
		products[0] = parseData(reader.readLine());
		products[1] = parseData(reader.readLine());
		products[2] = parseData(reader.readLine());
		products[3] = parseData(reader.readLine());

		for (Product p : products) {
			System.out.printf("%s %s %d %f\n", p.getName(), p.getMaker(), p.getPrice(), p.getDiscount());
		}

		/*
		String text1 = reader.readLine();
		String text2 = reader.readLine();
		String text3 = reader.readLine();
		String text4 = reader.readLine();

		Product p1 = parseData(text1);
		Product p2 = parseData(text2);
		Product p3 = parseData(text3);
		Product p4 = parseData(text4);

		products[0] = p1;
		products[1] = p2;
		products[2] = p3;
		products[3] = p4;

		System.out.println(products[0].toString());
		*/

	}
}