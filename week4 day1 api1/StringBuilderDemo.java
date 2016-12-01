public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("중앙hta학원");
		sb.append("정규과정 안내");
		sb.append("\n");
		sb.append("전자정부표준프레임워크 과정,");
		sb.append("소프트웨어 응용프로그램 개발자 과정");
		sb.append("수강기간(일):");
		sb.append(120);

		/*
		sb.append("a").append("b").append("C");

		sb.append("a")
			.append("b")
			.append("C"); ==> 메소드 체이닝(method chaining)
		*/

		String text = sb.toString();
		System.out.println(text);
	}
}