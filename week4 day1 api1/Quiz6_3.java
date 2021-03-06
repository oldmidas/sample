public class Quiz6_3 {


		public static class Employee {
			private String name;
			private String dept;
			private String pos;
			private int salary;

			public Employee() {}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}

			public String getDept() {
				return dept;
			}
			public void setDept(String dept) {
				this.dept=dept;
			}

			public String getPos() {
				return pos;
			}
			public void setPos(String pos) {
				this.pos=pos;
			}

			public int getSalary() {
				return salary;
			}

			public void setSalary(int salary) {
				this.salary = salary;
			}

		}
	public static void main(String[] args) {
		/*
			1. 이름, 부서, 직위, 급여를 담을 수 있는 Employee 클래스 정의하기
			(필드 정의, 기본생성자, getter&setter)

			2. ^를 기준으로 문자열 잘라서 배열에 담기
			3. 배열에 사원정보를 하나씩 추출해서 , 로 잘라서 배열에 담기
			4. Employee 객체를 만들어서 사원정보의 각 데이터를 Employee 객체에 저장하기
			5. Employee 객체를 employees 배열에 저장하기
			6. Employee 배열에 저장된 정보 출력하기

		*/
		Employee[] employees = new Employee[4];
		String text = "홍길동,영업팀,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,250";
		String[] arr = text.split("\\^");

		for (int i = 0; i<arr.length; i++) {
			String item = arr[i];
			String[] values = item.split(",");
			Employee emp = new Employee();

			emp.setName(values[0]);
			emp.setDept(values[1]);
			emp.setPos(values[2]);
			int salary = Integer.parseInt(values[3]);
			emp.setSalary(salary);

			employees[i] = emp;

		}
		
		for (Employee emp : employees) {
			System.out.printf("%s %s %s %d\n", emp.getName(), emp.getDept(), emp.getPos(), emp.getSalary());
			System.out.println();
		}
	}
}