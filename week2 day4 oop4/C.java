public class C {

	int x;
	static int y;

	// static initialization block
	// ���������� �ʱ�ȭ �۾��� �ʿ��� ���๮(running command line)�� ���´�
	// �ַ� ���α׷� ���࿡ ���Ǵ� �ܺ� ���ҽ� �����۾��� �����Ѵ�.
	static {
		System.out.println("�ʱ�ȭ ����� �����");
		// static variables & static methods are usable.
	}

	public C() {
		System.out.println("�����ڰ� �����");		
	}

}