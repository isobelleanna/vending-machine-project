package org.example;

public class RefillCommands extends Commands{
    public RefillCommands() {
        super("Refill", new String[]{"Refill an Item", "Go Back"}, "refill");
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
            printMessage("You have selected: " + currentProduct);
            int currentStock = VendingMachine.getProductByIndex(index).getStock();
            int refillInput = getRefillInput();
            VendingMachine.getProductByIndex(index).setStock(refillInput + currentStock);
            String updatedCurrentProduct = String.valueOf(VendingMachine.getProductByIndex(index));
            printMessage(updatedCurrentProduct);
        } else {
            setNextCommands("home");
        }

    }
}
