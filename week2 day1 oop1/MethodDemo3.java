import java.util.Random;
import java.util.Date;

public class MethodDemo3 {

	// ������ �߻���Ű�� �޼ҵ� �����
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100);
		
		// return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		return number;
		//return 1.0;  // ����
	
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
		//System.out.println(a() * 100);  // ����
		
		String d = getCurrentDate();
		System.out.println(d);
		System.out.println(getCurrentDate());

	}

}