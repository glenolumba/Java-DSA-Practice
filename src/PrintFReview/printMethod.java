package PrintFReview;

public class printMethod {

    public static void main (String[] args){

        // List of different printf methods


        String car = "Honda";
        char symbol = '$';
        int year = 2022;
        double amount = 21456.01;
        boolean isRunning = true;

        System.out.printf("The car make is %s.\n", car);
        System.out.printf("The %s costs %c%.02f.\n", car, symbol, amount);
        System.out.printf("The %s's year is %d.\n", car, year);
        System.out.printf("The car is running: %b.\n", isRunning);



    }
}
