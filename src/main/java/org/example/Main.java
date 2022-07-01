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
                    currentCommands.run();
                    break;
                case "refill":
                    currentCommands = new RefillCommands();
                    currentCommands.run();
                    break;
                case "stock":
                    currentCommands = new StockCommands();
                    currentCommands.run();
                    break;
                default:
                    isActive = false;
            }
        }
    }
}