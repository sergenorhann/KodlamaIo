package KodlamaIo;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("Instructor Added : " + instructor.getFirstName());
	}

	public void delete(Instructor instructor) {
		System.out.println("Instructor Deleted : " + instructor.getFirstName());
	}

	public void update(Instructor instructor) {
		System.out.println("Instructor Updated : " + instructor.getFirstName());
	}
}