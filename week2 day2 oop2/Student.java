public class Student {
	int no; //�й�
	String name;
	int kor;
	int eng;
	int math;

	//�⺻ ������
	public Student() {
	
	}

	//��� �ʵ带 �ʱ�ȭ(�ʱ⼳��)�ϴ� ������
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	}

	//������ ��ȯ�ϴ� ��� total
	public int total() {
		int total = 0;

		total = kor + eng + math;

		return total;
	}

	//����� ��ȯ�ϴ� ��� avg
	public double avg() {
		double avg = 0.0;
	
		avg = total() / 3.0;

		return avg;
	}

	//�л� ������ ����ϴ� ���(������ ����� ����) info
	public void info() {
		System.out.println("��  �� :" + no);
		System.out.println("��  �� :" + name);
		System.out.println("��  �� :" + avg());
		System.out.println("��  �� :" + total());
		System.out.println("��  �� :" + kor);
		System.out.println("��  �� :" + eng);
		System.out.println("��  �� :" + math);
		System.out.println();
	}

}