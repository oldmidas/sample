//인적정보를 저장하고 그 정보를 출력하는 기능이 구현된 설계도
public class Employee {
	//속성
	//사원번호, 이름, 전화번호, 소속부서, 직위, 급여
	int number;
	String name;
	String phone;
	String department;
	String position;
	int salary;

	//기능
	//연봉을 계산해서 반환하는 메소드
	//사원의 모든 정보를 출력하는 메소드
	/*
	public void annualSalary() {
		int annualSalary = salary * 12;
		System.out.println("연    봉:\t" + annualSalary);
	}
	*/
	public int getAnnualSalary() {
		return salary * 12;
	}

	public void information() {
		System.out.println("####### 사원 정보 #######");
		System.out.println("사원번호:\t" + number);
		System.out.println("사원이름:\t" + name);
		System.out.println("전화번호:\t" + phone);
		System.out.println("소속부서:\t" + department);
		System.out.println("직    위:\t" + position);
		System.out.println("급    여:\t" + salary);
		System.out.println("연    봉:\t" + getAnnualSalary());
		System.out.println("#########################");
	}

	
}