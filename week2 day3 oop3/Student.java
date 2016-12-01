import java.text.DecimalFormat;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	//�⺻ ������
	public Student() {}

	//��ȣ, �̸�, ����, ����, ������ ���� �޼ҵ�
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}

	//��ȣ, �̸�, ����, ����, ������ ���� �޼ҵ�
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}

	//������ ��ȯ�ϴ� �޼ҵ�
	public int getTotal() {
		return kor + eng + math;
	}

	//����� ��ȯ�ϴ� �޼ҵ�
	public double getAvg() {
		return this.getTotal() / 3.0;
	}

	public String getAvgForRound() {
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(this.getAvg());
	}

}