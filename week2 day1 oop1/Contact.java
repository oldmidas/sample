public class Contact {
	// �Ӽ� �����ϱ�

	// ����
	int no;

	// �̸�
	String name;

	// ����ó
	String phone;

	// �̸���
	String email;

	

	// ��� �����ϱ�

	// ��ȭ�ϱ� call()
	public void call() {
		System.out.println(name);
		System.out.println(phone + "(��)�� ��ȭ�� �̴ϴ�.");
	}


	// ���������� sendMessage()
	public void sendMessage() {
		System.out.println(name);
		System.out.println(phone + "(��)�� �޼����� �����ϴ�.");
	}


	// ���Ϻ����� sendMail()
	public void sendMail() {
		System.out.println(name);
		System.out.println(email + "(��)�� �̸����� �����ϴ�.");	
	}

}