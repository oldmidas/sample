public class Quiz6_2 {
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
		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";
		String[] result = text.split("\\^");

		for (int i=0; i<result.length;i++) {
			String[] tempArr = result[i].split(","); 
			Employee temp = new Employee();
			temp.setName(tempArr[0]);
			temp.setDept(tempArr[1]);
			temp.setPosition(tempArr[2]);
			temp.setSalary(tempArr[3]);
			employees[i] = temp;
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