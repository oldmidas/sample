public class PhotoPrinter extends Printer {
	int size;

	
	/*
	public void photoPrint(String data) {
		System.out.println("["+data+"]�� ������ȭ���� �μ��մϴ�.");
	}
	*/

	//�θ�Ŭ����(printer)�� print() �޼ҵ� ������
	public void print(String data) {
		System.out.println("["+data+"]�� ������ȭ���� �μ��մϴ�.");
	}

	public void edit() {
		System.out.println("������ �����մϴ�.");
	}
}