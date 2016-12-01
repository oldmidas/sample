public class Quiz2 {
	public static void main(String[] args) {
		String text = "<hong@naver.com>,<kimg@hanmail.net>,<kang@naver.com>,<yushin@daum.net>";
				
		String[] emails = text.split(",");

		for (String temp : emails) {
			int i = 0;
			int a = temp.indexOf("<");
			int b = temp.indexOf(">");
			emails[i] = temp.substring(a+1, b);
			System.out.println(emails[i]);
			i++;
		}

		for (String temp : emails) {
			mail = mail.substring(1, mail.length()-1);
			System.out.println(mail);
		}

		for (String mail : emails) {
			mail = mail.replace("<", "").replace(">", "");
			System.out.println(mail);
		}




	}
}