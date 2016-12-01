public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];
		bookCart[0] = new Book(1, "이것이 자바다", "이순신", "한빛미디어", 35000, "2015-10-10");
		bookCart[1] = new Book(2, "자바 인 액션", "류성룡", "한빛미디어", 33000, "2016-05-10");
		bookCart[2] = new Book(3, "스프링 프레임워크", "김시민", "한빛미디어", 27000, "2013-01-10");
		bookCart[3] = new Book(4, "스프링 시큐리티", "권율", "한빛미디어", 26000, "2014-04-10");
		bookCart[4] = new Book(7, "자바 웹 프로그래밍", "곽재우", "한빛미디어", 30000, "2015-11-23");

		// 카트에 저장된 모든 책들의 제목을 표시하기
		for (Book a : bookCart) {
			System.out.println(a.getTitle());
		}

		// 카트에 저장된책들의 가격 총합을 표시하기
		int total = 0;
		for (Book a : bookCart) {
			total += a.getPrice();
		}
		System.out.println(total);

		// 카트에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을 표시하기
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