package com.florist;

import java.math.BigDecimal;

public class Florist {

	  public Florist() {
	    // Set price list
	    PriceList pl = PriceList.getInstance();
	    pl.set("Rose", new BigDecimal(10));
	    pl.set("Freesia", new BigDecimal(12));
	    pl.set("Peony", new BigDecimal(8));
	   
	  }
	  
}
