package StringMethods;

public class Main {

    public static void main(String args[]){

        String name = "Bro";

        // charAt() - gets character first character (index 0)
        char result = name.charAt(0);
        System.out.println(result);

        // equals() - boolean that checks if String input is equal to another
        boolean result1 = name.equals("Bro");
        System.out.println(result1);

        /*
         equalsIgnoreCase() - boolean that checks if String input is equal to
                              another while ignoring capitalization
         */
        boolean result2 = name.equalsIgnoreCase("bro");
        System.out.println(result2);

        // indexOf() - gets index of specified character
        int result3 = name.indexOf("o");
        System.out.println(result3);

        // isEmpty() - checks whether or not a String is empty
        boolean result4 = name.isEmpty();
        System.out.println(result4);

        // length() - checks the length of a String
        int result5 = name.length();
        System.out.println(result5);

        // replace() - replace specified character with another
        String result6 = name.replace("o", "b");
        System.out.println(result6);

        // toLowerCase() - changes all uppercase letters to lowercase
        String result7 = name.toLowerCase();
        System.out.println(result7);

        // toUpperCase() - changes all lowercase letters to uppercase
        String result8 = name.toUpperCase();
        System.out.println(result8);

        // trim() - trims any white space
        String name2 = "     Bro    ";
        String result9 = name2.trim();
        System.out.println(result9);

    }
}
