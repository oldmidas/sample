public class Quiz6 {
	public static void main(String[] args) {
		/*
			1. �̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
			(�ʵ� ����, �⺻������, getter&setter)

			2. ^�� �������� ���ڿ� �߶� �迭�� ���
			3. �迭�� ��������� �ϳ��� �����ؼ� , �� �߶� �迭�� ���
			4. Employee ��ü�� ���� ��������� �� �����͸� Employee ��ü�� �����ϱ�
			5. Employee ��ü�� employees �迭�� �����ϱ�
			6. Employee �迭�� ����� ���� ����ϱ�

		*/

		Employee[] employees = new Employee[4];
		Employee tempEmp = new Employee();
		String text = "ȫ�浿,������,����,200&������,������,����,300&������,�ѹ���,�븮,150&�̼���,�ѹ���,����,250";
		String[] result = text.split("&");

		for (int i=0; i<result.length;i++) {
			String[] tempArr = result[i].split(","); 
			employees[i] = new Employee();
			employees[i].setName(tempArr[0]);
			employees[i].setDept(tempArr[1]);
			employees[i].setPosition(tempArr[2]);
			employees[i].setSalary(tempArr[3]);
			
		}
		
		for (Employee e : employees) {
			System.out.println("�̸� : " + e.getName());
			System.out.println("�μ� : " + e.getDept());
			System.out.println("���� : " + e.getPosition());
			System.out.println("�޿� : " + e.getSalary());
			System.out.println();
		}
	}
}