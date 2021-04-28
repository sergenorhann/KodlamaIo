package KodlamaIo;

public class Main {

	public static void main(String[] args) {

		String yazilimGelistirici = "Yazılım Geliştirici Yetiştirme Kampı ";

		Course course1 = new Course();
		course1.id = 1;
		course1.name = yazilimGelistirici + "(C# + ANGULAR)";
		course1.instructor = "Engin Demiroğ";
		course1.completionRate = 80; // Kurs + öğrenci bölümü oluşturulup eklenmesi lazım.

		Course course2 = new Course();
		course2.id = 2;
		course2.name = yazilimGelistirici + "(JAVA + REACT)";
		course2.instructor = "Engin Demiroğ";
		course2.completionRate = 80; // Kurs + öğrenci bölümü oluşturulup eklenmesi lazım.

		// Course[] courses = { course1, course2 };
		//		for (Course course : courses) {
		//			System.out.println(course.name);
		//		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.update(course2);
		courseManager.delete(course2);

		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Sergen";
		student1.lastName = "Orhan";
		student1.email = "sergen@sergen.com";
		student1.Password = "123";

		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Veli";
		student2.lastName = "Yılmaz";
		student2.email = "veli@yılmaz.com";
		student2.Password = "321";

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
