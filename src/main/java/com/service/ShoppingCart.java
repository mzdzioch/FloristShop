package com.service;

import com.builder.Flower;
import com.florist.PriceList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Flower> shoppingCart = new ArrayList<>();
	private PriceList priceList = PriceList.getInstance();
	private boolean isPaid = false;
	

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public List<Flower> getShoppingCart() {
		return shoppingCart;
	}
	
	public void removeFlowerFromShoppingCart(Flower flower) {
		shoppingCart.remove(flower);
	}

	public BigDecimal calculate(){
		BigDecimal sum = new BigDecimal(0);

		for (Flower flower : shoppingCart) {
			if(priceList.getPriceList().get(flower.getFlower()) != null){
				sum.add(priceList.getPriceList().get(flower.getFlower()).multiply(new BigDecimal(flower.getNumber())));
			}
		}
		return sum;
	}

	public void addFlower(Flower flower) {
		shoppingCart.add(flower);
	}

	public boolean isShoppingCartEmpty() {
		if(shoppingCart.isEmpty())
			return true;
		else
			return false;
	}

	public int numberOfFlowersInCart(){
		return shoppingCart.size();
	}

	public boolean makeCartEmpty(){
		return shoppingCart.removeAll(shoppingCart);
	}

	public void removeFlowersWithEmptyPrice() {

		for (Flower flower : shoppingCart) {
			if (priceList.getPriceList().get(flower.getFlower()).equals(null))
				removeFlowerFromShoppingCart(flower);
		}
	}

	@Override
	public String toString() {
		String text = "";
		for (Flower flower : shoppingCart) {
			text += flower.getFlower() + ", kolor: " + flower.getColour() + ", ilość: " + flower.getNumber() + 
					", cena: "  + priceList.getPriceList().get(flower.getFlower()) + "\n";
		}
		return text;
	}
	
	
	
}
