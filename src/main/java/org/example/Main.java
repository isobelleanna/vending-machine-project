package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(VendingMachine.getProductByIndex(0));
        System.out.println(VendingMachine.getVendingMachine());
        HomeCommands homeCommands = new HomeCommands();
        Commands currentCommands = homeCommands;
        boolean isActive = true;
        while(isActive){
            switch(currentCommands.getNextCommands()){
                case "home":
                    currentCommands = new HomeCommands();
                    currentCommands.run();
                    break;
                case "buy":
                    currentCommands = new BuyCommands();
                    System.out.println("buy");
                    isActive = false;
                    break;
                case "refill":
                    currentCommands = new RefillCommands();
                    System.out.println("refill");
                    isActive = false;
                    break;
                case "stock":
                    currentCommands = new StockCommands();
                    System.out.println("Stock");
                    isActive = false;
                    break;
                default:
                    isActive = false;
            }
        }
    }
}