package com.builder;

public class FlowerBuilder {

    public static Flower buildFlower(FlowerType flowerType, int number) {
        if(flowerType.equals(FlowerType.FREESIA)) {
            return new Freesia(number);

        } else if(flowerType.equals(FlowerType.LILAC)) {
            return new Lilac(number);

        } else if(flowerType.equals(FlowerType.PEONY)) {
            return new Peony(number);

        } else if(flowerType.equals(FlowerType.ROSE)) {
            return new Rose(number);
        } else
            return null;

    }
}
