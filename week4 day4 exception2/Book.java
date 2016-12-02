public class Book {
	private int number;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String genre;

	public Book() {}

	public Book(int number, String title, String author, String publisher, int price, String genre) {
		this.number=number;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
		this.genre=genre;
	}

	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number=number;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title=title;
	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}

	public String getGenre() {
		return this.genre;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}

	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price=price;
	}

	public void displayInfo() {
		System.out.println("\n책번호 : " + getNumber()+ " 제목 : " + getTitle() + " 장르 : " + getGenre() + " 저자 : " + getAuthor() + "\n");
	}
}