import java.text.DecimalFormat;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	//기본 생성자
	public Student() {}

	//번호, 이름, 국어, 영어, 수학의 게터 메소드
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

	//번호, 이름, 국어, 영어, 수학의 세터 메소드
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

	//총점을 반환하는 메소드
	public int getTotal() {
		return kor + eng + math;
	}

	//평균을 반환하는 메소드
	public double getAvg() {
		return this.getTotal() / 3.0;
	}

	public String getAvgForRound() {
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(this.getAvg());
	}

}