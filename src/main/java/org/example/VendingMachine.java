package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private static final List<Product> vendingMachine = new ArrayList<>();

    static {
        for (int i = 0; i < 2; i++) {
            vendingMachine.add(new CerealBar(getRandomCerealBar(), 1.39));
            vendingMachine.add(new Chocolate(getRandomChocolate(), 0.89));
            vendingMachine.add(new Crisps(getRandomCrisps(), 1.29));
            vendingMachine.add(new Drink(getRandomDrink(), 1.59));
        }
    }

    private static String getRandomCrisps(){
        String[] names = { "Ready Salted",
                "Skips",
                "Monster Munch",
                "Quavers",
                "Doritos",
                "Wotsits",
                "French Fries"
        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    private static String getRandomChocolate(){
        String[] names = { "Mars",
                "Twirl",
                "Kitkat",
                "M&M's",
                "Boost",
        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    private static String getRandomCerealBar(){
        String[] names = { "Frosties",
                "Special K",
                "Nature Valley",
                "Belvita",
                "Brunch Bar",

        };
        int random = (int) (Math.random() * names.length);
        return names[random];
    }

    private static String getRandomDrink(){
        String[] names = { "Diet Coke",
                "Fanta",
                "Pepsi",
                "7Up",
                "Tango",
                "Dr Pepper",
                "Red Bull"
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

    public static double getTotalPrice() {
        double total = 0;
        for (Product item:
             vendingMachine) {
            double price = item.getPrice();
            double stock = item.getStock();
            total += price * stock;
        }
        return  total;
    }
}
