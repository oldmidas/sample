import java.util.Scanner;

public class Quiz2_2 {
	public static void main(String[] args) {
		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("��������� �� �л����� ���� �Է��ϼ���: ");
		int size = sc.nextInt();

		int[] kor = new int[size];
		int total = 0; 
		double avg = 0; 

		for (int i=0 ; i < size; i++) {
			System.out.println("������ �Է��ϼ���.");
			int scores = sc.nextInt();
			kor[i] = scores; 
			total += kor[i]; 
		}

		avg = total / (double)size;

		System.out.println("������: " + total + "\t�����: " + avg);

	}
}