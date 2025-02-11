package com.example.demo.model;

import lombok.Data;

@Data
public abstract class Item {
	
	// Attributes
	private Integer id;
	private Double price;
	
	// Constructors
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(Double price) {
		super();
		this.price = price;
	}
	
}
