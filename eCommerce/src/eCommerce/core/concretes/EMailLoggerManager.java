package eCommerce.core.concretes;

import eCommerce.core.abstracts.LoggerService;

public class EMailLoggerManager implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("E-Mail'e Loglandı : "+ message);
	}

}
