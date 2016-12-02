public class EmpProgram {
	Employee[] db = new Employee[3];
	int dbPosition = 0;
	
	public void addEmp(Employee newEmp) throws EmpException {
		for (Employee emp : db) {
			if (emp != null) {
				if (emp.getNo() == newEmp.getNo()) {
					throw new EmpException("중복! 중복!");
				}
			}
		}
		if (db.length == dbPosition) {
			throw new EmpException("저장공간 꽉참!");
		}
		db[dbPosition] = newEmp;
		dbPosition++;
	}


	public void findNo(int no) throws EmpException {
		boolean isExist = false;
		for (Employee emp : db) {
			if (emp != null) {
				if (emp.getNo() == no) {
					emp.info();
					isExist = true;
				}		
			}
		}
		if (!isExist) {
			throw new EmpException("사번이 없습니다.");
		}
	
	}

	public void findName(String name) throws EmpException {
		boolean isExist = false;
		for (Employee emp : db) {
			if (emp != null) {
				if (emp.getName().equals(name)) {
					emp.info();
					isExist = true;
				}
			}
		}
		if (!isExist) {
			throw new EmpException("이름이 없습니다.");
		}
	}


}