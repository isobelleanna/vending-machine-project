package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private static final List<Product> vendingMachine = new ArrayList<>();

    static {
        for (int i = 0; i < 2; i++) {
            vendingMachine.add(new CerealBar(getRandomCerealBar(), 2));
            vendingMachine.add(new Chocolate(getRandomChocolate(), 1));
            vendingMachine.add(new Crisps(getRandomCrisps(), 2));
            vendingMachine.add(new Drink(getRandomDrink(), 2));
        }
    }
    private static String getRandomCrisps(){
        String[] names = { "Ready Salted",
                "Skips",
                "Monster Munch",
        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    private static String getRandomChocolate(){
        String[] names = { "Mars",
                "Twirl",
                "Kitkat",
        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    private static String getRandomCerealBar(){
        String[] names = { "Frosties",
                "Special K",
                "Nature Valley",
        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    private static String getRandomDrink(){
        String[] names = { "Cola",
                "Fanta",
                "Pepsi",
        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    public static List<Product> getVendingMachine(){
        return vendingMachine;
    }

    public static Product getProductByIndex(int index){
        return vendingMachine.get(index);
    }

}
