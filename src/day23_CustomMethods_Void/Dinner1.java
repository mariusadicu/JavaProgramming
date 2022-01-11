package day23_CustomMethods_Void;

public class Dinner1 {
    /*
    1. create a method that can print odd numbers between 1~100 in a same line saperated by space
     */

    public static void main(String[] args) {

        printOddNumbers();

    }


    public static void printOddNumbers(){

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(" "+i);
            }
        }

    }


}
