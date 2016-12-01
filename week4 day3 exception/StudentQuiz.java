/*
	이름	학년	국어	영어	수학	총점	평균
	홍길동	2학년	60		80		40		180		60.0
*/

public class StudentQuiz {
	//필드 은닉화
	private String name;
	private String grade;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	//기본 생성자
	public StudentQuiz() {}
	//생성자
	public StudentQuiz(String name, String grade, int kor, int eng, int math) {
		this.name=name;
		this.grade=grade;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total = kor+eng+math;
		this.avg = (double)(this.total)/3;
	}

	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math=math;
	}

	public int getTotal() {
		return kor+eng+math;
	}
	public void setTotal(int kor, int eng, int math) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}
	public void setAvg(int total) {
		this.avg = this.getTotal()/3;
	}
}