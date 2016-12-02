import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentMng program = new StudentMng();

		while (true) { // ���ѷ���
			System.out.println("----------------------------------------------");
			System.out.println("1.��� 2.�й��˻� 3.�̸��˻� 4.�г�˻� 0.����");
			System.out.println("----------------------------------------------\n");
			System.out.print("����> ");

			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					System.out.print("�й��� �Է��ϼ��� > ");
					int no = Integer.parseInt(sc.nextLine());

					System.out.print("�̸��� �Է��ϼ��� > ");
					String name = sc.nextLine();

					System.out.print("�г��� �Է��ϼ��� > ");
					String grade = sc.nextLine();

					System.out.print("������ �Է��ϼ��� > ");
					double score = Double.parseDouble(sc.nextLine());

					Student kid = new Student(no, name, grade, score);
					program.addStudent(kid);
				
				} else if (menu == 2) {
					System.out.print("�˻��Ͻ� �л��� �й��� �Է��ϼ��� > ");
					int no = Integer.parseInt(sc.nextLine());
					program.findNo(no);
				} else if (menu == 3) {
					System.out.print("�˻��Ͻ� �л��� �̸��� �Է��ϼ��� > ");
					String name = sc.nextLine();
					program.findName(name);
				} else if (menu == 4) {
					System.out.print("�˻��Ͻ� �г��� �Է��ϼ��� > ");
					String grade = sc.nextLine();
					program.findGrade(grade);
				} else if (menu == 0) {
					System.out.println("�ý����� �����մϴ�.");
				} else {
					System.out.println("�޴���ȣ�� Ȯ���ϼ���.");
				}
			
			} catch (StudentException e) {
				System.out.println("E R R O R : " + e.getMessage());
				System.out.println("���α׷� ���� �߻�\n");
			} catch (Exception e) {
				System.out.println("E R R O R : " + e.getMessage());
				System.out.println("�� �� ���� ���� �߻�\n");			
			}

		
		}
		
	}
}