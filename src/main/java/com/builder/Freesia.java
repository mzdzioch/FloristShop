package com.builder;

public class Freesia implements Flower {
	
	private int number; 
	private final String colour = "Yellow";
	private final String flower = "Freesia";

	public Freesia(int number) {
		super();
		this.number = number;
	}

	public String getFlower() {
		return flower;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String getColour() {
		return colour;
	}

}
