package eg00215;

import java.util.List;

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {

		StudentDAO dao = new StudentDAO();
		List<Student> allStudents = dao.getAllStudent();

		// create a clone of exiting list coming from db
		List<Student> updatedList = dao.clone();
		Student student = new Student();
		student.setId(30);
		student.setName("SK");
		updatedList.add(student);

		System.out.println("Original List");
		allStudents.forEach(System.out::println);

		System.out.println("Updated List");
		updatedList.forEach(System.out::println);

	}

}
