import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//�޴��̸��� �����ϴ� HashSet��ü �����
		HashSet<String> menuset = new HashSet<String>();

		System.out.println(menuset.add("û����"));
		System.out.println(menuset.add("�����"));
		System.out.println(menuset.add("�κ�����"));
		System.out.println(menuset.add("�ѿ�������"));
		System.out.println(menuset.add("Ȳ������"));
		System.out.println(menuset.add("��������"));
		System.out.println(menuset.add("��������"));
		System.out.println(menuset.add("��������"));
		System.out.println(menuset.add("��������"));

		String a = "��������";
		String b = "��������";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		int len = menuset.size();
		System.out.println("����� ����: " + len);

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}