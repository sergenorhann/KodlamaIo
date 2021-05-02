package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
//		CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
		CustomerManager customerManager = new CustomerManager();
		customerManager._baseDatabaseManager= new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
