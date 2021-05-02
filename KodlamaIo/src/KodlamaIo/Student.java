package KodlamaIo;

public class Student extends User{
	private int _courseId;
	
	
	public void setCourseId(int courseId)
	{
		_courseId=courseId;
	}
	public int getCourseId()
	{
		return _courseId;
	}
}