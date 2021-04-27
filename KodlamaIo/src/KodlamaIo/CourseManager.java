package KodlamaIo;

public class CourseManager {

	public void Add(Course course) {
		System.out.println("Course Added : " + course.name);
	}

	public void Delete(Course course) {
		System.out.println("Course Deleted : " + course.name);
	}

	public void Update(Course course) {
		System.out.println("Course Updated : " + course.name);
	}
}
