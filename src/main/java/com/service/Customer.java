package com.service;

import com.builder.Flower;

import java.math.BigDecimal;

public class Customer {

    private String name;
    private BigDecimal cash;
    private ShoppingCart shoppingCart;

    public Customer(String name, BigDecimal cash) {
        super();
        this.name = name;
        this.cash = cash;
        this.shoppingCart = new ShoppingCart();
        System.out.println("Wozek wlasciciel " + this.name);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }


    public void get(Flower flower) {
        shoppingCart.addFlower(flower);
    }

    public boolean pay() {
        BigDecimal total = totalShoppingCart();

        if (shoppingCart.isShoppingCartEmpty())
            return false;

        else if (shoppingCart.isPaid())
            return false;

        else if (getCash().compareTo(total) >= 0) {
            setCash(getCash().subtract(total));
            shoppingCart.setPaid(true);
            return true;
        } else if (removeFlower()) {
            pay();
        }
        return false;

    }


    public BigDecimal totalShoppingCart() {
        shoppingCart.removeFlowersWithEmptyPrice();

        return shoppingCart.calculate();
    }


    public void pack(Box box) {
        box.putShoppingCartToBox(shoppingCart.getShoppingCart());
        shoppingCart.makeCartEmpty();
    }

    public boolean removeFlower() {
        int i = shoppingCart.numberOfFlowersInCart();

        if (i > 0) {
            shoppingCart.getShoppingCart().remove(i - 1);
            return true;
        } else {
            return false;
        }
    }
}
