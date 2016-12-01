public class Student {
	int no; //학번
	String name;
	int kor;
	int eng;
	int math;

	//기본 생성자
	public Student() {
	
	}

	//모든 필드를 초기화(초기설정)하는 생성자
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	}

	//총점을 반환하는 기능 total
	public int total() {
		int total = 0;

		total = kor + eng + math;

		return total;
	}

	//평균을 반환하는 기능 avg
	public double avg() {
		double avg = 0.0;
	
		avg = total() / 3.0;

		return avg;
	}

	//학생 정보를 출력하는 기능(총점과 평균을 포함) info
	public void info() {
		System.out.println("학  번 :" + no);
		System.out.println("이  름 :" + name);
		System.out.println("평  균 :" + avg());
		System.out.println("총  점 :" + total());
		System.out.println("국  어 :" + kor);
		System.out.println("영  어 :" + eng);
		System.out.println("수  학 :" + math);
		System.out.println();
	}

}