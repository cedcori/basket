package com.test;

public enum Item {
	BANANA("Bananas", 5), ORANGE("Orange", 3), Apple("Apple", 2), LEMON("Lemon", 6), PEACHE("Peache", 5);
	
	private String name;
	private double price;
	
	Item(String name, double price){
		this.name= name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

}
