public class EmployeeApp {
	public static void main(String[] args) {
		Employee info = new Employee();
		
		info.number = 0001;
		info.name = "ȫ�浿";
		info.phone = "010-1234-1234";
		info.department = "Ȱ���";
		info.position = "�θ�";
		info.salary = 50000;

		info.information();
		//info.annualSalary();

		Employee[] infoGroup = new Employee[10];
		System.out.println(infoGroup.length);
		infoGroup[0] = info;
	}
}