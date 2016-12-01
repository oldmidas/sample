public class MemberService {

	//������
	private Member member;

	//�α��� ����
	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}

	public boolean isAuth() {
		return auth;
	}
	// ���̵�� ����� ���޹޾Ƽ� member�� ����� ���̵� ��й�ȣ�� ���ؼ�
	// ���̵�, ��й�ȣ�� ��ġ�ϸ� auth���� true�� �����ϱ�
	public void login(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		}
	}

	// �ƾƵ� ���޹޾Ƽ� �α׾ƿ� ó���ϱ� (auth�� ���� false�� �ٲٱ�)
	public void logout(String id) {
		auth = false;
	}


	/* // ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean login(String id, String password) {
		boolean result = false;
		if ((member.getId() == id) && (member.getPassword() == password)) {
			result = true;
		}

		return result;
	}

	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�
	public void logout(String id) {
		System.out.println("["+id+"�� �α׾ƿ� �Ǿ����ϴ�.]");
	}
	*/
	
}