package kodlamaio.northwind.core.utilies.results;

public class Result {
	private boolean _success;
	private String _message;
	
	public Result(boolean success)
	{
		_success=success;
	}
	public Result(boolean success,String message)
	{
		_success=success;
		_message=message;
	}
	public boolean isSuccess()
	{
		return _success;
	}
	public String getMessage()
	{
		return _message;
	}
}
