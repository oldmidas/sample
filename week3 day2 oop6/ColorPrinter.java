public class ColorPrinter extends Printer {
	int dpi;
	
	/*
	public void colorPrint(String text) {
		System.out.println("["+text+"]�� �÷η� �μ��մϴ�.");
	}
	*/
	//�θ�Ŭ����(printer)�� print() �޼ҵ� ������
	public void print(String text) {
		System.out.println("["+text+"]�� �÷η� �μ��մϴ�.");
	}

	public void chargeInk() {
		System.out.println("��ũ�� �����մϴ�.");
	}

}