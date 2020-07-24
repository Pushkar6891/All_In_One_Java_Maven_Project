package eg00215;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {

	private static List<Student> list;

	static {
		list = new ArrayList<>();

		Student student1 = new Student();
		student1.setId(10);
		student1.setName("PK");

		Student student2 = new Student();
		student2.setId(20);
		student2.setName("MK");

		list.add(student1);
		list.add(student2);
	}

	public List<Student> getAllStudent() {
		return list;
	}

	// override clone method and implement Cloneable marker interface
	@Override
	public List<Student> clone() throws CloneNotSupportedException {
		List<Student> dummyStudentList = new ArrayList<>();
		for (Student student : list) {
			dummyStudentList.add(student);
		}
		return dummyStudentList;
	}
}
