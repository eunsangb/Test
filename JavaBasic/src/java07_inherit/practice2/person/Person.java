package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
	private String name;
	private int money;
	private Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product prod) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}

