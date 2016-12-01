import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String text = "�� ���� ��ȣ���� 27�� �������� ���� �� ���� 2014�� 6��7���� û�ʹ� �񼭽��� �������� ��� �� ����� �� �� �� ��ȭü�������� ����, ������ ��ü�� ��� �����ڸ� ���� ����� �ִٸ� �ּ��� �� �Ұ��� �� �� ������ �����ٰ� ������ ���� �� ����.";
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("�ܾ� ���� : "+length);

		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ���� : " + st.countTokens());
		}
		
			/*
				StringTokenizer
					-���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
					-new StringTokenzier(�ؽ�Ʈ);		// �����ڸ� �������� ������ ������ �����ڰ� �ȴ�.
					-new StringTokenizer(�ؽ�Ʈ, ������);

					-boolean hasMoreTokens()	: �������� ���� ��ū�� �����ϸ� true�� ��ȯ�Ѵ�.
					-String nextToken()			: ��ū(���ڿ�)�� ������.
			*/
		/*
		String[] tokens = text.split("  ");
		System.out.println("�ܾ� ���� : "+ tokens.length);
		*/
		}
}
