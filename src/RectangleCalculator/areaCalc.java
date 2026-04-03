package RectangleCalculator;

import java.util.Scanner;

public class areaCalc {

    public static void main(String[] args){

        /*
        Area of Rectangle Program
        Declare Variables
        Prompt user for length
        Prompt user for width
        Get and display area
         */

        Scanner scanner = new Scanner(System.in);

        double length;
        double width;
        double area;

        System.out.println("Calculate your area!");

        System.out.print("Enter your length: ");
        length = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        area = length * width;

        System.out.printf("Your rectangle's area is %.02f units squared.", area);



    }
}
