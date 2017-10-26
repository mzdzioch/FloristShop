package com.builder;

public class Lilac implements Flower {

	private int number;
	private final String colour = "White";
	private final String flower = "Lilac";

	public Lilac(int number) {
		super();
		this.number = number;
	}

	public String getFlower() {
		return flower;
	}

	public String getColour() {
		return colour;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int number) {
		this.number = number;

	}



}
