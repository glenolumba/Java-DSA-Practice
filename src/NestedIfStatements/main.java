package NestedIfStatements;

public class main {

    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior;
        double price = 9.99;


        if(isStudent){
            System.out.println("You have a student discount of 10%");
            price *= 0.9;
        }
        else {
            price *= 1;
        }


        System.out.printf("The ticket price is: $%.02f", price);

    }
}
