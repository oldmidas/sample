//���������� �����ϰ� �� ������ ����ϴ� ����� ������ ���赵
public class Employee {
	//�Ӽ�
	//�����ȣ, �̸�, ��ȭ��ȣ, �ҼӺμ�, ����, �޿�
	int number;
	String name;
	String phone;
	String department;
	String position;
	int salary;

	//���
	//������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	//����� ��� ������ ����ϴ� �޼ҵ�
	/*
	public void annualSalary() {
		int annualSalary = salary * 12;
		System.out.println("��    ��:\t" + annualSalary);
	}
	*/
	public int getAnnualSalary() {
		return salary * 12;
	}

	public void information() {
		System.out.println("####### ��� ���� #######");
		System.out.println("�����ȣ:\t" + number);
		System.out.println("����̸�:\t" + name);
		System.out.println("��ȭ��ȣ:\t" + phone);
		System.out.println("�ҼӺμ�:\t" + department);
		System.out.println("��    ��:\t" + position);
		System.out.println("��    ��:\t" + salary);
		System.out.println("��    ��:\t" + getAnnualSalary());
		System.out.println("#########################");
	}

	
}