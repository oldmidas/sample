import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz4 {
	public static void main(String[] args) {
		// ���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���)
		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� �Է��ϼ���:");
		String userId = sc.next();
		
		//�˻��ϱ�

		//���̵� 6���� �̻����� �˻��ϱ�
		if (userId.length() < 6) {
			System.out.println("6���ڸ� �Ѱ��ּ���.");
			return;
		}
		//���̵� ���� �ҹ��ڷθ� �����Ǿ� �ִ��� �˻��ϱ� <---- boolean
		boolean invalid; //	<---- flag���� : ���� ������ Ư�����¸� �����ϴ� ����
		for (int i = 0; i < userId.length(); i++) {
			int number = userId.charAt(i);
			if ( number < 97 || number > 123) {
				invalid = true;
				System.out.println("�ҹ��ڸ� ����ϼ���.");
				return;
			} else {
				invalid = true;
			}
		}

		// ���� ǥ����
		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
						//^�� ����, $�� ��
		valid = Pattern.matches(regExp, userId);

		if (!valid) {
			System.out.println("��ȿ��������");
		}
	}
}