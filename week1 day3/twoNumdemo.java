import java.util.Scanner;

public class twoNumdemo {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		String[] names = {"", "��","��","��","��","��","��","ĥ","��","��"};
		
		Scanner sc = new Scanner(System.in);


		System.out.println("���ڸ� ���ڸ� �Է��Ͻÿ�");		
		int num = sc.nextInt();
		int sip = num / 10;
		int il = num % 10;

		String hangul = names[sip] + "��" + names[il];
		System.out.println(hangul);		
	}
}