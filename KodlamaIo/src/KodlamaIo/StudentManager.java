package KodlamaIo;

public class StudentManager {

	public void Add(Student student) {
		System.out.println("Student Added : " + student.firstName);
	}

	public void Delete(Student student) {
		System.out.println("Student Deleted : " + student.firstName);
	}

	public void Update(Student student) {
		System.out.println("Student Updated : " + student.firstName);
	}
}