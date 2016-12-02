public class Library {
	private Book[] db = new Book[100];
	private int position = 0;

	public void addBook(Book newbook) throws LibraryException {
		for (Book book : db) {
			if (book != null) {
				if (book.getNumber() == newbook.getNumber()) {
					throw new LibraryException("중복된 번호가 있습니다.");	
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
			throw new LibraryException("등록된 번호가 없습니다.");
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
			throw new LibraryException("등록된 제목이 없습니다.");
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
			throw new LibraryException("등록된 장르가 없습니다.");
		}
	}
}
