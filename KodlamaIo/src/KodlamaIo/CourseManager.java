package KodlamaIo;

public class CourseManager {

	public void add(Course course) {
		System.out.println("Course Added : " + course.name);
	}

	public void delete(Course course) {
		System.out.println("Course Deleted : " + course.name);
	}

	public void update(Course course) {
		System.out.println("Course Updated : " + course.name);
	}
}
