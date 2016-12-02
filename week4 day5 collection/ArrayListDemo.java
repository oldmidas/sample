import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// 이름을 여러개 저장할 수 있는 ArrayList만들기
		ArrayList<String> names = new ArrayList<String>();

		// ArrayList에 String객체 저장하기
		names.add("홍길동");
		names.add("김유신");
		names.add("이순신");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
	
		// ArrayList에 저장된 엘리먼트 개수 조회하기
		int length = names.size();
		System.out.println(length);

		for (String username : names) {
			System.out.println(username);
		}		
		/*
		for (int i=0; i<length; i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		*/

		// ArrayList에 엘리먼트가 저장되어 있는지 확인하기
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("엘리먼트가 존재하는 ArrayList다.");			
		} else {
			System.out.println("비어있는 ArrayList다.");
		}

		// ArrayList에 저장된 모든 엘리먼트 삭제하기
		//names.clear();
	}
}