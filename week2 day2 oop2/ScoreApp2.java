public class ScoreApp2 {
	public static void main(String[] args) {
		
		//��ü ���� �� ȫ�浿�л��� �������� ��ü�� �ʱ�ȭ�Ǿ���
		Score s = new Score();

		//������ ��ü�� �ʵ带 �ʱ⼳���ϴ� ������ ������ �� �ִ�.
		//�ٷ� ����� ����� �����ϴ�.
		int total = s.total();
		double avg = s.average();

		System.out.println("��  �� : " + s.name);
		System.out.println("��  �� : " + total);
		System.out.println("��  �� : " + avg);

	}
}