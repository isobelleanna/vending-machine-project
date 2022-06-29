package org.example;

import java.util.Scanner;

public class Commands {
    private final Scanner scanner = new Scanner(System.in);
    private final String name;
    private final String[] commands;


    public Commands(String name, String[] commands) {
        this.name = name;
        this.commands = commands;

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
    public int getMoneyInput(){
        boolean isActive = true;
        int input = 0;
        while(isActive){
            printMessage("Enter a your money: ");
            int userInput = scanner.nextInt();
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

    public String getStringInput(){
        boolean isActive = true;
        String input = "";
        while (isActive) {
            printMessage("Enter text: ");
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
