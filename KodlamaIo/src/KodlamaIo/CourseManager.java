package KodlamaIo;

public class CourseManager {

	public void add(Course course) {
		System.out.println("Course Added : " + course.getName());
	}

	public void delete(Course course) {
		System.out.println("Course Deleted : " + course.getName());
	}

	public void update(Course course) {
		System.out.println("Course Updated : " + course.getName());
	}
}
