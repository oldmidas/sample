public class StudentMng {
	private Student[] db = new Student[3];
	private int dbNumber = 0;

	public void addStudent(Student newStudent) throws StudentException {
		for (Student student : db) {
			if (student != null) {
				if (student.getNo() == newStudent.getNo()) {
					throw new StudentException("중복되는 학번이 있습니다.");
				}
			}
		}

		if (db.length == dbNumber) {
			throw new StudentException("저장공간이 부족합니다.");
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
			throw new StudentException("학번을 찾을 수 없습니다.");
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
			throw new StudentException("이름을 찾을 수 없습니다.");
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
			throw new StudentException("검색결과를 찾을 수 없습니다.");
		}
	}



}