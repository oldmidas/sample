public class MemberServiceApp {
	public static void main(String[] args) {
		/*
			�̸�:		ȫ�浿
			���̵�:		hong
			��й�ȣ:	1234
			����:		30
			������ ���� Member��ü�� ����ִ� MemberService ��ü �����ϱ�.

		*/
		Member m1 = new Member();
		m1.setName("ȫ�浿");
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