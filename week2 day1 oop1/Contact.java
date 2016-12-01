public class Contact {
	// 속성 정의하기

	// 순번
	int no;

	// 이름
	String name;

	// 연락처
	String phone;

	// 이메일
	String email;

	

	// 기능 정의하기

	// 전화하기 call()
	public void call() {
		System.out.println(name);
		System.out.println(phone + "(으)로 전화를 겁니다.");
	}


	// 문제보내기 sendMessage()
	public void sendMessage() {
		System.out.println(name);
		System.out.println(phone + "(으)로 메세지를 보냅니다.");
	}


	// 메일보내기 sendMail()
	public void sendMail() {
		System.out.println(name);
		System.out.println(email + "(으)로 이메일을 보냅니다.");	
	}

}