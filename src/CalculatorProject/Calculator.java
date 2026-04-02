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
        char calcAgain = ' ';
        String operand;// operation (+, -, *, /, ^)

        // Use do-while loop so user can perform multiple calculations
        do{
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

                case "+" -> System.out.printf("%.02f + %.02f = %.02f\n", num1, num2, num1 + num2);
                case "-" -> System.out.printf("%.02f - %.02f = %.02f\n", num1, num2, num1 - num2);
                case "*" -> System.out.printf("%.02f * %.02f = %.02f\n", num1, num2, num1 * num2);
                case "/" -> {
                    // undefined safety net
                    if(num2 == 0){
                        System.out.println("Cannot divide by 0. Undefined.\n");
                    }
                    else{
                        System.out.printf("%.02f / %.02f = %.02f\n", num1, num2, num1 / num2);
                    }
                }
                case "^" -> System.out.printf("%.02f ^ %.02f = %.02f\n", num1, num2, Math.pow(num1, num2));
                default -> System.out.println("Invalid operand. Try Again.\n");

            }

            do{
                //ask user if they would like to make a new calculation
                System.out.print("Make another calculation? (Y/N): ");
                calcAgain = scanner.nextLine().toUpperCase().charAt(0);

                // validate user input
                if(calcAgain != 'Y' && calcAgain != 'N'){
                    System.out.println("Please enter Y or N.");
                }

            } while(calcAgain != 'Y' && calcAgain != 'N');

        } while(calcAgain == 'Y');

    }

}
