public class MemberServiceApp {
	public static void main(String[] args) {
		/*
			이름:		홍길동
			아이디:		hong
			비밀번호:	1234
			나이:		30
			정보를 가진 Member객체를 담고있는 MemberService 객체 생성하기.

		*/
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setId("hong");
		m1.setPassword("1234");
		m1.setAge(30);
		MemberService service = new MemberService(m1);
	
		System.out.println(service.isAuth());
		
		service.login("hong", "1234");
		System.out.println(service.isAuth());

		service.logout("hong");
		System.out.println(service.isAuth());
		
		/*
	
		boolean authenticated = service.login("hong", "1234");
		System.out.println(authenticated);

		System.out.println(service.login("hong", "1234"));
		*/
	}
}