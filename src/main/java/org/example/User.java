package org.example;

import java.util.Scanner;

public class User {
    private final Scanner scanner = new Scanner(System.in);
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public int getIntegerInput(){
        int input = 0;
        printMessage("Enter a number: ");
        int userInput = scanner.nextInt();
        input = userInput;
        scanner.nextLine();
        return input;
    }
}
