import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpProgram program = new EmpProgram();


		while (true) { // ���ѷ���
			System.out.println("===================================");
			System.out.println("1.��� 2.����˻� 3.�̸��˻� 0.����");
			System.out.println("===================================");
			System.out.print("��ȣ�� �Է��ϼ��� > ");
			int menu = Integer.parseInt(sc.nextLine());
			try {
				if (menu == 1) {
					System.out.print("����� �Է��ϼ��� > ");
					int no = Integer.parseInt(sc.nextLine());

					System.out.print("�̸��� �Է��ϼ��� > ");
					String name = sc.nextLine();

					System.out.print("�μ��� �Է��ϼ��� > ");
					String dept = sc.nextLine();

					System.out.print("������ �Է��ϼ��� > ");
					int salary = Integer.parseInt(sc.nextLine());
					Employee emp = new Employee(no, name, dept, salary);
					program.addEmp(emp);
			
				} else if (menu == 2) {
					System.out.print("����� �Է��ϼ��� > ");
					int no = Integer.parseInt(sc.nextLine());					
					program.findNo(no);

				} else if (menu == 3) {
					System.out.print("�̸��� �Է��ϼ��� > ");
					String name = sc.nextLine();					
					program.findName(name);

				} else if (menu == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;

				} else {
					System.out.println("�޴���ȣ�� �ٽ� �Է��ϼ���.");
				}

			} catch(EmpException e) {
				System.out.println("�� �� : " + e.getMessage());
			} catch(Exception e) {
				System.out.println("�� �� : " + e.getMessage());
			}
		}

	}
}
