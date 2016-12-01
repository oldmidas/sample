public class Quiz6 {
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
		Employee tempEmp = new Employee();
		String text = "홍길동,영업팀,과장,200&김유신,영업팀,부장,300&강감찬,총무부,대리,150&이순신,총무부,차장,250";
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
			System.out.println("이름 : " + e.getName());
			System.out.println("부서 : " + e.getDept());
			System.out.println("직위 : " + e.getPosition());
			System.out.println("급여 : " + e.getSalary());
			System.out.println();
		}
	}
}