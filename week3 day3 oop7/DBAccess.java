//�߻�Ŭ����
public abstract class DBAccess {

	//���� �޼ҵ�
	public void connect() {
		System.out.println("db�� �����մϴ�.");
	}

	// �߻� �޼ҵ�, �߻�ȭ
	public abstract void createRepository();

	//���� �޼ҵ�
	public void disconnect() {
		System.out.println("db�� ������ �����մϴ�.");	
	}
}