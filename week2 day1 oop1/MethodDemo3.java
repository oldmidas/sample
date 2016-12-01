import java.util.Random;
import java.util.Date;

public class MethodDemo3 {

	// 난수를 발생시키는 메소드 만들기
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100);
		
		// return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.
		return number;
		//return 1.0;  // 에러
	
	}
	
	public static String getCurrentDate() {
		Date now = new Date();
		String str = now.toString();

		return str;
	}

	
	public static void a() {
	
	}
	

	public static void main(String[] args) {
		int x = random();
		System.out.println(x);
		System.out.println(random());

		int y = random() * random();
		System.out.println(y);

		System.out.println(random() * 100);
		//System.out.println(a() * 100);  // 에러
		
		String d = getCurrentDate();
		System.out.println(d);
		System.out.println(getCurrentDate());

	}

}