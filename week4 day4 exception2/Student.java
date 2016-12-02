public class Student {
	private int no;
	private String name;
	private String grade;
	private double score;

	public Student () {}

	public Student (int no, String name, String grade, double score) {
		this.no=no;
		this.name=name;
		this.grade=grade;
		this.score=score;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no=no;
	}

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

	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score=score;
	}
	
	public void displayInfo() {
		System.out.println("=================");
		System.out.println("학번 : " + getNo());
		System.out.println("이름 : " + getName());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getScore());
		System.out.println("=================");
	}

}