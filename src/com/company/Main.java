package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the first number to be calculated: ");
        Scanner scanner = new Scanner(System.in);
        Double operand1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number to be calculated: ");
        Double operand2 = Double.parseDouble(scanner.nextLine());
        double sum = operand1 + operand2;
        double divide = operand1 / operand2;
        double multiply = operand1 * operand2;
        double subtract = operand1 - operand2;
        double remainder = operand1 % operand2;
        showResults(sum, subtract, divide, multiply, remainder);
    }

    public static void showResults(double sum, double subtract, double divide, double multiply, double remainder) {
        System.out.println("both numbers added = " + sum);
        System.out.println("both numbers subtracted = " + subtract);
        System.out.println("both numbers divided = " + divide);
        System.out.println("both numbers multiplied = " + multiply);
        System.out.println("the remainder from the division of both numbers = " + remainder);

    }
}