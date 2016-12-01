public class StringDemo {
	public static void main(String[] args) {
		/*
			String Ŭ����
				String Ŭ������ ���ڿ��� ǥ���Ѵ�.
				String���� �Һ����̴�. �ѹ� ������� ���Ŀ��� ������ �� ����.
				String�� ��ü�� �����ϴ� Ư���� ����� �����Ѵ�.
					String str = new String("abc");		// �����ڸ� �̿��� String��ü ����
					String str = "abc";					// ���ڿ� ǥ������ �̿��� String ��ü ����
				String str = "abc";
				str.toUpperCase();   -> O
				"abc".toUpperCase(); -> O

		*/

		String str1 = "�ڹ� ���α׷��� ����";


		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : int length()
		int len = str1.length();
		System.out.println("���ڿ��� ���� : " + len);


		// ���ڿ��� ����ִ��� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean isEmpty()
		boolean empty = str1.isEmpty();
		System.out.println("�� ���ڿ��ΰ�? : " + empty);


		// ���ڿ����� �ǹ̾��� ������ ������ ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String trim()
		String str2 = "     ȫ   ��  ��    ";
		String str3 = str2.trim();
		System.out.println("str2["+str2+"]");
		System.out.println("str2["+str3+"]");

		/*
		str2 = str2.trim();	// �����ϴ�
		System.out.println("str2["+str2+"]");
		*/

		// ���ڿ��� ������ ���ؼ� ������ ������ ���� ���ڿ����� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean eqauls(Object str)
		String str4 = "����";
		String str5 = "����";
		boolean equal1 = str4.equals(str5);
		System.out.println("������ ���ڿ��ΰ�? : " + equal1);


		String str6 = "apple";
		String str7 = "Apple";
		System.out.println("������ ���ڿ��ΰ�? : " + str6.equals(str7));
		boolean equal2 = str6.equalsIgnoreCase(str7);
		System.out.println("��ҹ��� ���о��� ������ �� ������ ���ڿ��ΰ�? : " + equal2);



		String str8 = "�ڹ� ���α׷��� - �ڹ� ���� �� ����";

		//���ڿ��� ������ ���ڿ��� �����ϰ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ� : boolean contains(CharSequence(String) s)
		boolean contains = str8.contains("�ڹ�");
		System.out.println("[�ڹ�]��� ���ڿ��� �����ϰ� �ִ°�? : " + contains);


		// ���ڿ����� ������ ��ġ�� ����(char)�� ��ȯ�ϴ� �޼ҵ� : char charAt(int index)
		char ch = str8.charAt(1);
		System.out.println("1��° ���ڴ�? " + ch);
		
		// ���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ� : int indexOf(String str)
		int index = str8.indexOf("��");
		System.out.println("���ڿ����� [��]�̶�� ���ڰ� ó������ �����ϴ� ��ġ��? " + index);

		// ���ڿ��� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ� : String replace(String target, String newStr)
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println(str8);
		System.out.println(str9);

		// ���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String sub1 = str10.substring(5);
		System.out.println("5��°���� �߶� ���ڿ�: " + sub1);

		// ���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ� : String substring(int begin, int end), end�� �Էµ� end��° ���ڿ��� ���Ե��� �ʴ´�
		String sub2 = str10.substring(0, 4);
		System.out.println("0�������� 4��°���� �߶� ���ڿ�: " + sub2);

		String name = "ȫ�浿";
		System.out.println("��: " + name.substring(0, 1));

		// ���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ�: String[] split(String delim)
		String text = "����,���,��õ,����,�λ�,����,���,�뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);
		System.out.println(area[5]);

		// ���ڿ��� �ҹ���/�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		// String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		// str11 = str11.toUpperCase(); --> �����ϴ�
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]");
		System.out.println("str12 ["+str12+"]");

		// ����, �Ǽ�, �Ҹ���, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�Ѵ�.
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		String str13 = String.valueOf(number); // ���� 1234�� ���ڿ� "1234"�� ��ȯ
		System.out.println(str13);
		System.out.println("���� �ڸ��� : " + str13.substring(str13.length()-1));

		String str14 = 1234 + ""; // ���ڷ� ��ȯ�ȴ�.

	}
	
}