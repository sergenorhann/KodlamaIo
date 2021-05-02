package polymorphismDemo;

public class CustomerManager {
	private BaseLogger _baseLogger;
	public CustomerManager(BaseLogger baseLogger) {
		_baseLogger = baseLogger;
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		_baseLogger.log("log mesajı");
	}
}
