import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.println("----------- ���� & ��� -----------");
		System.out.print("������ �� �л����� ���� �Է��ϼ���: ");
		int size = sc.nextInt(); // �л��� == �迭�� ũ��
		int[] kor = new int[size]; // �迭����� kor�̶�� �迭�� size��ŭ�� �迭���ڸ� �����
		int total = 0; //�հ� ��������
		double avg = 0; // ��� ��������

		for (int i=0 ; i < size; i++) {
			System.out.println("������ �Է��ϼ���.");
			System.out.print(size + "�� �� " + (i+1) + "��° �л��� ���� >");
			int scores = sc.nextInt(); //���� �޾ƿ���
			kor[i] = scores; // �������� �޾ƿ��� ������ (kor[i��°])�� �迭�� �Էµȴ�.(i = 0�϶��� kor[0]��°�� ������ �Էµȴ�.)
			total += kor[i]; // total�� kor�迭�� 0��°���� size��ŭ�� ������ ��� ���Ѵ�(���� �Է¹��� kor[i]��°�� ���� total�� �״´�.)
		}

		avg = total / (double)size; // ������ ó�� �Է��� �л���(size)�� ������

		System.out.println("\n\n������: " + total + "\n�����: " + avg + "\n\n");

	}
}