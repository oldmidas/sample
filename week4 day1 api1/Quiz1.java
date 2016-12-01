import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기
		// 예> eungsulee@hanmail.net ----> eungsulee

		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.next();

		// index와 substring을 사용하기
		int index = email.indexOf("@");
		String id = email.substring(0 ,index);
		System.out.println(id);
		
		
		// split을 사용하기
		/*
		String[] arr = email.split("@");
		String id = arr[0];
		System.out.println(id); 
		*/

		

		
	
	}
}