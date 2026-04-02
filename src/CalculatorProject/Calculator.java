package CalculatorProject;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /*
         Simple calculator
         Declare variables
         Get user input
         Prompt user for first number
         Prompt user for operand
         Prompt user for second number
         Display final answer
         */

        Scanner scanner = new Scanner(System.in);

        double num1; // first number
        double num2; // second number
        String operand;// operation

        System.out.print("Enter your first number: ");
        num1 = scanner.nextDouble();
        scanner.nextLine(); // clear input buffer

        System.out.print("Enter your operand (+, -, *, /, ^): ");
        operand = scanner.nextLine();

        System.out.print("Enter your second number: ");
        num2 = scanner.nextDouble();
        scanner.nextLine(); // clear input buffer

        //enhanced switch for possible operations
        switch(operand){

            case "+" -> System.out.printf("%.02f + %.02f = %.02f", num1, num2, num1 + num2);
            case "-" -> System.out.printf("%.02f - %.02f = %.02f", num1, num2, num1 - num2);
            case "*" -> System.out.printf("%.02f * %.02f = %.02f", num1, num2, num1 * num2);
            case "/" -> System.out.printf("%.02f / %.02f = %.02f", num1, num2, num1 / num2);
            case "^" -> System.out.printf("%.02f ^ %.02f = %.02f", num1, num2, Math.pow(num1, num2));
            default -> System.out.println("Invalid operand. Try Again.");

        }




    }

}
