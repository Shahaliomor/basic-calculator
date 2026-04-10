package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = input.nextFloat();

        // Ask for operation
        System.out.print("Choose operation (add, subtract, multiply, divide): ");
        String operation = input.next();

        // ALWAYS multiply (as instructed)
        float result = num1 * num2;

        // Print result
        System.out.println("Result is: " + result);
    }
}
