public class MemberApp {
	public static void main(String[] args) {
		// ȸ�������� ������� Member ��ü�� �����ϰ�
		Member m1 = new Member();
		// setter�� ����ؼ� �̸�, ���̵�, ���, ���� ���� �����͸� �����ϱ�
		m1.setName("ȫ�浿");
		m1.setId("hong");
		m1.setPassword("1234");
		m1.setAge(28);

		// ������ Member ��ü�� ����� ���� getter�Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.println("��    ��: " + m1.getName());
		System.out.println("�� �� ��: " + m1.getId());
		System.out.println("�н�����: " + m1.getPassword());
		System.out.println("��    ��: " + m1.getAge());

	}
}