import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// �̸��� ������ ������ �� �ִ� ArrayList�����
		ArrayList<String> names = new ArrayList<String>();

		// ArrayList�� String��ü �����ϱ�
		names.add("ȫ�浿");
		names.add("������");
		names.add("�̼���");
		names.add("������");
		names.add("������");
		names.add("������");
		names.add("������");
	
		// ArrayList�� ����� ������Ʈ ���� ��ȸ�ϱ�
		int length = names.size();
		System.out.println(length);

		for (String username : names) {
			System.out.println(username);
		}		
		/*
		for (int i=0; i<length; i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		*/

		// ArrayList�� ������Ʈ�� ����Ǿ� �ִ��� Ȯ���ϱ�
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("������Ʈ�� �����ϴ� ArrayList��.");			
		} else {
			System.out.println("����ִ� ArrayList��.");
		}

		// ArrayList�� ����� ��� ������Ʈ �����ϱ�
		//names.clear();
	}
}