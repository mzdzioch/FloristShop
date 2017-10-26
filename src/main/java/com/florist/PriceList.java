package com.florist;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//Singleton
public class PriceList {
	
	private Map<String, BigDecimal> priceList = new HashMap<>();
	private static PriceList instance = null;

	PriceList() {
	}
	
	public static PriceList getInstance() {
	
		if(instance == null) {
			instance = new PriceList();
		}
		
		return instance;
	}

	public void set(String flowerName, BigDecimal price) {
		priceList.put(flowerName, price);	
	}

	public Map<String, BigDecimal> getPriceList() {
		return priceList;
	}
	
	
}
