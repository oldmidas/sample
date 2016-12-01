public class MemberApp {
	public static void main(String[] args) {
		// 회원정보를 담기위한 Member 객체를 생성하고
		Member m1 = new Member();
		// setter를 사용해서 이름, 아이디, 비번, 나이 등의 데이터를 저장하기
		m1.setName("홍길동");
		m1.setId("hong");
		m1.setPassword("1234");
		m1.setAge(28);

		// 생성된 Member 객체에 저장된 값을 getter함수를 사용해서 화면에 출력하기
		System.out.println("이    름: " + m1.getName());
		System.out.println("아 이 디: " + m1.getId());
		System.out.println("패스워드: " + m1.getPassword());
		System.out.println("나    이: " + m1.getAge());

	}
}