import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpProgram program = new EmpProgram();


		while (true) { // 무한루프
			System.out.println("===================================");
			System.out.println("1.등록 2.사번검색 3.이름검색 0.종료");
			System.out.println("===================================");
			System.out.print("번호를 입력하세요 > ");
			int menu = Integer.parseInt(sc.nextLine());
			try {
				if (menu == 1) {
					System.out.print("사번을 입력하세요 > ");
					int no = Integer.parseInt(sc.nextLine());

					System.out.print("이름을 입력하세요 > ");
					String name = sc.nextLine();

					System.out.print("부서를 입력하세요 > ");
					String dept = sc.nextLine();

					System.out.print("연봉을 입력하세요 > ");
					int salary = Integer.parseInt(sc.nextLine());
					Employee emp = new Employee(no, name, dept, salary);
					program.addEmp(emp);
			
				} else if (menu == 2) {
					System.out.print("사번을 입력하세요 > ");
					int no = Integer.parseInt(sc.nextLine());					
					program.findNo(no);

				} else if (menu == 3) {
					System.out.print("이름을 입력하세요 > ");
					String name = sc.nextLine();					
					program.findName(name);

				} else if (menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;

				} else {
					System.out.println("메뉴번호를 다시 입력하세요.");
				}

			} catch(EmpException e) {
				System.out.println("에 러 : " + e.getMessage());
			} catch(Exception e) {
				System.out.println("에 러 : " + e.getMessage());
			}
		}

	}
}
