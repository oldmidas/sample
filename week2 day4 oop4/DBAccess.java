// database(DB) access ����� ������ Ŭ����

public class DBAccess{
	
	// DBAccess��ü�� �����ؼ� static ������ �����Ѵ�.
	private static DBAccess db = new DBAccess();

	//�����ڸ� ����ȭ��Ų��.�����ڸ� �����.
	private DBAccess() {}

	// ������ DBAccess��ü�� ������ �� �ִ� �������� �������ִ� static method�� �����Ѵ�.
	public static DBAccess getInstance() {
		return db;
	}

	public void insert() {
		System.out.println("�߰� �۾�");
	}

	public void update() {
		System.out.println("���� �۾�");	
	}

	public void delete() {
		System.out.println("���� �۾�");	
	}

	public void retrieve() {
		System.out.println("��ȸ �۾�");	
	}
}