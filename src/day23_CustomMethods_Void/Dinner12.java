package day23_CustomMethods_Void;

public class Dinner12 {

    /*
    12. create a method that can if the given integer is positive, negative or zero
     */

    public static void main(String[] args) {

        integerIs(69);

    }

    public static void integerIs(int number){

        if (number > 0 ){
            System.out.println("Positive");
        }else if (number < 0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

    }




}
