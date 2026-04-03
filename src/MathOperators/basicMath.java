package MathOperators;

public class basicMath {

    public static void main(String[] args){

        /*
        Math operators and methods
         */

        int a = 3;
        int b = 4;
        int c = 5;

        // addition
        System.out.println("ADD: " + a + b);

        // subtraction
        System.out.println("SUB: " + (a - b));

        // multiplication
        System.out.println("MUL: " + a * b);

        // exponent
        System.out.println("POW: " + Math.pow(b, a));

        // modulus
        System.out.println("MOD: " + c % a);

        //increment
        a++;
        System.out.println("INC: " + a);

        //decrement
        b--;
        System.out.println("DEC: " + b);


    }
}
