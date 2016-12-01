public class BookQuiz {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);

		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);

		int pencils = 534;
		int students = 30;

		//학생 한명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);

		int pencilLeft = (pencils % students);
		System.out.println(pencilLeft);

		int value = 356;
		System.out.println((value/100)*100);

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height)/(double)2;
		System.out.println(area);

		int a = 10;
		int b = 5;

		System.out.println( (a>7) && (b<=5) );
		System.out.println( (a%3 == 2) || (y%2 != 1) );

		double c = 5.0;
		double d = 0.0;

		double e = c % d;

		if (Double.isNaN(e)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result2 = e + 10;
			System.out.println("결과: " + result2);
		}
	}
}