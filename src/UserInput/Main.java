package UserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();


        scanner.close();
    }
}
