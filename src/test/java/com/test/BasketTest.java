package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasketTest {

	private Basket basket; 

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
	}

	@Test
	public void when_no_item_then_total_cost_is_0() {
		assertEquals("Incorrect total price ",0., basket.getTotalCost(), 0.);
	}
	
	@Test
	public void when_add_BANANA_then_total_cost_is_5() {
		basket.addItem(Item.BANANA);
		assertEquals("Incorrect total price ",5., basket.getTotalCost(), 0.);
	}
	
	@Test
	public void when_add_ORANGE_then_total_cost_is_3() {
		basket.addItem(Item.ORANGE);
		assertEquals("Incorrect total price ",3., basket.getTotalCost(), 0.);
	}
	
	
	@Test
	public void when_add_ORANGE_and_BANANA_then_total_cost_is_8() {
		basket.addItem(Item.ORANGE);
		basket.addItem(Item.BANANA);
		assertEquals("Incorrect total price ",8., basket.getTotalCost(), 0.);
	}
	

}
