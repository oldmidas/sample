public class EmpProgram {
	Employee[] db = new Employee[3];
	int dbPosition = 0;
	
	public void addEmp(Employee newEmp) throws EmpException {
		for (Employee emp : db) {
			if (emp != null) {
				if (emp.getNo() == newEmp.getNo()) {
					throw new EmpException("�ߺ�! �ߺ�!");
				}
			}
		}
		if (db.length == dbPosition) {
			throw new EmpException("������� ����!");
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
			throw new EmpException("����� �����ϴ�.");
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
			throw new EmpException("�̸��� �����ϴ�.");
		}
	}


}