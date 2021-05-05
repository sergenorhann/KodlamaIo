package Entities;

public class Campaign {
	int _id;
	String _name;
	int _amount;

	public Campaign() {

	}

	public Campaign(int id, String name, int amount) {
		super();
		_id = id;
		_name = name;
		_amount = amount;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getAmount() {
		return _amount;
	}

	public void setAmount(int amount) {
		_amount = amount;
	}
	
}
