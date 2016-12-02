public class Employee {

	private int no;
	private String name;
	private String dept;
	private int salary;
	private int annual = salary * 12;

	public Employee() {}

	public Employee(int no, String name, String dept, int salary) {
		this.no=no;
		this.name=name;
		this.dept=dept;
		this.annual=(salary*12);
		this.salary=salary;
	}

	public int getNo() {
		return no;
	}
	public void setNo() {
		this.no=no;
	}

	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}

	public String getDept() {
		return dept;
	}
	public void setDept() {
		this.dept=dept;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary() {
		this.annual=(salary*12);
		this.salary=salary;
	}

	public int getAnnual() {
		return annual;
	}

	public void info() {
		System.out.println("================");
		System.out.println("이  름 :" + getName());
		System.out.println("부  서 :" + getDept());
		System.out.println("연  봉 :" + getAnnual());
		System.out.println("================");
	}

}