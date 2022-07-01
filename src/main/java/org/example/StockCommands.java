package org.example;

public class StockCommands extends Commands{
    public StockCommands() {
        super("Stock", new String[]{"Stock Take", "Go Back"} , "stock");
    }

    @Override
    public void run() {
        printGreeting();
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            VendingMachine.getVendingMachine().forEach(product -> printMessage(product.toString()));
            double total = VendingMachine.getTotalPrice();
            printMessage("Total value of Stock: £" + total);
        }else {
            setNextCommands("home");
        }

    }
}
