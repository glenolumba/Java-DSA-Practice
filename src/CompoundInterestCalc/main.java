package CompoundInterestCalc;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        // Compound Interest Program

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int compounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the times it will be compounded in 1 year: ");
        compounded = scanner.nextInt();

        System.out.print("Enter the amount of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/compounded, compounded * years);

        System.out.printf("The amount after %d year/s is $%.02f", years, amount);



        scanner.close();


    }
}
