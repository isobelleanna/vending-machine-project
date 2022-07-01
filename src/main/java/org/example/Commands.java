package org.example;

import java.util.Scanner;

public abstract class Commands {
    private final Scanner scanner = new Scanner(System.in);
    private final String name;
    private final String[] commands;

    private String nextCommands;


    public Commands(String name, String[] commands, String nextCommands) {
        this.name = name;
        this.commands = commands;
        this.nextCommands = nextCommands;
    }
    abstract public void run();

    public String getNextCommands() {
        return nextCommands;
    }

    public void setNextCommands(String nextCommands) {
        this.nextCommands = nextCommands;
    }
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printGreeting(){
        printMessage("Welcome to the " + name + " commands.");
    }
    public void printCommands(){
        for (int i = 0; i < commands.length; i++) {
            printMessage((i + 1) +  ": " + commands[i]);
        }
    }
    public double getMoneyInput(){
        boolean isActive = true;
        double input = 0;
        while(isActive){
            printMessage("Enter a your money: ");
            double userInput = scanner.nextDouble();
            if(userInput > 0 ){
                isActive = false;
                input = userInput;
            }else {
                printMessage("Unable to understand input, try again");
            }
        }
        scanner.nextLine();
        return input;
    }
    public int getIntegerInput(){
        boolean isActive = true;
        int input = 0;
        while(isActive){
            printMessage("Enter a number: ");
            int userInput = scanner.nextInt();
            if(userInput > 0 && userInput<= commands.length){
                isActive = false;
                input = userInput;
            }else {
                printMessage("Unable to understand input, try again");
            }
        }
        scanner.nextLine();
        return input;
    }

    public int getRefillInput(){
        boolean isActive = true;
        int input = 0;
        while(isActive){
            printMessage("Enter your refill amount: ");
            int userInput = scanner.nextInt();
            if(userInput > 0 && userInput<= 50){
                isActive = false;
                input = userInput;
            }else {
                printMessage("Unable to understand input, try again");
            }
        }
        scanner.nextLine();
        return input;
    }

    public String getStringInput(){
        boolean isActive = true;
        String input = "";
        while (isActive) {
            printMessage("Enter your code: ");
            String userInput = scanner.nextLine();
            if (userInput.length() != 0) {
                isActive = false;
                input = userInput;
            } else {
                printMessage("Unable to understand input, try again");
            }
        }
        return input;
    }
}
