package NestedIfStatements;

public class main {

    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You have a senior discount of 20%");
                System.out.println("You have a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("You have a student discount of 10%");
                price *= 0.9;
            }
        }
        else {
            if(isSenior){
                System.out.println("You have a senior discount of 20%");
                price *= 0.8;
            }
            else {
                price *= 1; // not necessary
            }
        }
        System.out.printf("The ticket price is: $%.02f", price);
    }
}
