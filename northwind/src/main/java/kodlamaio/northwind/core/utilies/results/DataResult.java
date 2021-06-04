package kodlamaio.northwind.core.utilies.results;

public class DataResult<T> extends Result{
	private T _data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		_data = data;
	}
	public DataResult(T data,boolean success) {
		super(success);
		_data = data;
	}
	public T getData()
	{
		return _data;
	}
}
