public class PhotoPrinter extends Printer {
	int size;

	
	/*
	public void photoPrint(String data) {
		System.out.println("["+data+"]를 사진인화지에 인쇄합니다.");
	}
	*/

	//부모클래스(printer)의 print() 메소드 재정의
	public void print(String data) {
		System.out.println("["+data+"]를 사진인화지에 인쇄합니다.");
	}

	public void edit() {
		System.out.println("사진을 편집합니다.");
	}
}