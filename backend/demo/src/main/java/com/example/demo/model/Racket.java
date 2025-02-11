package com.example.demo.model;

import lombok.Data;

@Data
public class Racket extends Item {
	
	// Attributes
	private String model;
	private Integer headSize;
	private Integer weight;
	private Integer balance;
	private Integer length;
	private Integer[] recTension;
	private Integer[] stringPattern;
	
	// Constructors
	public Racket(String model, Integer headSize, Integer weight, Integer balance, Integer length, Integer[] recTension,
			Integer[] stringPattern) {
		super();
		this.model = model;
		this.headSize = headSize;
		this.weight = weight;
		this.balance = balance;
		this.length = length;
		this.recTension = recTension;
		this.stringPattern = stringPattern;
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
