package Entities;

import Abstract.Entity;

public class Game implements Entity {
	int _id;
	String _name;
	Double _price;

	public Game() {

	}

	public Game(int id, String name, Double price) {
		super();
		_id = id;
		_name = name;
		_price = price;
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

	public Double getPrice() {
		return _price;
	}

	public void setPrice(Double price) {
		_price = price;
	}

}