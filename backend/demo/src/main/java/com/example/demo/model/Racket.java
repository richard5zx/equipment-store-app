package com.example.demo.model;

import lombok.Data;

@Data
public class Racket extends Item {
	
	// Attributes
	private String model;
	private Integer year;
	private Integer tension;
	
	// Constructors
	public Racket(String model, Integer year, Integer tension) {
		super();
		this.model = model;
		this.year = year;
		this.tension = tension;
	}

	public Racket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Racket(Double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	
	
}
