package com.philip;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int quantity;
	private BigDecimal price;
	

	public Item(String name, int quantity, BigDecimal price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	
}
