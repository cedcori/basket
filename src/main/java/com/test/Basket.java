package com.test;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<Item> items = new ArrayList<Item>();
	public double getTotalCost(){
		return items.stream().mapToDouble(i -> i.getPrice()).sum();
	}

	public void addItem(Item fruit) {
		items.add(fruit);
	}

}
