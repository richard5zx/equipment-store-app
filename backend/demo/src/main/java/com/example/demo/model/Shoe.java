package com.example.demo.model;

import lombok.Data;

@Data
public class Shoe extends Item {
	
	// Attributes
	private String model;
	private Integer size;
	
	// Constructors
	public Shoe(String model, Integer size) {
		super();
		this.model = model;
		this.size = size;
	}
	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Shoe(Double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
