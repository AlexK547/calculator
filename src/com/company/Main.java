package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to application \"Calculator in console\"!");
        // Enter number 1
        System.out.print("Enter number 1: ");
        Scanner scanner = new Scanner(System.in);
        String strNumber1 = scanner.nextLine();
        int number1 = Integer.parseInt(strNumber1);

        // Enter number 2
        System.out.print("Enter number 2: ");
        String strNumber2 = scanner.nextLine();
        int number2 = Integer.parseInt(strNumber2);

        // Select action
        System.out.print("Select action +, -, /, *: ");
        String selectAction = scanner.nextLine();

        int result = 0;

        switch (selectAction) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }

        System.out.printf("Result of action \"%s\": %d", selectAction, result);
    }
}
