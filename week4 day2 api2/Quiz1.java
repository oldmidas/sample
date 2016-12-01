import java.util.*;

public class Quiz1 {
	public static void main(String[] args) {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("날짜를 입력하세요");
		System.out.print("(ex:2012/12/21)   >");
		String theday = sc.next();

		String[] arr = theday.split("/");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		

		cal.set(year, month-1, day);
		for (int i = 0; i < 11; i++) {
			int temp1 = i;
			int temp2 = 100;
			int temp3 = temp1 * temp2;
			cal.add(Calendar.DATE, temp2);
			System.out.printf(temp3 + "일 뒤 날짜는 : %tF%n", cal);
			temp1++;

		}

		



	}
}