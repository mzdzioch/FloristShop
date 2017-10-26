package com.builder;

public class Rose implements Flower {

	private int number;
	private final String colour = "Red";
	private final String flower = "Rose";
	
	public String getFlower() {
		return flower;
	}

	public Rose(int number) {
		super();
		this.number = number;
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
