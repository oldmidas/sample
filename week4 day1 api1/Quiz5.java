//import java.util.StringTokenizer;

public class Quiz5 {
	public static void main(String[] args) {
		String[] words = {"새끼", "놈", "년", "병신"};
		String text = "박ㄱㄴ 나쁜 년 빨리 내려와";

		// 위에서 나열한 금칙어가 포함되어 있는지 여부를 확인하기
		boolean isContains = false;


		for (int i = 0; i < words.length; i++) {
			if (text.contains(words[i])) {
				System.out.println("욕하지마세요.");
				isContains = true;
				}
		}

		for (String word : words) {
			if (text.contains(word)) {
				System.out.println("욕하지마세요.");
				isContains = true;
			}
		}

		/*
		StringTokenizer tokens = new StringTokenizer(text);
		while (tokens.hasMoreTokens()) {
			String token = tokens.nextToken();
			for (int i = 0; i < words.length; i++) {
				if (token == words[i]) {
					System.out.println("욕하지마세요.");
					isContains = true;
				} 
			}
		}
		*/
		
	}
}