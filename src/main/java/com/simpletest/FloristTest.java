package com.simpletest;

import com.builder.*;
import com.service.Box;
import com.service.Customer;
import com.florist.Florist;
import com.service.ShoppingCart;

import java.math.BigDecimal;

public class FloristTest {

	  // tu definicja metody valueOf(com.service.Box pudelko, String kolor) zwracającej
	  // sumaryczną wartość kwiatów o podanym kolorzez, znajdujących się w pudełku
	private int value;
	private int valueOf(Box pudelko, String kolor) {
		
		return value;
	}

	  public static void main(String[] args)  {

	    // Kwiaciarnia samoobsługowa
	    Florist kwiaciarnia = new Florist();

	    // Przychodzi klient janek. Ma 200 zł
	    Customer janek = new Customer("Janek", new BigDecimal(200));

	    // Bierze różne kwiaty: 5 róż, 5 piwonii, 3 frezje, 3 bzy
	    janek.get(FlowerBuilder.buildFlower(FlowerType.ROSE, 5));
	    janek.get(FlowerBuilder.buildFlower(FlowerType.PEONY, 5));
	    janek.get(FlowerBuilder.buildFlower(FlowerType.FREESIA, 3));
	    janek.get(FlowerBuilder.buildFlower(FlowerType.LILAC, 3));

	    // Pewnie je umieścił na wózku sklepowyem
	    // Zobaczmy co tam ma
	    ShoppingCart wozekJanka = janek.getShoppingCart();
	    System.out.println("Przed płaceniem\n" + wozekJanka);
	    janek.checkEmptyPrice(wozekJanka);

	    // Teraz za to zapłaci...
	    janek.pay();

	    // Czy przypadkiem przy płaceniu nie okazało się,
	    // że w wozku są kwiaty na które nie ustalono jescze cceny?
	    // W takim razie zostałyby usunięte z wózka i Janek nie płaciłby za nie

	    System.out.println("Po zapłaceniu\n" + janek.getShoppingCart());

	    // Ile Jankowi zostało pieniędzy?
	    System.out.println("Jankowi zostało : " + janek.getCash() + " zł");

	    // Teraz jakos zapakuje kwiaty (może do pudełka)
	    Box pudelkoJanka = new Box(janek);
	    janek.pack(pudelkoJanka);

	    // Co jest teraz w wózku Janka...
	    // (nie powinno już nic być)
	    System.out.println("Po zapakowaniu do pudełka:\n" + janek.getShoppingCart());

	    // a co w pudełku:
	    System.out.println("A w pudełku jest: \n" + pudelkoJanka);

	    // Zobaczmy jaka jest wartość czerwonych kwiatów w pudełku Janka
	    //System.out.println("Czerwone kwiaty w pudełku Janka kosztowały: " +
	    //                    valueOf(pudelkoJanka, "czerwony") );

	    // Teraz przychodzi Stefan
	    // ma tylko 60 zł
	    Customer stefan = new Customer("Stefan", new BigDecimal(10));

	    // ąle nabrał kwiatów nieco za dużo jak na tę sumę
	    stefan.get(new Lilac(3));
	    stefan.get(new Rose(5));

	    // co ma w wózku
	    System.out.println(stefan.getShoppingCart());

	    // płaci i pakuje do pudełka
	    stefan.pay();
	    Box pudelkoStefana = new Box(stefan);
	    stefan.pack(pudelkoStefana);

	    // co ostatecznie udało mu się kupić
	    System.out.println(pudelkoStefana);
	    // ... i ile zostało mu pieniędzy
	    System.out.println("Stefanowi zostało : " + stefan.getCash() + " zł");
	  }
	}

//	Program powinien wyprowadzić następujące wyniki:
//
//	Przed placeniem
//	Wózek własciciel Janek
//	róża, kolor: czerwony, ilość 5, cena 10.0
//	piwonia, kolor: czerwony, ilość 5, cena 8.0
//	frezja, kolor: żółty, ilość 3, cena -1.0
//	bez, kolor: biały, ilość 3, cena 12.0
//	Po zaplaceniu
//	Wózek własciciel Janek
//	róża, kolor: czerwony, ilość 5, cena 10.0
//	piwonia, kolor: czerwony, ilość 5, cena 8.0
//	bez, kolor: biały, ilość 3, cena 12.0
//	Jankowi zostało : 74.0 zł
//	Po zapakowaniu do pudełka
//	Wózek własciciel Janek -- pusto
//	Pudełko własciciel Janek
//	bez, kolor: biały, ilość 3, cena 12.0
//	piwonia, kolor: czerwony, ilość 5, cena 8.0
//	róża, kolor: czerwony, ilość 5, cena 10.0
//	Czerwone kwiaty w pudełku Janka kosztowały: 90.0
//	Wózek własciciel Stefan
//	bez, kolor: biały, ilość 3, cena 12.0
//	róża, kolor: czerwony, ilość 5, cena 10.0
//	Pudełko własciciel Stefan
//	róża, kolor: czerwony, ilość 5, cena 10.0
//	Stefanowi zostało : 10.0 zł

