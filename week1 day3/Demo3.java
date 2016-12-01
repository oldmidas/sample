public class Demo3 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? A : B
		// 조건식 ?  참일때 수행할 연산식 혹은 값 : 거짓일때 수행할 연산식 혹은 값 
		
		// 점수가 60점 이상이면 "합격", 미만이면 "불합격"으로 판정한다.
		int score = 57;
		String result1 = (score >= 60 ? "\"합격\"" : "\"불합격\"");
		System.out.println("판정결과 :  " + result1);

		// 구매금액이 50000원 이상이면 배송비가 무료, 미만이면 2500원 배송비가 더해진다.
		int price = 25000;
		int creditPrice = (price >= 50000 ? price : price + 2500);
		System.out.println("결제금액: " + creditPrice);
	}
}