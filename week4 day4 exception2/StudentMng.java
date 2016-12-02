public class StudentMng {
	private Student[] db = new Student[3];
	private int dbNumber = 0;

	public void addStudent(Student newStudent) throws StudentException {
		for (Student student : db) {
			if (student != null) {
				if (student.getNo() == newStudent.getNo()) {
					throw new StudentException("�ߺ��Ǵ� �й��� �ֽ��ϴ�.");
				}
			}
		}

		if (db.length == dbNumber) {
			throw new StudentException("��������� �����մϴ�.");
		}

		db[dbNumber] = newStudent;
		dbNumber++;
	}

	public void findNo(int no) throws StudentException {
		boolean isExist = false;

		for (Student student : db) {
			if (student != null) {
				if (student.getNo() == no) {
					isExist = true;
					student.displayInfo();
				}
			}
		}

		if (!isExist) {
			throw new StudentException("�й��� ã�� �� �����ϴ�.");
		}
	}

	public void findName(String name) throws StudentException {
		boolean isExist = false;

		for (Student student : db) {
			if (student != null) {
				if (student.getName().equals(name)) {
					isExist = true;
					student.displayInfo();
				}
			}
		}

		if (!isExist) {
			throw new StudentException("�̸��� ã�� �� �����ϴ�.");
		}
	} 

	public void findGrade(String grade) throws StudentException {
		boolean isExist = false;

		for (Student student : db) {
			if (student != null) {
				if (student.getGrade().equals(grade)) {
					isExist = true;
					student.displayInfo();
				}
			}
		}

		if (!isExist) {
			throw new StudentException("�˻������ ã�� �� �����ϴ�.");
		}
	}



}