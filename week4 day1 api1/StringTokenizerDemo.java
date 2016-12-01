import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String text = "차 씨의 변호인이 27일 취재진과 만나 차 씨가 2014년 6∼7월께 청와대 비서실장 공관에서 당시 김 실장과 김 종 전 문화체육관광부 차관, 정성근 문체부 장관 내정자를 만난 사실이 있다며 최순실 씨 소개로 김 전 실장을 만났다고 주장한 것이 그 계기다.";
		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("단어 개수 : "+length);

		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("남은 토큰 갯수 : " + st.countTokens());
		}
		
			/*
				StringTokenizer
					-문자열을 구분자를 기준으로 잘라서 토큰으로 만든다.
					-new StringTokenzier(텍스트);		// 구분자를 지정하지 않으면 공백이 구분자가 된다.
					-new StringTokenizer(텍스트, 구분자);

					-boolean hasMoreTokens()	: 다음번에 꺼낼 토큰이 존재하면 true를 반환한다.
					-String nextToken()			: 토큰(문자열)을 꺼낸다.
			*/
		/*
		String[] tokens = text.split("  ");
		System.out.println("단어 개수 : "+ tokens.length);
		*/
		}
}
