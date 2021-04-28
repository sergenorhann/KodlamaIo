package KodlamaIo;

public class StudentManager {

	public void add(Student student) {
		System.out.println("Student Added : " + student.firstName);
	}

	public void delete(Student student) {
		System.out.println("Student Deleted : " + student.firstName);
	}

	public void update(Student student) {
		System.out.println("Student Updated : " + student.firstName);
	}
}