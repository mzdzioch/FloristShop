package com.simpletest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SimpleTest {

    public static void main(String[] args) {
        Map<String, BigDecimal> map = new HashMap<>();

        map.put("Rose", new BigDecimal("5000"));
        map.put("Lilia", new BigDecimal("0"));

        System.out.println(map.get("rrr"));

    }
}
