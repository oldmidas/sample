import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		// ��> eungsulee@hanmail.net ----> eungsulee

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸����� �Է��ϼ��� : ");
		String email = sc.next();

		// index�� substring�� ����ϱ�
		int index = email.indexOf("@");
		String id = email.substring(0 ,index);
		System.out.println(id);
		
		
		// split�� ����ϱ�
		/*
		String[] arr = email.split("@");
		String id = arr[0];
		System.out.println(id); 
		*/

		

		
	
	}
}