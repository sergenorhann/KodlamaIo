package KodlamaIo;

public class Main {

	public static void main(String[] args) {

		String yazilimGelistirici = "Yazılım Geliştirici Yetiştirme Kampı ";

		Course course1 = new Course();
		course1.setId(1);
		course1.setName(yazilimGelistirici + "(C# + ANGULAR)");
		course1.setInstructorId(1);

		Course course2 = new Course();
		course2.setId(2);
		course2.setName(yazilimGelistirici + "(JAVA + REACT)");
		course2.setInstructorId(1);
		
		
		// Course[] courses = { course1, course2 };
		// for (Course course : courses) {
		// System.out.println(course.name);
		// }

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.update(course2);
		courseManager.delete(course2);

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Sergen");
		student1.setLastName("Orhan");
		student1.setEMail("sergen@sergen.com");
		student1.setPassword("123");
		

		Student student2 = new Student();	
		student2.setId(2);
		student2.setFirstName("Veli");
		student2.setLastName("Yılmaz");
		student2.setEMail("veli@yılmaz.com");
		student2.setPassword("2321");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.update(student2);
		studentManager.delete(student2);

		AuthManager authManager = new AuthManager();
		authManager.register(student1);
		authManager.login(student1);

	}

}
