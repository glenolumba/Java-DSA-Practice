package RandomCls;

import java.util.Random;

public class main {

    public static void main(String[] args){

        Random random = new Random();

        int number1;
        double number;
        boolean isHeads;



        number1 = random.nextInt(1,101);
        number = random.nextDouble();
        isHeads = random.nextBoolean();


        System.out.println(number1);
        System.out.println(number);

        if(isHeads){
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }

    }
}
