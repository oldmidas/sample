import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz4 {
	public static void main(String[] args) {
		// 아이디를 입력받아서 올바른 아이디인지 검사하기
		// 아이디 작성 규칙(길이가 6글자 이상, 영어소문자)
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디를 입력하세요:");
		String userId = sc.next();
		
		//검사하기

		//아이디가 6글자 이상인지 검사하기
		if (userId.length() < 6) {
			System.out.println("6글자를 넘겨주세요.");
			return;
		}
		//아이디가 영어 소문자로만 구성되어 있는지 검사하기 <---- boolean
		boolean invalid; //	<---- flag변수 : 로직 수행의 특정상태를 저장하는 변수
		for (int i = 0; i < userId.length(); i++) {
			int number = userId.charAt(i);
			if ( number < 97 || number > 123) {
				invalid = true;
				System.out.println("소문자만 사용하세요.");
				return;
			} else {
				invalid = true;
			}
		}

		// 정규 표현식
		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
						//^는 시작, $는 끝
		valid = Pattern.matches(regExp, userId);

		if (!valid) {
			System.out.println("유효하지않음");
		}
	}
}