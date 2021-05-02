package KodlamaIo;

public class StudentManager extends UserManager{

	public void add(Student student) {
		System.out.println("Student Added : " + student.getFirstName());
	}

	public void delete(Student student) {
		System.out.println("Student Deleted : " + student.getFirstName());
	}

	public void update(Student student) {
		System.out.println("Student Updated : " + student.getFirstName());
	}
}