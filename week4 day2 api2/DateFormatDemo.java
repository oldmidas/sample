import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {
		Date now = new Date();

		//String pattern = "yyyy.MM.dd E���� a hh:mm:ss";
		//String pattern = "yy�� M�� d�� E����";
		String pattern = "a h�� m�� s��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);
		System.out.println(text);
	}
}