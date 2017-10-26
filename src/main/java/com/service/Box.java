package com.service;

import com.builder.Flower;

import java.util.ArrayList;
import java.util.List;

public class Box {
	Customer customer;
	private List<Flower> box = new ArrayList<>();
	
	public Box(Customer customer) {
		super();
		this.customer = customer;
	} 

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Flower> getBox() {
		return box;
	}

	public void setBox(List<Flower> box) {
		this.box = box;
	}
	
	public void putShoppingCartToBox(List<Flower> box) {
		this.box.addAll(box);
	}
	
	@Override
	public String toString() {
		String text = "";
		for (Flower flower : box) {
			text += flower.getFlower() + ", kolor: " + flower.getColour() + ", ilość: " + flower.getNumber() + "\n";
		}
		return text;
	}
}
