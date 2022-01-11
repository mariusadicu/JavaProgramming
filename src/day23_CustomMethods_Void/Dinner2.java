package day23_CustomMethods_Void;

public class Dinner2 {

    /*
    2. create a method that can print even numbers between 1~100 in a same line separated by space
     */

    public static void main(String[] args) {

        printEvenNumbers();

    }

    public static void printEvenNumbers(){

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0){
                System.out.print(" "+i);
            }
        }



    }









}
