public class Library {
	private Book[] db = new Book[100];
	private int position = 0;

	public void addBook(Book newbook) throws LibraryException {
		for (Book book : db) {
			if (book != null) {
				if (book.getNumber() == newbook.getNumber()) {
					throw new LibraryException("�ߺ��� ��ȣ�� �ֽ��ϴ�.");	
				}
			}
		}
		db[position] = newbook;
		position++;
	}

	public void findBooksByNumber(int no) throws LibraryException {
		boolean isExist = false;
		for (Book book : db) {
			if (book != null) {
				if (book.getNumber() == no) {
					isExist = true;
					book.displayInfo();
				}
			}
		}

		if (!isExist) {
			throw new LibraryException("��ϵ� ��ȣ�� �����ϴ�.");
		}
	}

	public void findBooksByTitle(String title) throws LibraryException {
		boolean isExist = false;
		for (Book book : db) {
			if (book != null) {
				if (book.getTitle().contains(title)) {
					isExist = true;
					book.displayInfo();
				}
			}
		}

		if (!isExist) {
			throw new LibraryException("��ϵ� ������ �����ϴ�.");
		}
	
	}

	public void findBooksByGenre(String genre) throws LibraryException {
		boolean isExist = false;
		for (Book book : db) {
			if (book != null) {
				if (book.getGenre().equals(genre)) {
					isExist = true;
					book.displayInfo();
				}
			}
		}

		if (!isExist) {
			throw new LibraryException("��ϵ� �帣�� �����ϴ�.");
		}
	}
}