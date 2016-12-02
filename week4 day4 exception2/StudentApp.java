import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentMng program = new StudentMng();

		while (true) { // 무한루프
			System.out.println("----------------------------------------------");
			System.out.println("1.등록 2.학번검색 3.이름검색 4.학년검색 0.종료");
			System.out.println("----------------------------------------------\n");
			System.out.print("선택> ");

			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					System.out.print("학번을 입력하세요 > ");
					int no = Integer.parseInt(sc.nextLine());

					System.out.print("이름을 입력하세요 > ");
					String name = sc.nextLine();

					System.out.print("학년을 입력하세요 > ");
					String grade = sc.nextLine();

					System.out.print("학점을 입력하세요 > ");
					double score = Double.parseDouble(sc.nextLine());

					Student kid = new Student(no, name, grade, score);
					program.addStudent(kid);
				
				} else if (menu == 2) {
					System.out.print("검색하실 학생의 학번을 입력하세요 > ");
					int no = Integer.parseInt(sc.nextLine());
					program.findNo(no);
				} else if (menu == 3) {
					System.out.print("검색하실 학생의 이름을 입력하세요 > ");
					String name = sc.nextLine();
					program.findName(name);
				} else if (menu == 4) {
					System.out.print("검색하실 학년을 입력하세요 > ");
					String grade = sc.nextLine();
					program.findGrade(grade);
				} else if (menu == 0) {
					System.out.println("시스템을 종료합니다.");
				} else {
					System.out.println("메뉴번호를 확인하세요.");
				}
			
			} catch (StudentException e) {
				System.out.println("E R R O R : " + e.getMessage());
				System.out.println("프로그램 오류 발생\n");
			} catch (Exception e) {
				System.out.println("E R R O R : " + e.getMessage());
				System.out.println("알 수 없는 오류 발생\n");			
			}

		
		}
		
	}
}