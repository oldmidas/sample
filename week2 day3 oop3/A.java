public class A {
	String number = "��ü ����";

	public void m() {
		String number = "�޼ҵ� ����";

		System.out.println("�޼ҵ� m�� ���� number == " + number);
		System.out.println("��ü m�� ���� number == " + this.number);
	}
}