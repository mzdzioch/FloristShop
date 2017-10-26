package com.builder;

public class Peony implements Flower {
	
	private int number;
	
	private static String colour = "Red";
	//piwonia
	private final String flower = "Peony";

	public String getFlower() {
		return flower;
	}

	public Peony(int number) {
		super();
		this.number = number;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int number) {

	}

	@Override
	public String getColour() {
		return colour;
	}

}
