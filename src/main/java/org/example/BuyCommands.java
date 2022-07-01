package org.example;

import java.text.DecimalFormat;
import java.util.List;

public class BuyCommands extends Commands{
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");
    public BuyCommands() {
        super("Buy", new String[]{"Buy an Item", "Go back"}, "buy");
    }

    @Override
    public void run() {
        printGreeting();
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            VendingMachine.getVendingMachine().forEach(product -> printMessage(product.toString()));
            String userStringInput = getStringInput();
            int index = Integer.parseInt(userStringInput.substring(0, 1));
            String currentProduct = String.valueOf(VendingMachine.getProductByIndex(index));
            if(!VendingMachine.getProductByIndex(index).isInStock()){
                printMessage("Error your product is out of stock");
                setNextCommands("buy");
            }else {printMessage("You have selected: " + currentProduct);
                double price = VendingMachine.getProductByIndex(index).getPrice();
                double usersCash = getMoneyInput();
                double total = usersCash - price;
                printMessage("Your Change is £" + dfZero.format(total));
                VendingMachine.getProductByIndex(index).buyProduct();
                String updatedCurrentProduct = String.valueOf(VendingMachine.getProductByIndex(index));
                printMessage(updatedCurrentProduct);}

        } else {
            setNextCommands("home");
        }


    }

    }

