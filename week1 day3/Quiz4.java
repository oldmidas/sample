import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� ���ڸ� �Է��Ͻÿ�");		
		int twoNum = sc.nextInt();
		int tenth = twoNum / 10;
		int oneth = twoNum % 10;

		if (twoNum > 99) {
			System.out.println("���ڸ� ���ڸ� �Է����� �ʾҽ��ϴ�.");		
		} else if (twoNum < 10) {
			System.out.println("���ڸ� ���ڸ� �Է����� �ʾҽ��ϴ�.");
		} else if (tenth == 0) {
			System.out.print("");
		} else if (tenth == 1) {
			System.out.print("��");
		} else if (tenth == 2) {
			System.out.print("�̽�");
		} else if (tenth == 3) {
			System.out.print("���");
		} else if (tenth == 4) {
			System.out.print("���");
		} else if (tenth == 5) {
			System.out.print("����");
		} else if (tenth == 6) {
			System.out.print("����");
		} else if (tenth == 7) {
			System.out.print("ĥ��");
		} else if (tenth == 8) {
			System.out.print("�Ƚ�");
		} else if (tenth == 9) {
			System.out.print("����");
		}

		if (twoNum > 99) {
			System.out.println("");		
		} else if (twoNum < 10) {
			System.out.println("");
		} else if (oneth == 0) {
			System.out.println("");
		} else if (oneth == 1) {
			System.out.println("��");
		} else if (oneth == 2) {
			System.out.println("��");
		} else if (oneth == 3) {
			System.out.println("��");
		} else if (oneth == 4) {
			System.out.println("��");
		} else if (oneth == 5) {
			System.out.println("��");
		} else if (oneth == 6) {
			System.out.println("��");
		} else if (oneth == 7) {
			System.out.println("ĥ");
		} else if (oneth == 8) {
			System.out.println("��");
		} else if (oneth == 9) {
			System.out.println("��");
		}
		

	}
}