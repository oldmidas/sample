//추상클래스
public abstract class DBAccess {

	//구현 메소드
	public void connect() {
		System.out.println("db와 연결합니다.");
	}

	// 추상 메소드, 추상화
	public abstract void createRepository();

	//구현 메소드
	public void disconnect() {
		System.out.println("db와 연결을 해제합니다.");	
	}
}