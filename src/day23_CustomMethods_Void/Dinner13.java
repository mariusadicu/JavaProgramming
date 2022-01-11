package day23_CustomMethods_Void;

public class Dinner13 {

    /*
    13. create a method named printEachChar that can print each characters of a string
     */

    public static void main(String[] args) {

     printEachChar("JAVA");

    }

    public static void printEachChar(String word){

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " ");
        }


    }



}
