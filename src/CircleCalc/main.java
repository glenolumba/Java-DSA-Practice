package CircleCalc;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = Math.PI * radius * 2;
        area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The circumference is %.02fcm\n", circumference);

        System.out.printf("The area is %.02fcm squared", area);

    }
}
