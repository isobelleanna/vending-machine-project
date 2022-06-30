package org.example;

public class HomeCommands extends Commands{
    public HomeCommands() {
        super("Home", new String[]{"Buy", "Refill", "Stock", "Quit"}, "home");
    }

    @Override
    public void run() {
        printGreeting();
        printCommands();
        int userInput = getIntegerInput();

        if(userInput == 1) {
            setNextCommands("buy");
        } else if (userInput == 2) {
            setNextCommands("refill");
        } else if (userInput == 3) {
            setNextCommands("stock");
        }else {
            setNextCommands("");
        }

    }
}
