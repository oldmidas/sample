public class Employee {
	private String name;
	private String dept;
	private String position;
	private String salary;

	public Employee() {}

	public Employee(Employee e) {
	
	}

	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDept () {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition () {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getSalary () {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


}