//import java.util.StringTokenizer;

public class Quiz5 {
	public static void main(String[] args) {
		String[] words = {"����", "��", "��", "����"};
		String text = "�ڤ��� ���� �� ���� ������";

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���θ� Ȯ���ϱ�
		boolean isContains = false;


		for (int i = 0; i < words.length; i++) {
			if (text.contains(words[i])) {
				System.out.println("������������.");
				isContains = true;
				}
		}

		for (String word : words) {
			if (text.contains(word)) {
				System.out.println("������������.");
				isContains = true;
			}
		}

		/*
		StringTokenizer tokens = new StringTokenizer(text);
		while (tokens.hasMoreTokens()) {
			String token = tokens.nextToken();
			for (int i = 0; i < words.length; i++) {
				if (token == words[i]) {
					System.out.println("������������.");
					isContains = true;
				} 
			}
		}
		*/
		
	}
}